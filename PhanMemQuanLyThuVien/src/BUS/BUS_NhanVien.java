package BUS;

import DAO.DAO_NhanVien;
import DTO.DTO_NhanVien;
import java.util.ArrayList;

public class BUS_NhanVien {

    public Boolean CapNhat(DTO_NhanVien NhanVien) {
        return new DAO_NhanVien().CapNhat(NhanVien);
    }

    public Boolean Them(DTO_NhanVien NhanVien) {
        return new DAO_NhanVien().Them(NhanVien);
    }

    public Boolean Xoa(DTO_NhanVien NhanVien) {
        return new DAO_NhanVien().Xoa(NhanVien);
    }

    public DTO_NhanVien LayTenTheoMa(String MaNhanVien) {
        return new DAO_NhanVien().LayTenTheoMa(MaNhanVien);
    }

    public static ArrayList<DTO_NhanVien> LayDanhSach() {
        return new DAO_NhanVien().LayDanhSach();
    }

}
