package DAO;

import DTO.DTO_TacGia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_TacGia {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private PreparedStatement PreparedStatement = null;
    private ResultSet ResultSet = null;

    //Lấy danh sách tác giả
    public ArrayList<DTO_TacGia> LayDanhSach() {
        ArrayList<DTO_TacGia> DanhSachTacGia = new ArrayList<>();
        String TruyVan = "Select MaTacGia, TenTacGia, From TacGia Where TonTai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_TacGia TacGia = new DTO_TacGia();
                TacGia.setMaTacGia(ResultSet.getString("MaTacGia"));
                TacGia.setTenTacGia(ResultSet.getString("TenTacGia"));
                DanhSachTacGia.add(TacGia);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachTacGia;
    }

    //Cập nhật thông tin tác giả
    public Boolean CapNhat(DTO_TacGia TacGia) {
        String TruyVan = "Update TacGia Set TenTacGia = ?, Where MaTacGia = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, TacGia.getTenTacGia());
            PreparedStatement.setString(2, TacGia.getMaTacGia());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Cập nhật tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Thêm tác giả
    public Boolean Them(DTO_TacGia TacGia) {
        String TruyVan = "Insert Into TacGia(MaTacGia, TenTacGia, TonTai) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, TacGia.getMaTacGia());
            PreparedStatement.setString(2, TacGia.getTenTacGia());
            PreparedStatement.setBoolean(3, TacGia.getTonTai());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Xóa tác giả
    public Boolean Xoa(DTO_TacGia TacGia) {
        String TruyVan = "Update TacGia Set TonTai = ? Where MaTacGia = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, TacGia.getTonTai());
            PreparedStatement.setString(2, TacGia.getMaTacGia());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Xóa tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Lấy tên tác giả theo mã
    public DTO_TacGia LayTenTheoMa(String MaTacGia) {
        DTO_TacGia TacGia = new DTO_TacGia();
        String TruyVan = "Select TenTacGia, TonTai From TacGia Where MaTacGia ='" + MaTacGia + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                TacGia.setTenTacGia(ResultSet.getString("TenTacGia"));
                TacGia.setTonTai(ResultSet.getBoolean("TonTai"));
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy tên tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return TacGia;
    }

    //Lấy chiều dài danh sách tác giả
    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachTacGia = 0;
        String TruyVan = "Select MaTacGia From TacGia";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachTacGia++;
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy chiều dài danh sách tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachTacGia;
    }

}
