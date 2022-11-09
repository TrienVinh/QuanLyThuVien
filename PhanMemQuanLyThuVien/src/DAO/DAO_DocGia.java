package DAO;

import DTO.DTO_DocGia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_DocGia {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_DocGia> LayDanhSach() {
        ArrayList<DTO_DocGia> DanhSachDocGia = new ArrayList<>();
        String TruyVan = "Select MaDocGia, TenDocGia, SoDienThoai, NgayDangKy, NgayGiaHan, NgayHetHan From DocGia Where TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_DocGia DocGia = new DTO_DocGia();
                DocGia.setMaDocGia(ResultSet.getString("MaDocGia"));
                DocGia.setTenDocGia(ResultSet.getString("TenDocGia"));
                DocGia.setSoDienThoai(ResultSet.getString("SoDienThoai"));
                DocGia.setNgayDangKy(ResultSet.getDate("NgayDangKy"));
                DocGia.setNgayGiaHan(ResultSet.getDate("NgayGiaHan"));
                DocGia.setNgayHetHan(ResultSet.getDate("NgayHetHan"));
                DanhSachDocGia.add(DocGia);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachDocGia;
    }

    public ArrayList<DTO_DocGia> TimKiemTheoMa(String MaDocGia) {
        ArrayList<DTO_DocGia> DanhSachDocGia = new ArrayList<>();
        String TruyVan = "Select MaDocGia, TenDocGia From DocGia Where MaDocGia = '" + MaDocGia + "' And TrangThai = true";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            ResultSet = PreparedStatement.executeQuery();
            while (ResultSet.next()) {
                DTO_DocGia DocGia = new DTO_DocGia();
                DocGia.setMaDocGia(ResultSet.getString("MaDocGia"));
                DocGia.setTenDocGia(ResultSet.getString("TenDocGia"));
                DanhSachDocGia.add(DocGia);
            }
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Lấy danh sách nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return DanhSachDocGia;
    }

    public Boolean Them(DTO_DocGia DocGia) {
        String TruyVan = "Insert Into DocGia(MaDocGia, TenDocGia,TrangThai) Values(?,?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, DocGia.getMaDocGia());
            PreparedStatement.setString(2, DocGia.getTenDocGia());
            PreparedStatement.setBoolean(3, DocGia.getTrangThai());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Thêm nhà xuất bản mới không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean CapNhat(DTO_DocGia DocGia) {
        String TruyVan = "Update DocGia Set TenDocGia = ? Where MaDocGia = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setString(1, DocGia.getTenDocGia());
            PreparedStatement.setString(2, DocGia.getMaDocGia());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Cập nhật nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public Boolean Xoa(DTO_DocGia DocGia) {
        String TruyVan = "Update DocGia Set TrangThai = ? Where MaDocGia = ?";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setBoolean(1, DocGia.getTrangThai());
            PreparedStatement.setString(2, DocGia.getMaDocGia());
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Xóa nhà xuất bản không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }
    
    public Boolean GiaHan(DTO_DocGia DocGia){
        return false;
    }

}
