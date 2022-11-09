package DAO;

import DTO.DTO_ChiTietPhieuMuon;
import DTO.DTO_ChiTietPhieuMuon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_ChiTietPhieuMuon {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_ChiTietPhieuMuon> LayDanhSachTheoMa(String MaPhieuMuon) {
        ArrayList<DTO_ChiTietPhieuMuon> DanhSachChiTietPhieuMuon = new ArrayList<>();
        String TruyVan = "Select MaPhieuMuon, MaDauSach, SoLuong From ChiTietPhieuMuon Where MaPhieuMuon ='" + MaPhieuMuon + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_ChiTietPhieuMuon ChiTietPhieuMuon = new DTO_ChiTietPhieuMuon();
                ChiTietPhieuMuon.setMaPhieuMuon(ResultSet.getString("MaPhieuMuon"));
                ChiTietPhieuMuon.setMaDauSach(ResultSet.getString("MaDauSach"));
                ChiTietPhieuMuon.setSoLuong(ResultSet.getInt("SoLuong"));
                DanhSachChiTietPhieuMuon.add(ChiTietPhieuMuon);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách chi tiết phiếu mượn không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachChiTietPhieuMuon;
    }

    public Boolean Them(DTO_ChiTietPhieuMuon ChiTietPhieuMuon) {
        String TruyVan = "Insert Into ChiTietPhieuMuon(MaPhieuMuon, MaDauSach, SoLuong) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, ChiTietPhieuMuon.getMaPhieuMuon());
            PreparedStatement.setString(2, ChiTietPhieuMuon.getMaDauSach());
            PreparedStatement.setInt(3, ChiTietPhieuMuon.getSoLuong());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm chi tiết phiếu mượn không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
