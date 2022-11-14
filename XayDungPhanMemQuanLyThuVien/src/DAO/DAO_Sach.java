package DAO;

import DTO.DTO_Sach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_Sach {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    //Lấy danh sách sách
    public ArrayList<DTO_Sach> LayDanhSach() {
        ArrayList<DTO_Sach> DanhSachSach = new ArrayList<>();
        String TruyVan = "Select MaSach, MaDauSach, MaPhieuMuon, MaPhieuTra, TinhTrang From Sach";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_Sach Sach = new DTO_Sach();
                Sach.setMaSach(ResultSet.getString("MaSach"));
                Sach.setMaDauSach(ResultSet.getString("MaDauSach"));
                Sach.setMaPhieuMuon(ResultSet.getString("MaPhieuMuon"));
                Sach.setMaPhieuTra(ResultSet.getString("MaPhieuTra"));
                Sach.setTinhTrang(ResultSet.getString("TinhTrang"));
                DanhSachSach.add(Sach);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachSach;
    }

    //Cập nhật thông tin sách
    public Boolean CapNhat(DTO_Sach Sach) {
        String TruyVan = "Update Sach Set TinhTrang = ?, Where MaSach = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, Sach.getTinhTrang());
            PreparedStatement.setString(2, Sach.getMaSach());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Cập nhật sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Thêm sách
    public Boolean Them(DTO_Sach Sach) {
        String TruyVan = "Insert Into Sach(MaSach, MaDauSach, MaPhieuMuon, MaPhieuTra, TinhTrang) Values(?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, Sach.getMaSach());
            PreparedStatement.setString(2, Sach.getMaDauSach());
            PreparedStatement.setString(3, Sach.getMaPhieuMuon());
            PreparedStatement.setString(4, Sach.getMaPhieuTra());
            PreparedStatement.setString(5, Sach.getTinhTrang());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
