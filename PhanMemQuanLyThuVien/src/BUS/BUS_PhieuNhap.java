package BUS;

import DAO.DAO_PhieuNhap;
import DTO.DTO_PhieuNhap;
import java.util.ArrayList;

public class BUS_PhieuNhap {

    public Boolean Them(DTO_PhieuNhap PhieuNhap) {
        return new DAO_PhieuNhap().Them(PhieuNhap);
    }

    public static ArrayList<DTO_PhieuNhap> LayDanhSach() {
        return new DAO_PhieuNhap().LayDanhSach();
    }

    public Integer LayChieuDaiDanhSach() {
        return new DAO_PhieuNhap().LayChieuDaiDanhSach();
    }

}
