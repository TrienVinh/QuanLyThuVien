package DAO;

import DTO.DTO_DauSach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO_DauSach {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public ArrayList<DTO_DauSach> LayDanhSach() {
        ArrayList<DTO_DauSach> DanhSachDauSach = new ArrayList<>();
        String TruyVan = "Select * From DauSach Where TrangThai = true";
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
        } catch (Exception Exception) {
            Exception.printStackTrace();
        }
        return DanhSachDauSach;
    }

}
