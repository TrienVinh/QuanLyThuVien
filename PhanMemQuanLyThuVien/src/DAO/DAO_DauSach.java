package DAO;

import DTO.DTO_DauSach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_DauSach {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_DauSach> LayDanhSach() {
        ArrayList<DTO_DauSach> DanhSachDauSach = new ArrayList<>();
        String TruyVan = "Select MaDauSach, TenDauSach, DonGia, MaNgonNgu, MaNhaXuatBan, MaTacGia, MaTheLoai, SoLuong From DauSach Where TrangThai = true";
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
                DauSach.setSoLuong(ResultSet.getInt("SoLuong"));
                DanhSachDauSach.add(DauSach);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachDauSach;
    }

    public Boolean CapNhat(DTO_DauSach DauSach) {
        String TruyVan = "Update DauSach Set TenDauSach = ?, DonGia = ?, MaNgonNgu = ?, MaNhaXuatBan = ?, MaTacGia = ?, MaTheLoai =?, Where MaDauSach = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, DauSach.getTenDauSach());
            PreparedStatement.setDouble(2, DauSach.getDonGia());
            PreparedStatement.setString(3, DauSach.getMaNgonNgu());
            PreparedStatement.setString(4, DauSach.getMaNhaXuatBan());
            PreparedStatement.setString(5, DauSach.getMaTacGia());
            PreparedStatement.setString(6, DauSach.getMaTheLoai());
            PreparedStatement.setString(7, DauSach.getMaDauSach());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Cập nhật đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Them(DTO_DauSach DauSach) {
        String TruyVan = "Insert Into DauSach(MaDauSach, TenDauSach, DonGia, MaNgonNgu, MaNhaXuatBan, MaTacGia, MaTheLoai, SoLuong, TrangThai) Values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, DauSach.getMaDauSach());
            PreparedStatement.setString(2, DauSach.getTenDauSach());
            PreparedStatement.setDouble(3, DauSach.getDonGia());
            PreparedStatement.setString(4, DauSach.getMaNgonNgu());
            PreparedStatement.setString(5, DauSach.getMaNhaXuatBan());
            PreparedStatement.setString(6, DauSach.getMaTacGia());
            PreparedStatement.setString(7, DauSach.getMaTheLoai());
            PreparedStatement.setInt(8, DauSach.getSoLuong());
            PreparedStatement.setBoolean(9, DauSach.getTrangThai());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Xoa(DTO_DauSach DauSach) {
        String TruyVan = "Update DauSach Set TrangThai = ? Where MaDauSach = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, DauSach.getTrangThai());
            PreparedStatement.setString(2, DauSach.getMaDauSach());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Xóa đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public DTO_DauSach LayTenTheoMa(String MaDauSach) {
        DTO_DauSach DauSach = new DTO_DauSach();
        String TruyVan = "Select TenDauSach From DauSach Where MaDauSach ='" + MaDauSach + "' And TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DauSach.setTenDauSach(ResultSet.getString("TenDauSach"));
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy tên đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DauSach;
    }

    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachDauSach = 0;
        String TruyVan = "Select MaDauSach From DauSach";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachDauSach++;
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách đầu sách không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachDauSach;
    }

}
