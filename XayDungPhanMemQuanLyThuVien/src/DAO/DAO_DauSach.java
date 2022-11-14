package DAO;

import DTO.DTO_DauSach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_DauSach {

    MySQLConnection MySQLConnection = new MySQLConnection();
    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    //Lấy danh sách đầu sách
    public ArrayList<DTO_DauSach> LayDanhSach() {
        ArrayList<DTO_DauSach> DanhSachDauSach = new ArrayList<>();
        String TruyVan = "Select MaDauSach, TenDauSach, DonGia, MaNgonNgu, MaNhaXuatBan, MaTacGia, MaTheLoai, SoLuongSach, SoLuongSachKhaDung From DauSach Where TonTai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_DauSach DauSach = new DTO_DauSach();
                DauSach.setMaDauSach(ResultSet.getString("MaDauSach"));
                DauSach.setTenDauSach(ResultSet.getString("TenDauSach"));
                DauSach.setDonGia(ResultSet.getDouble("DonGia"));
                DauSach.setMaNgonNgu(ResultSet.getString("MaNgonNgu"));
                DauSach.setMaNhaXuatBan(ResultSet.getString("MaNhaXuatBan"));
                DauSach.setMaTacGia(ResultSet.getString("MaTacGia"));
                DauSach.setMaTheLoai(ResultSet.getString("MaTheLoai"));
                DauSach.setSoLuongSach(ResultSet.getInt("SoLuongSach"));
                DauSach.setSoLuongSachKhaDung(ResultSet.getInt("SoLuongSachKhaDung"));
                DanhSachDauSach.add(DauSach);
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachDauSach;
    }

    //Cập nhật thông tin đầu sách
    public Boolean CapNhat(DTO_DauSach DauSach) {
        String TruyVan = "Update DauSach Set TenDauSach = ?, DonGia = ?, MaNgonNgu = ?, MaNhaXuatBan = ?, MaTacGia = ?, MaTheLoai = ?, Where MaDauSach = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, DauSach.getTenDauSach());
            PreparedStatement.setDouble(2, DauSach.getDonGia());
            PreparedStatement.setString(3, DauSach.getMaNgonNgu());
            PreparedStatement.setString(4, DauSach.getMaNhaXuatBan());
            PreparedStatement.setString(5, DauSach.getMaTacGia());
            PreparedStatement.setString(6, DauSach.getMaTheLoai());
            PreparedStatement.setString(7, DauSach.getMaDauSach());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Cập nhật đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Cập nhật số lượng sách
    public Boolean CapNhatSoLuongSach(DTO_DauSach DauSach) {
        String TruyVan = "Update DauSach Set SoLuongSach = ?, SoLuongSachKhaDung = ? Where MaDauSach = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setInt(1, DauSach.getSoLuongSach());
            PreparedStatement.setInt(2, DauSach.getSoLuongSachKhaDung());
            PreparedStatement.setString(3, DauSach.getMaDauSach());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Cập nhật số lượng sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Cập nhật số lượng sách khả dụng
    public Boolean CapNhatSoLuongSachKhaDung(DTO_DauSach DauSach) {
        String TruyVan = "Update DauSach Set SoLuongSachKhaDung = ? Where MaDauSach = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setInt(1, DauSach.getSoLuongSachKhaDung());
            PreparedStatement.setString(2, DauSach.getMaDauSach());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Cập nhật số lượng sách khả dụng không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Thêm đầu sách
    public Boolean Them(DTO_DauSach DauSach) {
        String TruyVan = "Insert Into DauSach(MaDauSach, TenDauSach, DonGia, MaNgonNgu, MaNhaXuatBan, MaTacGia, MaTheLoai, SoLuongSach, SoLuongSachKhaDung, TonTai) Values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, DauSach.getMaDauSach());
            PreparedStatement.setString(2, DauSach.getTenDauSach());
            PreparedStatement.setDouble(3, DauSach.getDonGia());
            PreparedStatement.setString(4, DauSach.getMaNgonNgu());
            PreparedStatement.setString(5, DauSach.getMaNhaXuatBan());
            PreparedStatement.setString(6, DauSach.getMaTacGia());
            PreparedStatement.setString(7, DauSach.getMaTheLoai());
            PreparedStatement.setInt(8, DauSach.getSoLuongSach());
            PreparedStatement.setInt(9, DauSach.getSoLuongSachKhaDung());
            PreparedStatement.setBoolean(9, DauSach.getTonTai());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Thêm đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Xóa đầu sách
    public Boolean Xoa(DTO_DauSach DauSach) {
        String TruyVan = "Update DauSach Set TonTai = ? Where MaDauSach = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, DauSach.getTonTai());
            PreparedStatement.setString(2, DauSach.getMaDauSach());
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Xóa đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    //Lấy tên đầu sách theo mã
    public DTO_DauSach LayTenTheoMa(String MaDauSach) {
        DTO_DauSach DauSach = new DTO_DauSach();
        String TruyVan = "Select TenDauSach, TonTai From DauSach Where MaDauSach ='" + MaDauSach + "'";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DauSach.setTenDauSach(ResultSet.getString("TenDauSach"));
                DauSach.setTonTai(ResultSet.getBoolean("TonTai"));
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy tên đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DauSach;
    }

    //Lấy chiều dài danh sách đầu sách
    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachDauSach = 0;
        String TruyVan = "Select MaDauSach From DauSach";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachDauSach++;
            }
            MySQLConnection.Disconnect();
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lấy chiều dài danh sách đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachDauSach;
    }

}
