package DAO;

import DTO.DTO_NhatKyHoatDong;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_NhatKyHoatDong {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_NhatKyHoatDong> LayDanhSach() {
        ArrayList<DTO_NhatKyHoatDong> DanhSachNhatKyHoatDong = new ArrayList<>();
        String TruyVan = "Select MaNhanVien, HoatDong, ThoiGian From NhatKyHoatDong";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_NhatKyHoatDong NhatKyHoatDong = new DTO_NhatKyHoatDong();
                NhatKyHoatDong.setMaNhanVien(ResultSet.getString("MaNhatKyHoatDong"));
                NhatKyHoatDong.setHoatDong(ResultSet.getString("TenNhatKyHoatDong"));
                NhatKyHoatDong.setThoiGian(ResultSet.getTimestamp("ThoiGian"));
                DanhSachNhatKyHoatDong.add(NhatKyHoatDong);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách nhật ký hoạt động không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachNhatKyHoatDong;
    }

    public Boolean Them(DTO_NhatKyHoatDong NhatKyHoatDong) {
        String TruyVan = "Insert Into NhatKyHoatDong(MaNhanVien, HoatDong, ThoiGian) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NhatKyHoatDong.getMaNhanVien());
            PreparedStatement.setString(2, NhatKyHoatDong.getHoatDong());
            PreparedStatement.setTimestamp(3, NhatKyHoatDong.getThoiGian());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm nhật ký hoạt động không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
