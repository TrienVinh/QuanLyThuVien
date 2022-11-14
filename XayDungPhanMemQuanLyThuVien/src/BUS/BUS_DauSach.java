package BUS;

import DAO.DAO_DauSach;
import DTO.DTO_DauSach;
import java.util.ArrayList;

public class BUS_DauSach {

    //Lấy danh sách đầu sách
    public static ArrayList<DTO_DauSach> LayDanhSach() {
        return new DAO_DauSach().LayDanhSach();
    }

    //Cập nhật thông tin đầu sách
    public Boolean CapNhat(DTO_DauSach DauSach) {
        return new DAO_DauSach().CapNhat(DauSach);
    }

    //Cập nhật số lượng sách
    public Boolean CapNhatSoLuongSach(DTO_DauSach DauSach) {
        return new DAO_DauSach().CapNhatSoLuongSach(DauSach);
    }

    //Cập nhật số lượng sách khả dụng
    public Boolean CapNhatSoLuongSachKhaDung(DTO_DauSach DauSach) {
        return new DAO_DauSach().CapNhatSoLuongSachKhaDung(DauSach);
    }

    //Thêm đầu sách
    public Boolean Them(DTO_DauSach DauSach) {
        return new DAO_DauSach().Them(DauSach);
    }

    //Xóa đầu sách
    public Boolean Xoa(DTO_DauSach DauSach) {
        return new DAO_DauSach().Xoa(DauSach);
    }

    //Lấy tên đầu sách theo mã
    public DTO_DauSach LayTenTheoMa(String MaDauSach) {
        return new DAO_DauSach().LayTenTheoMa(MaDauSach);
    }

    //Lấy chiều dài danh sách đầu sách
    public Integer LayChieuDaiDanhSach() {
        return new DAO_DauSach().LayChieuDaiDanhSach();
    }

}
