package BUS;

import DAO.DAO_TaiKhoan;
import DTO.DTO_TaiKhoan;
import java.util.ArrayList;

public class BUS_TaiKhoan {

    //Lấy danh sách tài khoản
    public static ArrayList<DTO_TaiKhoan> LayDanhSach() {
        return new DAO_TaiKhoan().LayDanhSach();
    }

    //Cập nhật thông tin tài khoản
    public Boolean CapNhat(DTO_TaiKhoan TaiKhoan) {
        return new DAO_TaiKhoan().CapNhat(TaiKhoan);
    }

    //Thêm tài khoản
    public Boolean Them(DTO_TaiKhoan TaiKhoan) {
        return new DAO_TaiKhoan().Them(TaiKhoan);
    }

    //Xóa tài khoản
    public Boolean Xoa(DTO_TaiKhoan TaiKhoan) {
        return new DAO_TaiKhoan().Xoa(TaiKhoan);
    }

}
