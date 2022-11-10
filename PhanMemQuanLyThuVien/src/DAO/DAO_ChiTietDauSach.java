package DAO;

import DTO.DTO_ChiTietDauSach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_ChiTietDauSach {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_ChiTietDauSach> LayDanhSach() {
        ArrayList<DTO_ChiTietDauSach> DanhSachChiTietDauSach = new ArrayList<>();
        String TruyVan = "Select * From ChiTietDauSach";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_ChiTietDauSach ChiTietDauSach = new DTO_ChiTietDauSach();
                ChiTietDauSach.setMaDauSach(ResultSet.getString("MaDauSach"));
                ChiTietDauSach.setMaDinhDanhSach(ResultSet.getString("MaDinhDanhSach"));
                ChiTietDauSach.setMaPhieuMuon(ResultSet.getString("MaPhieuMuon"));
                ChiTietDauSach.setTinhTrang(ResultSet.getString("TinhTrang"));
                DanhSachChiTietDauSach.add(ChiTietDauSach);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách chi tiết đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachChiTietDauSach;
    }

    public Boolean Them(DTO_ChiTietDauSach ChiTietDauSach) {
        String TruyVan = "Insert Into ChiTietDauSach(MaDauSach, MaDinhDanhSach, MaPhieuMuon, TinhTrang) Values(?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, ChiTietDauSach.getMaDauSach());
            PreparedStatement.setString(2, ChiTietDauSach.getMaDinhDanhSach());
            PreparedStatement.setString(3, ChiTietDauSach.getMaPhieuMuon());
            PreparedStatement.setString(4, ChiTietDauSach.getTinhTrang());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm chi tiết đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
