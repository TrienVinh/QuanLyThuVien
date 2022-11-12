package DAO;

import DTO.DTO_ChiTietPhieuMuon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_ChiTietPhieuMuon {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_ChiTietPhieuMuon> LayDanhSachTheoMa(String MaPhieuMuon) {
        ArrayList<DTO_ChiTietPhieuMuon> DanhSachChiTietPhieuMuon = new ArrayList<>();
        String CauTruyVan = "Select * From ChiTietPhieuMuon Where MaPhieuMuon ='" + MaPhieuMuon + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(CauTruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_ChiTietPhieuMuon ChiTietPhieuMuon = new DTO_ChiTietPhieuMuon();
                ChiTietPhieuMuon.setMaPhieuMuon(MaPhieuMuon);
                String MaDauSach = ResultSet.getString("MaDauSach");
                ChiTietPhieuMuon.setMaDauSach(MaDauSach);
                Integer SoLuongSach = ResultSet.getInt("SoLuongSach");
                ChiTietPhieuMuon.setSoLuongSach(SoLuongSach);
                DanhSachChiTietPhieuMuon.add(ChiTietPhieuMuon);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách chi tiết phiếu mượn không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachChiTietPhieuMuon;
    }

    public Boolean Them(DTO_ChiTietPhieuMuon ChiTietPhieuMuon) {
        String CauTruyVan = "Insert Into ChiTietPhieuMuon(MaPhieuMuon, MaDauSach, SoLuongSach) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(CauTruyVan);
            String MaPhieuMuon = ChiTietPhieuMuon.getMaPhieuMuon();
            PreparedStatement.setString(1, MaPhieuMuon);
            String MaDauSach = ChiTietPhieuMuon.getMaDauSach();
            PreparedStatement.setString(2, MaDauSach);
            Integer SoLuongSach = ChiTietPhieuMuon.getSoLuongSach();
            PreparedStatement.setInt(3, SoLuongSach);
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm chi tiết phiếu mượn không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
