package DAO;

import DTO.DTO_TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_TaiKhoan {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_TaiKhoan> LayDanhSach() {
        ArrayList<DTO_TaiKhoan> DanhSachTaiKhoan = new ArrayList<>();
        String TruyVan = "Select MaNhanVien, MatKhau, PhanQuyen, TinhTrang From TaiKhoan Where TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_TaiKhoan TaiKhoan = new DTO_TaiKhoan();
                TaiKhoan.setMaNhanVien(ResultSet.getString("MaNhanVien"));
                TaiKhoan.setMatKhau(ResultSet.getString("MatKhau"));
                TaiKhoan.setPhanQuyen(ResultSet.getString("PhanQuyen"));
                TaiKhoan.setTinhTrang(ResultSet.getString("TinhTrang"));
                DanhSachTaiKhoan.add(TaiKhoan);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách tài khoản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachTaiKhoan;
    }

    public Boolean Them(DTO_TaiKhoan TaiKhoan) {
        String TruyVan = "Insert Into TaiKhoan(MaNhanVien, MatKhau, PhanQuyen, TinhTrang, TrangThai) Values(?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, TaiKhoan.getMaNhanVien());
            PreparedStatement.setString(2, TaiKhoan.getMatKhau());
            PreparedStatement.setString(3, TaiKhoan.getPhanQuyen());
            PreparedStatement.setString(4, TaiKhoan.getTinhTrang());
            PreparedStatement.setBoolean(5, TaiKhoan.getTrangThai());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm tài khoản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Xoa(DTO_TaiKhoan TaiKhoan) {
        String TruyVan = "Update TaiKhoan Set TrangThai = ? Where MaNhanVien = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, TaiKhoan.getTrangThai());
            PreparedStatement.setString(2, TaiKhoan.getMaNhanVien());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Xóa tài khoản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public DTO_TaiKhoan LayTheoMaNhanVien(String MaNhanVien) {
        DTO_TaiKhoan TaiKhoan = new DTO_TaiKhoan();
        String TruyVan = "Select MaNhanVien, MatKhau, PhanQuyen, TinhTrang From TaiKhoan Where MaNhanVien ='" + MaNhanVien + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                TaiKhoan.setMaNhanVien(ResultSet.getString("MaNhanVien"));
                TaiKhoan.setMatKhau(ResultSet.getString("MatKhau"));
                TaiKhoan.setPhanQuyen(ResultSet.getString("PhanQuyen"));
                TaiKhoan.setTinhTrang(ResultSet.getString("TinhTrang"));
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy tài khoản theo mã nhân viên không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return TaiKhoan;
    }

}
