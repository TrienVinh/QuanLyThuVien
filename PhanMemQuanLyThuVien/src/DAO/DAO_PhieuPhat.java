package DAO;

import DTO.DTO_PhieuPhat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_PhieuPhat {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_PhieuPhat> LayDanhSach() {
        ArrayList<DTO_PhieuPhat> DanhSachPhieuPhat = new ArrayList<>();
        String TruyVan = "Select MaPhieuPhat, MaPhieuMuon, MaNhanVien, ThoiGian, TongTien From PhieuPhat";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_PhieuPhat PhieuPhat = new DTO_PhieuPhat();
                PhieuPhat.setMaPhieuPhat(ResultSet.getString("MaPhieuPhat"));
                PhieuPhat.setMaPhieuMuon(ResultSet.getString("MaPhieuMuon"));
                PhieuPhat.setMaNhanVien(ResultSet.getString("MaNhanVien"));
                PhieuPhat.setThoiGian(ResultSet.getTimestamp("ThoiGian"));
                PhieuPhat.setTongTien(ResultSet.getDouble("TongTien"));
                DanhSachPhieuPhat.add(PhieuPhat);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách phiếu phạt không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachPhieuPhat;
    }

    public Boolean Them(DTO_PhieuPhat PhieuPhat) {
        String TruyVan = "Insert Into PhieuPhat(MaPhieuPhat, MaPhieuMuon, MaNhanVien, ThoiGian, TongTien) Values(?,?,?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, PhieuPhat.getMaPhieuPhat());
            PreparedStatement.setString(2, PhieuPhat.getMaPhieuMuon());
            PreparedStatement.setString(3, PhieuPhat.getMaNhanVien());
            PreparedStatement.setTimestamp(4, PhieuPhat.getThoiGian());
            PreparedStatement.setDouble(5, PhieuPhat.getTongTien());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm phiếu phạt không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Integer LayChieuDaiDanhSach() {
        Integer ChieuDaiDanhSachPhieuPhat = 0;
        String TruyVan = "Select MaPhieuPhat From PhieuPhat";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                ChieuDaiDanhSachPhieuPhat++;
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách phiếu phạt không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return ChieuDaiDanhSachPhieuPhat;
    }

}
