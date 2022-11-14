package DAO;

import DTO.DTO_TheLoai;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_TheLoai {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private PreparedStatement PreparedStatement = null;
    private ResultSet ResultSet = null;

    //Lấy danh sách thể loại
    public ArrayList<DTO_TheLoai> LayDanhSach() {
        ArrayList<DTO_TheLoai> DanhSachTheLoai = new ArrayList<>();
        String TruyVan = "Select MaTheLoai, TenTheLoai, From TheLoai Where TonTai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_TheLoai TheLoai = new DTO_TheLoai();
                TheLoai.setMaTheLoai(ResultSet.getString("MaTheLoai"));
                TheLoai.setTenTheLoai(ResultSet.getString("TenTheLoai"));
                DanhSachTheLoai.add(TheLoai);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachTheLoai;
    }

    //Cập nhật thông tin thể loại
    public Boolean CapNhat(DTO_TheLoai TheLoai) {
        String TruyVan = "Update TheLoai Set TenTheLoai = ?, Where MaTheLoai = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, TheLoai.getTenTheLoai());
            PreparedStatement.setString(2, TheLoai.getMaTheLoai());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Cập nhật thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Thêm thể loại
    public Boolean Them(DTO_TheLoai TheLoai) {
        String TruyVan = "Insert Into TheLoai(MaTheLoai, TenTheLoai, TonTai) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, TheLoai.getMaTheLoai());
            PreparedStatement.setString(2, TheLoai.getTenTheLoai());
            PreparedStatement.setBoolean(3, TheLoai.getTonTai());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Xóa thể loại
    public Boolean Xoa(DTO_TheLoai TheLoai) {
        String TruyVan = "Update TheLoai Set TonTai = ? Where MaTheLoai = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, TheLoai.getTonTai());
            PreparedStatement.setString(2, TheLoai.getMaTheLoai());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Xóa thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Lấy tên thể loại theo mã
    public DTO_TheLoai LayTenTheoMa(String MaTheLoai) {
        DTO_TheLoai TheLoai = new DTO_TheLoai();
        String TruyVan = "Select TenTheLoai, TonTai From TheLoai Where MaTheLoai ='" + MaTheLoai + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                TheLoai.setTenTheLoai(ResultSet.getString("TenTheLoai"));
                TheLoai.setTonTai(ResultSet.getBoolean("TonTai"));
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy tên thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return TheLoai;
    }

    //Lấy chiều dài danh sách thể loại
    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachTheLoai = 0;
        String TruyVan = "Select MaTheLoai From TheLoai";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachTheLoai++;
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy chiều dài danh sách thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachTheLoai;
    }

}
