package BUS;

import DAO.DAO_NhaXuatBan;
import DTO.DTO_NhaXuatBan;
import java.util.ArrayList;

public class BUS_NhaXuatBan {

    //Lấy danh sách nhà xuất bản
    public static ArrayList<DTO_NhaXuatBan> LayDanhSach() {
        return new DAO_NhaXuatBan().LayDanhSach();
    }

    //Cập nhật thông tin nhà xuất bản
    public Boolean CapNhat(DTO_NhaXuatBan NhaXuatBan) {
        return new DAO_NhaXuatBan().CapNhat(NhaXuatBan);
    }

    //Thêm nhà xuất bản
    public Boolean Them(DTO_NhaXuatBan NhaXuatBan) {
        return new DAO_NhaXuatBan().Them(NhaXuatBan);
    }

    //Xóa nhà xuất bản
    public Boolean Xoa(DTO_NhaXuatBan NhaXuatBan) {
        return new DAO_NhaXuatBan().Xoa(NhaXuatBan);
    }

    //Lấy tên nhà xuất bản theo mã
    public DTO_NhaXuatBan LayTenTheoMa(String MaNhaXuatBan) {
        return new DAO_NhaXuatBan().LayTenTheoMa(MaNhaXuatBan);
    }

    //Lấy chiều dài danh sách nhà xuất bản
    public Integer LayChieuDaiDanhSach() {
        return new DAO_NhaXuatBan().LayChieuDaiDanhSach();
    }

}
