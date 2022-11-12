package DAO;

import DTO.DTO_NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_NhanVien {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private PreparedStatement PreparedStatement = null;
    private ResultSet ResultSet = null;

    public ArrayList<DTO_NhanVien> LayDanhSach() {
        ArrayList<DTO_NhanVien> DanhSachNhanVien = new ArrayList<>();
        String TruyVan = "Select MaNhanVien, TenNhanVien, SoDienThoai, NgayDangKy From NhanVien Where TonTai = true";
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
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachNhanVien;
    }

    public Boolean CapNhat(DTO_NhanVien NhanVien) {
        String TruyVan = "Update NhanVien Set TenNhanVien = ?, SoDienThoai = ? Where MaNhanVien = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NhanVien.getTenNhanVien());
            PreparedStatement.setString(2, NhanVien.getSoDienThoai());
            PreparedStatement.setString(3, NhanVien.getMaNhanVien());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Cập nhật nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Them(DTO_NhanVien NhanVien) {
        String TruyVan = "Insert Into NhanVien(MaNhanVien, TenNhanVien, SoDienThoai, NgaySinh, TonTai) Values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NhanVien.getMaNhanVien());
            PreparedStatement.setString(2, NhanVien.getTenNhanVien());
            PreparedStatement.setString(3, NhanVien.getSoDienThoai());
            PreparedStatement.setDate(4, NhanVien.getNgaySinh());
            PreparedStatement.setBoolean(5, NhanVien.getTonTai());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Xoa(DTO_NhanVien NhanVien) {
        String TruyVan = "Update NhanVien Set TonTai = ? Where MaNhanVien = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, NhanVien.getTonTai());
            PreparedStatement.setString(2, NhanVien.getMaNhanVien());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Xóa nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }
    
    public DTO_NhanVien LayTenTheoMa(String MaNhanVien) {
        DTO_NhanVien NhanVien = new DTO_NhanVien();
        String TruyVan = "Select TenNhanVien, TonTai From NhanVien Where MaNhanVien ='" + MaNhanVien + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                NhanVien.setTenNhanVien(ResultSet.getString("TenNhanVien"));
                NhanVien.setTonTai(ResultSet.getBoolean("TonTai"));
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy tên nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return NhanVien;
    }

    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachNhanVien = 0;
        String TruyVan = "Select MaNhanVien From NhanVien";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachNhanVien++;
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy chiều dài danh sách nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachNhanVien;
    }

}
