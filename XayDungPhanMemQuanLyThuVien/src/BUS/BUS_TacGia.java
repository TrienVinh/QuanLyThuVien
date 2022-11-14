package BUS;

import DAO.DAO_TacGia;
import DTO.DTO_TacGia;
import java.util.ArrayList;

public class BUS_TacGia {

    //Lấy danh sách tác giả
    public static ArrayList<DTO_TacGia> LayDanhSach() {
        return new DAO_TacGia().LayDanhSach();
    }

    //Cập nhật thông tin tác giả
    public Boolean CapNhat(DTO_TacGia TacGia) {
        return new DAO_TacGia().Them(TacGia);
    }

    //Thêm tác giả
    public Boolean Them(DTO_TacGia TacGia) {
        return new DAO_TacGia().Them(TacGia);
    }

    //Xóa tác giả
    public Boolean Xoa(DTO_TacGia TacGia) {
        return new DAO_TacGia().Xoa(TacGia);
    }

    //Lấy tên tác giả theo mã
    public DTO_TacGia LayTenTheoMa(String MaTacGia) {
        return new DAO_TacGia().LayTenTheoMa(MaTacGia);
    }

    //Lấy chiều dài danh sách tác giả
    public Integer LayChieuDaiDanhSach() {
        return new DAO_TacGia().LayChieuDaiDanhSach();
    }

}
