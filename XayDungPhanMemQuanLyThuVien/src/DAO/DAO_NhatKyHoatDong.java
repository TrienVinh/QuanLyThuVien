package DAO;

import DTO.DTO_NhatKyHoatDong;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_NhatKyHoatDong {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_NhatKyHoatDong> LayDanhSach() {
        ArrayList<DTO_NhatKyHoatDong> DanhSachNhatKyHoatDong = new ArrayList<>();
        String CauTruyVan = "Select * From NhatKyHoatDong";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(CauTruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_NhatKyHoatDong NhatKyHoatDong = new DTO_NhatKyHoatDong();
                String MaNhanVien = ResultSet.getString("MaNhanVien");
                NhatKyHoatDong.setMaNhanVien(MaNhanVien);
                String HoatDong = ResultSet.getString("HoatDong");
                NhatKyHoatDong.setHoatDong(HoatDong);
                Timestamp ThoiGian = ResultSet.getTimestamp("ThoiGian");
                NhatKyHoatDong.setThoiGian(ThoiGian);
                DanhSachNhatKyHoatDong.add(NhatKyHoatDong);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách nhật ký hoạt động không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachNhatKyHoatDong;
    }

    public Boolean Them(DTO_NhatKyHoatDong NhatKyHoatDong) {
        String CauTruyVan = "Insert Into NhatKyHoatDong(MaPhieuNhap, MaNhanVien, DonGia, SoLuongSach) Values(?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(CauTruyVan);
            String MaNhanVien = NhatKyHoatDong.getMaNhanVien();
            PreparedStatement.setString(1, MaNhanVien);
            String HoatDong = NhatKyHoatDong.getHoatDong();
            PreparedStatement.setString(2, HoatDong);
            Timestamp ThoiGian = NhatKyHoatDong.getThoiGian();
            PreparedStatement.setTimestamp(3, ThoiGian);
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm nhật ký hoạt động không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
