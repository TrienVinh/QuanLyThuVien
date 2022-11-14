package BUS;

import DAO.DAO_NgonNgu;
import DTO.DTO_NgonNgu;
import java.util.ArrayList;

public class BUS_NgonNgu {

    //Lấy danh sách ngôn ngữ
    public static ArrayList<DTO_NgonNgu> LayDanhSach() {
        return new DAO_NgonNgu().LayDanhSach();
    }

    //Cập nhật thông tin ngôn ngữ
    public Boolean CapNhat(DTO_NgonNgu NgonNgu) {
        return new DAO_NgonNgu().CapNhat(NgonNgu);
    }

    //Thêm ngôn ngữ
    public Boolean Them(DTO_NgonNgu NgonNgu) {
        return new DAO_NgonNgu().Them(NgonNgu);
    }

    //Xóa ngôn ngữ
    public Boolean Xoa(DTO_NgonNgu NgonNgu) {
        return new DAO_NgonNgu().Xoa(NgonNgu);
    }

    //Lấy tên ngôn ngữ theo mã
    public DTO_NgonNgu LayTenTheoMa(String MaNgonNgu) {
        return new DAO_NgonNgu().LayTenTheoMa(MaNgonNgu);
    }

    //Lấy chiều dài danh sách ngôn ngữ
    public Integer LayChieuDaiDanhSach() {
        return new DAO_NgonNgu().LayChieuDaiDanhSach();
    }

}
