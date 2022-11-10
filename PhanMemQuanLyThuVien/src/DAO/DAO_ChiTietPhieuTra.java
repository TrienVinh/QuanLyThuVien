package DAO;

import DTO.DTO_ChiTietPhieuTra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_ChiTietPhieuTra {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_ChiTietPhieuTra> LayDanhSachTheoMa(String MaPhieuTra) {
        ArrayList<DTO_ChiTietPhieuTra> DanhSachChiTietPhieuTra = new ArrayList<>();
        String TruyVan = "Select * From ChiTietPhieuTra Where MaPhieuTra ='" + MaPhieuTra + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_ChiTietPhieuTra ChiTietPhieuTra = new DTO_ChiTietPhieuTra();
                ChiTietPhieuTra.setMaPhieuTra(ResultSet.getString("MaPhieuTra"));
                ChiTietPhieuTra.setMaDauSach(ResultSet.getString("MaDauSach"));
                ChiTietPhieuTra.setMaDinhDanhSach(ResultSet.getString("MaDinhDanhSach"));
                DanhSachChiTietPhieuTra.add(ChiTietPhieuTra);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách chi tiết phiếu trả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachChiTietPhieuTra;
    }

    public Boolean Them(DTO_ChiTietPhieuTra ChiTietPhieuTra) {
        String TruyVan = "Insert Into ChiTietPhieuTra(MaPhieuTra, MaDauSach, MaDinhDanhDauSach) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, ChiTietPhieuTra.getMaPhieuTra());
            PreparedStatement.setString(2, ChiTietPhieuTra.getMaDauSach());
            PreparedStatement.setString(3, ChiTietPhieuTra.getMaDinhDanhSach());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm chi tiết phiếu trả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
