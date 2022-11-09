package DAO;

import DTO.DTO_NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_NhanVien {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_NhanVien> LayDanhSach() {
        ArrayList<DTO_NhanVien> DanhSachNhanVien = new ArrayList<>();
        String TruyVan = "Select MaNhanVien, TenNhanVien, SoDienThoai, NgaySinh From NhanVien Where TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_NhanVien NhanVien = new DTO_NhanVien();
                NhanVien.setMaNhanVien(ResultSet.getString("MaNhanVien"));
                NhanVien.setTenNhanVien(ResultSet.getString("TenNhanVien"));
                NhanVien.setSoDienThoai(ResultSet.getString("SoDienThoai"));
                NhanVien.setNgaySinh(ResultSet.getDate("NgaySinh"));
                DanhSachNhanVien.add(NhanVien);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachNhanVien;
    }

    public Boolean CapNhat(DTO_NhanVien NhanVien) {
        String TruyVan = "Update NhanVien Set TenNhanVien = ?, SoDienThoai = ?, NgaySinh = ? Where MaNhanVien = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NhanVien.getTenNhanVien());
            PreparedStatement.setString(2, NhanVien.getSoDienThoai());
            PreparedStatement.setDate(3, NhanVien.getNgaySinh());
            PreparedStatement.setString(4, NhanVien.getMaNhanVien());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Cập nhật nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Them(DTO_NhanVien NhanVien) {
        String TruyVan = "Insert Into NhanVien(MaNhanVien, TenNhanVien, SoDienThoai, NgaySinh, TrangThai) Values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NhanVien.getMaNhanVien());
            PreparedStatement.setString(2, NhanVien.getTenNhanVien());
            PreparedStatement.setString(3, NhanVien.getSoDienThoai());
            PreparedStatement.setDate(4, NhanVien.getNgaySinh());
            PreparedStatement.setBoolean(5, NhanVien.getTrangThai());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Xoa(DTO_NhanVien NhanVien) {
        String TruyVan = "Update NhanVien Set TrangThai = ? Where MaNhanVien = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, NhanVien.getTrangThai());
            PreparedStatement.setString(2, NhanVien.getMaNhanVien());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Xóa nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public DTO_NhanVien LayTenTheoMa(String MaNhanVien) {
        DTO_NhanVien NhanVien = new DTO_NhanVien();
        String TruyVan = "Select TenNhanVien From NhanVien Where MaNhanVien ='" + MaNhanVien + "' And TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                NhanVien.setTenNhanVien(ResultSet.getString("TenNhanVien"));
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy tên nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return NhanVien;
    }

}
