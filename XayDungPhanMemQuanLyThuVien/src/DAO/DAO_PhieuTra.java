package DAO;

import DTO.DTO_PhieuTra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_PhieuTra {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    //Lấy danh sách phiếu trả
    public ArrayList<DTO_PhieuTra> LayDanhSach() {
        ArrayList<DTO_PhieuTra> DanhSachPhieuTra = new ArrayList<>();
        String TruyVan = "Select MaPhieuTra, MaPhieuMuon, MaNhanVien, ThoiGian, TongSach From PhieuTra";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_PhieuTra PhieuTra = new DTO_PhieuTra();
                PhieuTra.setMaPhieuTra(ResultSet.getString("MaPhieuTra"));
                PhieuTra.setMaPhieuMuon(ResultSet.getString("MaPhieuMuon"));
                PhieuTra.setMaNhanVien(ResultSet.getString("MaNhanVien"));
                PhieuTra.setThoiGian(ResultSet.getTimestamp("ThoiGian"));
                PhieuTra.setTongSach(ResultSet.getInt("TongSach"));
                DanhSachPhieuTra.add(PhieuTra);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách phiếu trả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachPhieuTra;
    }

    //Thêm phiếu trả
    public Boolean Them(DTO_PhieuTra PhieuTra) {
        String TruyVan = "Insert Into PhieuTra(MaPhieuTra, MaPhieuMuon, MaNhanVien, ThoiGian, TongSach) Values(?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, PhieuTra.getMaPhieuTra());
            PreparedStatement.setString(2, PhieuTra.getMaPhieuMuon());
            PreparedStatement.setString(3, PhieuTra.getMaNhanVien());
            PreparedStatement.setTimestamp(4, PhieuTra.getThoiGian());
            PreparedStatement.setInt(5, PhieuTra.getTongSach());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm phiếu trả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Lấy chiều dài danh sách phiếu trả
    public Integer LayChieuDaiDanhSach() {
         Integer ChieuDaiDanhSachPhieuTra = 0;
        String TruyVan = "Select MaPhieuTra From PhieuTra";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachPhieuTra++;
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy chiều dài danh sách phiếu trả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachPhieuTra;
    }

}
