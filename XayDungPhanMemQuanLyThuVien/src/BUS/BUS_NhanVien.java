package BUS;

import DAO.DAO_NhanVien;
import DTO.DTO_NhanVien;
import java.util.ArrayList;

public class BUS_NhanVien {

    //Lấy danh sách nhân viên
    public static ArrayList<DTO_NhanVien> LayDanhSach() {
        return new DAO_NhanVien().LayDanhSach();
    }

    //Cập nhật thông tin nhân viên
    public Boolean CapNhat(DTO_NhanVien NhanVien) {
        return new DAO_NhanVien().Them(NhanVien);
    }

    //Thêm nhân viên
    public Boolean Them(DTO_NhanVien NhanVien) {
        return new DAO_NhanVien().Them(NhanVien);
    }

    //Xóa nhân viên
    public Boolean Xoa(DTO_NhanVien NhanVien) {
        return new DAO_NhanVien().Xoa(NhanVien);
    }

    //Lấy ngày sinh nhân viên theo mã
    public DTO_NhanVien LayNgaySinhTheoMa(String MaNhanVien) {
        return new DAO_NhanVien().LayTenTheoMa(MaNhanVien);
    }

    //Lấy tên nhân viên theo mã
    public DTO_NhanVien LayTenTheoMa(String MaNhanVien) {
        return new DAO_NhanVien().LayTenTheoMa(MaNhanVien);
    }

    //Lấy chiều dài danh sách nhân viên
    public Integer LayChieuDaiDanhSach() {
        return new DAO_NhanVien().LayChieuDaiDanhSach();
    }

}
