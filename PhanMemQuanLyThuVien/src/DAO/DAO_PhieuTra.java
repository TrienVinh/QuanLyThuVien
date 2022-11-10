package DAO;

import DTO.DTO_PhieuTra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_PhieuTra {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_PhieuTra> LayDanhSach() {
        ArrayList<DTO_PhieuTra> DanhSachPhieuTra = new ArrayList<>();
        String TruyVan = "Select MaPhieuTra, MaPhieuMuon, MaNhanVien, ThoiGian, TongTien From PhieuTra";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_PhieuTra PhieuTra = new DTO_PhieuTra();
                PhieuTra.setMaPhieuTra(ResultSet.getString("MaPhieuTra"));
                PhieuTra.setMaPhieuMuon(ResultSet.getString("MaPhieuMuon"));
                PhieuTra.setMaNhanVien(ResultSet.getString("MaNhanVien"));
                PhieuTra.setThoiGian(ResultSet.getTimestamp("ThoiGian"));
                PhieuTra.setTongSach(ResultSet.getInt("TongTien"));
                DanhSachPhieuTra.add(PhieuTra);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách phiếu trả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachPhieuTra;
    }

    public Boolean Them(DTO_PhieuTra PhieuTra) {
        String TruyVan = "Insert Into PhieuTra(MaPhieuTra, MaPhieuMuon, MaNhanVien, ThoiGian, TongTien) Values(?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, PhieuTra.getMaPhieuTra());
            PreparedStatement.setString(2, PhieuTra.getMaPhieuMuon());
            PreparedStatement.setString(3, PhieuTra.getMaNhanVien());
            PreparedStatement.setTimestamp(4, PhieuTra.getThoiGian());
            PreparedStatement.setInt(5, PhieuTra.getTongSach());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm phiếu trả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachPhieuTra = 0;
        String TruyVan = "Select MaPhieuTra From PhieuTra";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachPhieuTra++;
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách phiếu trả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachPhieuTra;
    }

}
