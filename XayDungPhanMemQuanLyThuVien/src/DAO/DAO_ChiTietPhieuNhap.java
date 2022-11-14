package DAO;

import DTO.DTO_ChiTietPhieuNhap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_ChiTietPhieuNhap {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    //Lấy danh sách chi tiết phiếu nhập
    public ArrayList<DTO_ChiTietPhieuNhap> LayDanhSachTheoMa(String MaPhieuNhap) {
        ArrayList<DTO_ChiTietPhieuNhap> DanhSachChiTietPhieuNhap = new ArrayList<>();
        String CauTruyVan = "Select MaDauSach, DonGia, SoLuongSach From ChiTietPhieuNhap Where MaPhieuNhap ='" + MaPhieuNhap + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(CauTruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_ChiTietPhieuNhap ChiTietPhieuNhap = new DTO_ChiTietPhieuNhap();
                ChiTietPhieuNhap.setMaPhieuNhap(MaPhieuNhap);
                String MaDauSach = ResultSet.getString("MaDauSach");
                ChiTietPhieuNhap.setMaDauSach(MaDauSach);
                Double DonGia = ResultSet.getDouble("DonGia");
                ChiTietPhieuNhap.setDonGia(DonGia);
                Integer SoLuongSach = ResultSet.getInt("SoLuongSach");
                ChiTietPhieuNhap.setSoLuongSach(SoLuongSach);
                DanhSachChiTietPhieuNhap.add(ChiTietPhieuNhap);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách chi tiết phiếu nhập không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachChiTietPhieuNhap;
    }

    //Thêm chi tiết phiếu nhập
    public Boolean Them(DTO_ChiTietPhieuNhap ChiTietPhieuNhap) {
        String CauTruyVan = "Insert Into ChiTietPhieuNhap(MaPhieuNhap, MaDauSach, DonGia, SoLuongSach) Values(?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(CauTruyVan);
            String MaPhieuNhap = ChiTietPhieuNhap.getMaPhieuNhap();
            PreparedStatement.setString(1, MaPhieuNhap);
            String MaDauSach = ChiTietPhieuNhap.getMaDauSach();
            PreparedStatement.setString(2, MaDauSach);
            Double DonGia = ChiTietPhieuNhap.getDonGia();
            PreparedStatement.setDouble(3, DonGia);
            Integer SoLuongSach = ChiTietPhieuNhap.getSoLuongSach();
            PreparedStatement.setInt(4, SoLuongSach);
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm chi tiết phiếu nhập không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
