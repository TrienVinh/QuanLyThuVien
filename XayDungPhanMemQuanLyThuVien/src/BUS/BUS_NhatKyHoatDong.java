package BUS;

import DAO.DAO_NhatKyHoatDong;
import DTO.DTO_NhatKyHoatDong;
import java.util.ArrayList;

public class BUS_NhatKyHoatDong {

    //Lấy danh sách nhật ký hoạt động
    public static ArrayList<DTO_NhatKyHoatDong> LayDanhSach() {
        return new DAO_NhatKyHoatDong().LayDanhSach();
    }

    //Thêm nhật ký hoạt động
    public Boolean Them(DTO_NhatKyHoatDong NhatKyHoatDong) {
        return new DAO_NhatKyHoatDong().Them(NhatKyHoatDong);
    }

}
