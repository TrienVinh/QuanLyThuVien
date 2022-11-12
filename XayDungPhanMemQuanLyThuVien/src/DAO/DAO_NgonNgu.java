package DAO;

import DTO.DTO_NgonNgu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_NgonNgu {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private PreparedStatement PreparedStatement = null;
    private ResultSet ResultSet = null;

    public ArrayList<DTO_NgonNgu> LayDanhSach() {
        ArrayList<DTO_NgonNgu> DanhSachNgonNgu = new ArrayList<>();
        String TruyVan = "Select MaNgonNgu, TenNgonNgu, From NgonNgu Where TonTai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_NgonNgu NgonNgu = new DTO_NgonNgu();
                NgonNgu.setMaNgonNgu(ResultSet.getString("MaNgonNgu"));
                NgonNgu.setTenNgonNgu(ResultSet.getString("TenNgonNgu"));
                DanhSachNgonNgu.add(NgonNgu);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách ngôn ngữ không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachNgonNgu;
    }

    public Boolean CapNhat(DTO_NgonNgu NgonNgu) {
        String TruyVan = "Update NgonNgu Set TenNgonNgu = ?, Where MaNgonNgu = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NgonNgu.getTenNgonNgu());
            PreparedStatement.setString(2, NgonNgu.getMaNgonNgu());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Cập nhật ngôn ngữ không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Them(DTO_NgonNgu NgonNgu) {
        String TruyVan = "Insert Into NgonNgu(MaNgonNgu, TenNgonNgu, TonTai) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NgonNgu.getMaNgonNgu());
            PreparedStatement.setString(2, NgonNgu.getTenNgonNgu());
            PreparedStatement.setBoolean(3, NgonNgu.getTonTai());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm ngôn ngữ không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Xoa(DTO_NgonNgu NgonNgu) {
        String TruyVan = "Update NgonNgu Set TonTai = ? Where MaNgonNgu = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, NgonNgu.getTonTai());
            PreparedStatement.setString(2, NgonNgu.getMaNgonNgu());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Xóa ngôn ngữ không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public DTO_NgonNgu LayTenTheoMa(String MaNgonNgu) {
        DTO_NgonNgu NgonNgu = new DTO_NgonNgu();
        String TruyVan = "Select TenNgonNgu, TonTai From NgonNgu Where MaNgonNgu ='" + MaNgonNgu + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                NgonNgu.setTenNgonNgu(ResultSet.getString("TenNgonNgu"));
                NgonNgu.setTonTai(ResultSet.getBoolean("TonTai"));
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
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
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy chiều dài danh sách ngôn ngữ không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachNgonNgu;
    }

}
