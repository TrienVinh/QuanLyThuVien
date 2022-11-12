package BUS;

import DAO.DAO_NhatKyHoatDong;
import DTO.DTO_NhatKyHoatDong;
import java.util.ArrayList;

public class BUS_NhatKyHoatDong {

    public Boolean CapNhat(DTO_NhatKyHoatDong NhatKyHoatDong) {
        return new DAO_NhatKyHoatDong().Them(NhatKyHoatDong);
    }

    public static ArrayList<DTO_NhatKyHoatDong> LayDanhSach() {
        return new DAO_NhatKyHoatDong().LayDanhSach();
    }

}
