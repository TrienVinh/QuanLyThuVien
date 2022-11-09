package DAO;

import DTO.DTO_NgonNgu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_NgonNgu {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_NgonNgu> LayDanhSach() {
        ArrayList<DTO_NgonNgu> DanhSachNgonNgu = new ArrayList<>();
        String TruyVan = "Select MaNgonNgu, TenNgonNgu From NgonNgu Where TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_NgonNgu NgonNgu = new DTO_NgonNgu();
                NgonNgu.setMaNgonNgu(ResultSet.getString("MaNgonNgu"));
                NgonNgu.setTenNgonNgu(ResultSet.getString("TenNgonNgu"));
                DanhSachNgonNgu.add(NgonNgu);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách ngôn ngữ không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachNgonNgu;
    }

    public Boolean CapNhat(DTO_NgonNgu NgonNgu) {
        String TruyVan = "Update NgonNgu Set TenNgonNgu = ? Where MaNgonNgu = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NgonNgu.getTenNgonNgu());
            PreparedStatement.setString(2, NgonNgu.getMaNgonNgu());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Cập nhật ngôn ngữ không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Them(DTO_NgonNgu NgonNgu) {
        String TruyVan = "Insert Into NgonNgu(MaNgonNgu, TenNgonNgu, TrangThai) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NgonNgu.getMaNgonNgu());
            PreparedStatement.setString(2, NgonNgu.getTenNgonNgu());
            PreparedStatement.setBoolean(3, NgonNgu.getTrangThai());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm ngôn ngữ không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Xoa(DTO_NgonNgu NgonNgu) {
        String TruyVan = "Update NgonNgu Set TrangThai = ? Where MaNgonNgu = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, NgonNgu.getTrangThai());
            PreparedStatement.setString(2, NgonNgu.getMaNgonNgu());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Xóa ngôn ngữ không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public DTO_NgonNgu LayTenTheoMa(String MaNgonNgu) {
        DTO_NgonNgu NgonNgu = new DTO_NgonNgu();
        String TruyVan = "Select TenNgonNgu From NgonNgu Where MaNgonNgu ='" + MaNgonNgu + "' And TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                NgonNgu.setTenNgonNgu(ResultSet.getString("TenNgonNgu"));
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy tên ngôn ngữ không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return NgonNgu;
    }

    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachNgonNgu = 0;
        String TruyVan = "Select MaNgonNgu From NgonNgu";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachNgonNgu++;
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách ngôn ngữ không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachNgonNgu;
    }

}
