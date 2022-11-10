package DAO;

import DTO.DTO_ChiTietPhieuNhap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_ChiTietPhieuNhap {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_ChiTietPhieuNhap> LayDanhSachTheoMa(String MaPhieuNhap) {
        ArrayList<DTO_ChiTietPhieuNhap> DanhSachChiTietPhieuNhap = new ArrayList<>();
        String TruyVan = "Select * From ChiTietPhieuNhap Where MaPhieuNhap ='" + MaPhieuNhap + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_ChiTietPhieuNhap ChiTietPhieuNhap = new DTO_ChiTietPhieuNhap();
                ChiTietPhieuNhap.setMaPhieuNhap(ResultSet.getString("MaPhieuNhap"));
                ChiTietPhieuNhap.setMaDauSach(ResultSet.getString("MaDauSach"));
                ChiTietPhieuNhap.setSoLuong(ResultSet.getInt("SoLuong"));
                ChiTietPhieuNhap.setSoLuong(ResultSet.getInt("DonGia"));
                DanhSachChiTietPhieuNhap.add(ChiTietPhieuNhap);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách chi tiết phiếu nhập không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachChiTietPhieuNhap;
    }

    public Boolean Them(DTO_ChiTietPhieuNhap ChiTietPhieuNhap) {
        String TruyVan = "Insert Into ChiTietPhieuNhap(MaPhieuNhap, MaDauSach, SoLuong, DonGia) Values(?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, ChiTietPhieuNhap.getMaPhieuNhap());
            PreparedStatement.setString(2, ChiTietPhieuNhap.getMaDauSach());
            PreparedStatement.setInt(3, ChiTietPhieuNhap.getSoLuong());
            PreparedStatement.setDouble(4, ChiTietPhieuNhap.getDonGia());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm chi tiết phiếu nhập không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
