package DAO;

import DTO.DTO_NhaXuatBan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_NhaXuatBan {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private PreparedStatement PreparedStatement = null;
    private ResultSet ResultSet = null;

    //Lấy danh sách nhà xuất bản
    public ArrayList<DTO_NhaXuatBan> LayDanhSach() {
        ArrayList<DTO_NhaXuatBan> DanhSachNhaXuatBan = new ArrayList<>();
        String TruyVan = "Select MaNhaXuatBan, TenNhaXuatBan, From NhaXuatBan Where TonTai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_NhaXuatBan NhaXuatBan = new DTO_NhaXuatBan();
                NhaXuatBan.setMaNhaXuatBan(ResultSet.getString("MaNhaXuatBan"));
                NhaXuatBan.setTenNhaXuatBan(ResultSet.getString("TenNhaXuatBan"));
                DanhSachNhaXuatBan.add(NhaXuatBan);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachNhaXuatBan;
    }

    //Cập nhật thông tin nhà xuất bản
    public Boolean CapNhat(DTO_NhaXuatBan NhaXuatBan) {
        String TruyVan = "Update NhaXuatBan Set TenNhaXuatBan = ?, Where MaNhaXuatBan = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NhaXuatBan.getTenNhaXuatBan());
            PreparedStatement.setString(2, NhaXuatBan.getMaNhaXuatBan());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Cập nhật nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Thêm nhà xuất bản
    public Boolean Them(DTO_NhaXuatBan NhaXuatBan) {
        String TruyVan = "Insert Into NhaXuatBan(MaNhaXuatBan, TenNhaXuatBan, TonTai) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, NhaXuatBan.getMaNhaXuatBan());
            PreparedStatement.setString(2, NhaXuatBan.getTenNhaXuatBan());
            PreparedStatement.setBoolean(3, NhaXuatBan.getTonTai());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Xóa nhà xuất bản
    public Boolean Xoa(DTO_NhaXuatBan NhaXuatBan) {
        String TruyVan = "Update NhaXuatBan Set TonTai = ? Where MaNhaXuatBan = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, NhaXuatBan.getTonTai());
            PreparedStatement.setString(2, NhaXuatBan.getMaNhaXuatBan());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Xóa nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Lấy tên nhà xuất bản theo mã
    public DTO_NhaXuatBan LayTenTheoMa(String MaNhaXuatBan) {
        DTO_NhaXuatBan NhaXuatBan = new DTO_NhaXuatBan();
        String TruyVan = "Select TenNhaXuatBan, TonTai From NhaXuatBan Where MaNhaXuatBan ='" + MaNhaXuatBan + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                NhaXuatBan.setTenNhaXuatBan(ResultSet.getString("TenNhaXuatBan"));
                NhaXuatBan.setTonTai(ResultSet.getBoolean("TonTai"));
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy tên nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return NhaXuatBan;
    }

    //Lấy chiều dài danh sách nhà xuất bản
    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachNhaXuatBan = 0;
        String TruyVan = "Select MaNhaXuatBan From NhaXuatBan";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachNhaXuatBan++;
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy chiều dài danh sách nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachNhaXuatBan;
    }

}
