package BUS;

import DAO.DAO_TaiKhoan;
import DTO.DTO_TaiKhoan;
import java.util.ArrayList;

public class BUS_TaiKhoan {

    public Boolean Them(DTO_TaiKhoan TaiKhoan) {
        return new DAO_TaiKhoan().Them(TaiKhoan);
    }

    public Boolean Xoa(DTO_TaiKhoan TaiKhoan) {
        return new DAO_TaiKhoan().Xoa(TaiKhoan);
    }

    public DTO_TaiKhoan LayTaiKhoangTheoMaNhanVien(String MaNhanVien) {
        return new DAO_TaiKhoan().LayTheoMaNhanVien(MaNhanVien);
    }

    public static ArrayList<DTO_TaiKhoan> LayDanhSach() {
        return new DAO_TaiKhoan().LayDanhSach();
    }

}
