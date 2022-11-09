package DAO;

import DTO.DTO_PhieuMuon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_PhieuMuon {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_PhieuMuon> LayDanhSach() {
        ArrayList<DTO_PhieuMuon> DanhSachPhieuMuon = new ArrayList<>();
        String TruyVan = "Select MaPhieuMuon, MaDocGia, MaNhanVien, ThoiGian, TongSach From PhieuMuon";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_PhieuMuon PhieuMuon = new DTO_PhieuMuon();
                PhieuMuon.setMaPhieuMuon(ResultSet.getString("MaPhieuMuon"));
                PhieuMuon.setMaDocGia(ResultSet.getString("MaDocGia"));
                PhieuMuon.setMaNhanVien(ResultSet.getString("MaNhanVien"));
                PhieuMuon.setThoiGian(ResultSet.getTimestamp("ThoiGian"));
                PhieuMuon.setTongSach(ResultSet.getInt("TongSach"));
                DanhSachPhieuMuon.add(PhieuMuon);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách phiếu mượn không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachPhieuMuon;
    }

    public Boolean Them(DTO_PhieuMuon PhieuMuon) {
        String TruyVan = "Insert Into PhieuMuon(MaPhieuMuon, MaDocGia, MaNhanVien, ThoiGian, TongSach) Values(?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, PhieuMuon.getMaPhieuMuon());
            PreparedStatement.setString(2, PhieuMuon.getMaDocGia());
            PreparedStatement.setString(3, PhieuMuon.getMaNhanVien());
            PreparedStatement.setTimestamp(4, PhieuMuon.getThoiGian());
            PreparedStatement.setInt(5, PhieuMuon.getTongSach());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm phiếu mượn không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
