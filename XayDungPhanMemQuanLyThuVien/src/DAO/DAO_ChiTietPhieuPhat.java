package DAO;

import DTO.DTO_ChiTietPhieuPhat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_ChiTietPhieuPhat {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    //Lấy danh sách chi tiết phiếu phạt theo mã
    public ArrayList<DTO_ChiTietPhieuPhat> LayDanhSachTheoMa(String MaPhieuPhat) {
        ArrayList<DTO_ChiTietPhieuPhat> DanhSachChiTietPhieuPhat = new ArrayList<>();
        String CauTruyVan = "Select * From ChiTietPhieuPhat Where MaPhieuPhat ='" + MaPhieuPhat + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(CauTruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_ChiTietPhieuPhat ChiTietPhieuPhat = new DTO_ChiTietPhieuPhat();
                ChiTietPhieuPhat.setMaPhieuPhat(MaPhieuPhat);
                String MaDauSach = ResultSet.getString("MaDauSach");
                ChiTietPhieuPhat.setMaDauSach(MaDauSach);
                String MaSach = ResultSet.getString("MaSach");
                ChiTietPhieuPhat.setMaSach(MaSach);
                String NoiDungPhat = ResultSet.getString("NoiDungPhat");
                ChiTietPhieuPhat.setNoiDungPhat(NoiDungPhat);
                Double LePhiBoiThuong = ResultSet.getDouble("LePhiBoiThuong");
                ChiTietPhieuPhat.setLePhiBoiThuong(LePhiBoiThuong);
                DanhSachChiTietPhieuPhat.add(ChiTietPhieuPhat);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách chi tiết phiếu phạt không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachChiTietPhieuPhat;
    }

    //Thêm chi tiết phiết phạt
    public Boolean Them(DTO_ChiTietPhieuPhat ChiTietPhieuPhat) {
        String CauTruyVan = "Insert Into ChiTietPhieuPhat(MaPhieuPhat, MaDauSach, MaSach, NoiDungPhat, LePhiBoiThuong) Values(?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(CauTruyVan);
            String MaPhieuPhat = ChiTietPhieuPhat.getMaPhieuPhat();
            PreparedStatement.setString(1, MaPhieuPhat);
            String MaDauSach = ChiTietPhieuPhat.getMaDauSach();
            PreparedStatement.setString(2, MaDauSach);
            String MaSach = ChiTietPhieuPhat.getMaSach();
            PreparedStatement.setString(3, MaSach);
            String NoiDungPhat = ChiTietPhieuPhat.getNoiDungPhat();
            PreparedStatement.setString(4, NoiDungPhat);
            Double LePhiBoiThuong = ChiTietPhieuPhat.getLePhiBoiThuong();
            PreparedStatement.setDouble(5, LePhiBoiThuong);
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm chi tiết phiếu phạt không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
