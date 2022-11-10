package DAO;

import DTO.DTO_ChiTietPhieuPhat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_ChiTietPhieuPhat {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_ChiTietPhieuPhat> LayDanhSachTheoMa(String MaPhieuPhat) {
        ArrayList<DTO_ChiTietPhieuPhat> DanhSachChiTietPhieuPhat = new ArrayList<>();
        String TruyVan = "Select * From ChiTietPhieuPhat Where MaPhieuPhat ='" + MaPhieuPhat + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_ChiTietPhieuPhat ChiTietPhieuPhat = new DTO_ChiTietPhieuPhat();
                ChiTietPhieuPhat.setMaPhieuPhat(ResultSet.getString("MaPhieuPhat"));
                ChiTietPhieuPhat.setMaDauSach(ResultSet.getString("MaDauSach"));
                ChiTietPhieuPhat.setMaDinhDanhSach(ResultSet.getString("MaDinhDanhSach"));
                ChiTietPhieuPhat.setNoiDungPhat(ResultSet.getString("NoiDungPhat"));
                ChiTietPhieuPhat.setLePhiBoiThuong(ResultSet.getDouble("LePhiBoiThuong"));
                DanhSachChiTietPhieuPhat.add(ChiTietPhieuPhat);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách chi tiết phiếu phạt không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachChiTietPhieuPhat;
    }

    public Boolean Them(DTO_ChiTietPhieuPhat ChiTietPhieuPhat) {
        String TruyVan = "Insert Into ChiTietPhieuPhat(MaPhieuPhat, MaDauSach, MaDinhDanhSach, NoiDungPhat, LePhiBoiThuong) Values(?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, ChiTietPhieuPhat.getMaPhieuPhat());
            PreparedStatement.setString(2, ChiTietPhieuPhat.getMaDauSach());
            PreparedStatement.setString(3, ChiTietPhieuPhat.getMaDinhDanhSach());
            PreparedStatement.setString(4, ChiTietPhieuPhat.getNoiDungPhat());
            PreparedStatement.setDouble(5, ChiTietPhieuPhat.getLePhiBoiThuong());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm chi tiết phiếu phạt không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
