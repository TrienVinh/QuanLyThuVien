package DAO;

import DTO.DTO_TacGia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_TacGia {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_TacGia> LayDanhSach() {
        ArrayList<DTO_TacGia> DanhSachTacGia = new ArrayList<>();
        String TruyVan = "Select MaTacGia, TenTacGia From TacGia Where TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_TacGia TacGia = new DTO_TacGia();
                TacGia.setMaTacGia(ResultSet.getString("MaTacGia"));
                TacGia.setTenTacGia(ResultSet.getString("TenTacGia"));
                DanhSachTacGia.add(TacGia);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachTacGia;
    }

    public Boolean CapNhat(DTO_TacGia TacGia) {
        String TruyVan = "Update TacGia Set TenTacGia = ? Where MaTacGia = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, TacGia.getTenTacGia());
            PreparedStatement.setString(2, TacGia.getMaTacGia());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Cập nhật tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Them(DTO_TacGia TacGia) {
        String TruyVan = "Insert Into TacGia(MaTacGia, TenTacGia, TrangThai) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, TacGia.getMaTacGia());
            PreparedStatement.setString(2, TacGia.getTenTacGia());
            PreparedStatement.setBoolean(3, TacGia.getTrangThai());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Xoa(DTO_TacGia TacGia) {
        String TruyVan = "Update TacGia Set TrangThai = ? Where MaTacGia = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, TacGia.getTrangThai());
            PreparedStatement.setString(2, TacGia.getMaTacGia());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Xóa tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public DTO_TacGia LayTenTheoMa(String MaTacGia) {
        DTO_TacGia TacGia = new DTO_TacGia();
        String TruyVan = "Select TenTacGia From TacGia Where MaTacGia ='" + MaTacGia + "' And TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                TacGia.setTenTacGia(ResultSet.getString("TenTacGia"));
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy tên tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return TacGia;
    }

    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachTacGia = 0;
        String TruyVan = "Select MaTacGia From TacGia";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachTacGia++;
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách tác giả không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachTacGia;
    }

}
