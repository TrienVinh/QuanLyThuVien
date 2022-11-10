package DAO;

import DTO.DTO_TheLoai;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_TheLoai {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_TheLoai> LayDanhSach() {
        ArrayList<DTO_TheLoai> DanhSachTheLoai = new ArrayList<>();
        String TruyVan = "Select MaTheLoai, TenTheLoai From TheLoai Where TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_TheLoai TheLoai = new DTO_TheLoai();
                TheLoai.setMaTheLoai(ResultSet.getString("MaTheLoai"));
                TheLoai.setTenTheLoai(ResultSet.getString("TenTheLoai"));
                DanhSachTheLoai.add(TheLoai);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachTheLoai;
    }

    public Boolean CapNhat(DTO_TheLoai TheLoai) {
        String TruyVan = "Update TheLoai Set TenTheLoai = ? Where MaTheLoai = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, TheLoai.getTenTheLoai());
            PreparedStatement.setString(2, TheLoai.getMaTheLoai());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Cập nhật thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Them(DTO_TheLoai TheLoai) {
        String TruyVan = "Insert Into TheLoai(MaTheLoai, TenTheLoai, TrangThai) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, TheLoai.getMaTheLoai());
            PreparedStatement.setString(2, TheLoai.getTenTheLoai());
            PreparedStatement.setBoolean(3, TheLoai.getTrangThai());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Xoa(DTO_TheLoai TheLoai) {
        String TruyVan = "Update TheLoai Set TrangThai = ? Where MaTheLoai = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, TheLoai.getTrangThai());
            PreparedStatement.setString(2, TheLoai.getMaTheLoai());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Xóa thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public DTO_TheLoai LayTenTheoMa(String MaTheLoai) {
        DTO_TheLoai TheLoai = new DTO_TheLoai();
        String TruyVan = "Select TenTheLoai From TheLoai Where MaTheLoai ='" + MaTheLoai + "' And TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                TheLoai.setTenTheLoai(ResultSet.getString("TenTheLoai"));
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy tên thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return TheLoai;
    }

    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachTheLoai = 0;
        String TruyVan = "Select MaTheLoai From TheLoai";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachTheLoai++;
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách thể loại không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachTheLoai;
    }

}
