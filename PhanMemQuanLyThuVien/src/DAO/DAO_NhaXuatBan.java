package DAO;

import DTO.DTO_NhaXuatBan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_NhaXuatBan {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_NhaXuatBan> LayDanhSach() {
        ArrayList<DTO_NhaXuatBan> DanhSachNhaXuatBan = new ArrayList<>();
        String TruyVan = "Select MaNhaXuatBan, TenNhaXuatBan From NhaXuatBan Where TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_NhaXuatBan NhaXuatBan = new DTO_NhaXuatBan();
                NhaXuatBan.setMaNhaXuatBan(ResultSet.getString("MaNhaXuatBan"));
                NhaXuatBan.setTenNhaXuatBan(ResultSet.getString("TenNhaXuatBan"));
                DanhSachNhaXuatBan.add(NhaXuatBan);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachNhaXuatBan;
    }

    public Boolean CapNhat(DTO_NhaXuatBan NhaXuatBan) {
        String TruyVan = "Update NhaXuatBan Set TenNhaXuatBan = ? Where MaNhaXuatBan = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NhaXuatBan.getTenNhaXuatBan());
            PreparedStatement.setString(2, NhaXuatBan.getMaNhaXuatBan());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Cập nhật nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Them(DTO_NhaXuatBan NhaXuatBan) {
        String TruyVan = "Insert Into NhaXuatBan(MaNhaXuatBan, TenNhaXuatBan, TrangThai) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NhaXuatBan.getMaNhaXuatBan());
            PreparedStatement.setString(2, NhaXuatBan.getTenNhaXuatBan());
            PreparedStatement.setBoolean(3, NhaXuatBan.getTrangThai());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Xoa(DTO_NhaXuatBan NhaXuatBan) {
        String TruyVan = "Update NhaXuatBan Set TrangThai = ? Where MaNhaXuatBan = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, NhaXuatBan.getTrangThai());
            PreparedStatement.setString(2, NhaXuatBan.getMaNhaXuatBan());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Xóa nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public DTO_NhaXuatBan LayTenTheoMa(String MaNhaXuatBan) {
        DTO_NhaXuatBan NhaXuatBan = new DTO_NhaXuatBan();
        String TruyVan = "Select TenNhaXuatBan From NhaXuatBan Where MaNhaXuatBan ='" + MaNhaXuatBan + "' And TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                NhaXuatBan.setTenNhaXuatBan(ResultSet.getString("TenNhaXuatBan"));
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy tên nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return NhaXuatBan;
    }

    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachNhaXuatBan = 0;
        String TruyVan = "Select MaNhaXuatBan From NhaXuatBan";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachNhaXuatBan++;
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachNhaXuatBan;
    }

}
