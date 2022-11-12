package DAO;

import DTO.DTO_ChiTietPhieuTra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_ChiTietPhieuTra {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_ChiTietPhieuTra> LayDanhSachTheoMa(String MaPhieuTra) {
        ArrayList<DTO_ChiTietPhieuTra> DanhSachChiTietPhieuTra = new ArrayList<>();
        String CauTruyVan = "Select * From ChiTietPhieuTra Where MaPhieuTra ='" + MaPhieuTra + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(CauTruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_ChiTietPhieuTra ChiTietPhieuTra = new DTO_ChiTietPhieuTra();
                ChiTietPhieuTra.setMaPhieuTra(MaPhieuTra);
                String MaDauSach = ResultSet.getString("MaDauSach");
                ChiTietPhieuTra.setMaDauSach(MaDauSach);
                Integer SoLuongSach = ResultSet.getInt("SoLuongSach");
                ChiTietPhieuTra.setSoLuongSach(SoLuongSach);
                DanhSachChiTietPhieuTra.add(ChiTietPhieuTra);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách chi tiết phiếu trả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachChiTietPhieuTra;
    }

    public Boolean Them(DTO_ChiTietPhieuTra ChiTietPhieuTra) {
        String CauTruyVan = "Insert Into ChiTietPhieuTra(MaPhieuTra, MaDauSach, SoLuongSach) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(CauTruyVan);
            String MaPhieuTra = ChiTietPhieuTra.getMaPhieuTra();
            PreparedStatement.setString(1, MaPhieuTra);
            String MaDauSach = ChiTietPhieuTra.getMaDauSach();
            PreparedStatement.setString(2, MaDauSach);
            Integer SoLuongSach = ChiTietPhieuTra.getSoLuongSach();
            PreparedStatement.setInt(3, SoLuongSach);
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm chi tiết phiếu trả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
