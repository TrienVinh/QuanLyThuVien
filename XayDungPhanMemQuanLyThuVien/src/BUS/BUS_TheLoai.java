package BUS;

import DAO.DAO_TheLoai;
import DTO.DTO_TheLoai;
import java.util.ArrayList;

public class BUS_TheLoai {

    //Lấy danh sách thể loại
    public static ArrayList<DTO_TheLoai> LayDanhSach() {
        return new DAO_TheLoai().LayDanhSach();
    }

    //Cập nhật thông tin thể loại
    public Boolean CapNhat(DTO_TheLoai TheLoai) {
        return new DAO_TheLoai().Them(TheLoai);
    }

    //Thêm thể loại
    public Boolean Them(DTO_TheLoai TheLoai) {
        return new DAO_TheLoai().Them(TheLoai);
    }

    //Xóa thể loại
    public Boolean Xoa(DTO_TheLoai TheLoai) {
        return new DAO_TheLoai().Xoa(TheLoai);
    }

    //Lấy tên thể loại theo mã
    public DTO_TheLoai LayTenTheoMa(String MaTheLoai) {
        return new DAO_TheLoai().LayTenTheoMa(MaTheLoai);
    }

    //Lấy chiều dài danh sách thể loại
    public Integer LayChieuDaiDanhSach() {
        return new DAO_TheLoai().LayChieuDaiDanhSach();
    }

}
