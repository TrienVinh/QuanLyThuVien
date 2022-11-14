package DAO;

import DTO.DTO_TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_TaiKhoan {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private PreparedStatement PreparedStatement = null;
    private ResultSet ResultSet = null;

    //Lấy danh sách tài khoản
    public ArrayList<DTO_TaiKhoan> LayDanhSach() {
        ArrayList<DTO_TaiKhoan> DanhSachTaiKhoan = new ArrayList<>();
        String TruyVan = "Select MaNhanVien, MatKhau, From TaiKhoan Where TonTai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_TaiKhoan TaiKhoan = new DTO_TaiKhoan();
                TaiKhoan.setMaNhanVien(ResultSet.getString("MaNhanVien"));
                TaiKhoan.setMatKhau(ResultSet.getString("MatKhau"));
                TaiKhoan.setPhanQuyen(ResultSet.getString("PhanQuyen"));
                DanhSachTaiKhoan.add(TaiKhoan);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách tài khoản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachTaiKhoan;
    }

    //Cập nhật thông tin tài khoản
    public Boolean CapNhat(DTO_TaiKhoan TaiKhoan) {
        String TruyVan = "Update TaiKhoan Set MatKhau = ? Where MaNhanVien = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, TaiKhoan.getMatKhau());
            PreparedStatement.setString(2, TaiKhoan.getMaNhanVien());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Cập nhật tài khoản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Thêm tài khoản
    public Boolean Them(DTO_TaiKhoan TaiKhoan) {
        String TruyVan = "Insert Into TaiKhoan(MaNhanVien, MatKhau, PhanQuyen, TonTai) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, TaiKhoan.getMaNhanVien());
            PreparedStatement.setString(2, TaiKhoan.getMatKhau());
            PreparedStatement.setString(3, TaiKhoan.getPhanQuyen());
            PreparedStatement.setBoolean(4, TaiKhoan.getTonTai());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm tài khoản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Xóa tài khoản
    public Boolean Xoa(DTO_TaiKhoan TaiKhoan) {
        String TruyVan = "Update TaiKhoan Set TonTai = ? Where MaNhanVien = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, TaiKhoan.getTonTai());
            PreparedStatement.setString(2, TaiKhoan.getMaNhanVien());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Xóa tài khoản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
