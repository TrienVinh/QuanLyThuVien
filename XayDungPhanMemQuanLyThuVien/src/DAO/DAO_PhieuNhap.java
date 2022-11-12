package DAO;

import DTO.DTO_PhieuNhap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_PhieuNhap {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_PhieuNhap> LayDanhSach() {
        ArrayList<DTO_PhieuNhap> DanhSachPhieuNhap = new ArrayList<>();
        String TruyVan = "Select MaPhieuNhap, MaNhaXuatBan, MaNhanVien, ThoiGian, TongTien From PhieuNhap";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_PhieuNhap PhieuNhap = new DTO_PhieuNhap();
                PhieuNhap.setMaPhieuNhap(ResultSet.getString("MaPhieuNhap"));
                PhieuNhap.setMaNhaXuatBan(ResultSet.getString("MaNhaXuatBan"));
                PhieuNhap.setMaNhanVien(ResultSet.getString("MaNhanVien"));
                PhieuNhap.setThoiGian(ResultSet.getTimestamp("ThoiGian"));
                PhieuNhap.setTongTien(ResultSet.getDouble("TongTien"));
                DanhSachPhieuNhap.add(PhieuNhap);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách phiếu mượn không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachPhieuNhap;
    }

    public Boolean Them(DTO_PhieuNhap PhieuNhap) {
        String TruyVan = "Insert Doubleo PhieuNhap(MaPhieuNhap, MaNhaXuatBan, MaNhanVien, ThoiGian, TongTien) Values(?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, PhieuNhap.getMaPhieuNhap());
            PreparedStatement.setString(2, PhieuNhap.getMaNhaXuatBan());
            PreparedStatement.setString(3, PhieuNhap.getMaNhanVien());
            PreparedStatement.setTimestamp(4, PhieuNhap.getThoiGian());
            PreparedStatement.setDouble(5, PhieuNhap.getTongTien());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm phiếu mượn không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Integer LayChieuDaiDanhSach() {
         Integer ChieuDaiDanhSachPhieuNhap = 0;
        String TruyVan = "Select MaPhieuNhap From PhieuNhap";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachPhieuNhap++;
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy chiều dài danh sách phiếu mượn không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachPhieuNhap;
    }

}
