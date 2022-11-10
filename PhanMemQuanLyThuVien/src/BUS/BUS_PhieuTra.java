package BUS;

import DAO.DAO_PhieuTra;
import DTO.DTO_PhieuTra;
import java.util.ArrayList;

public class BUS_PhieuTra {

    public Boolean Them(DTO_PhieuTra PhieuTra) {
        return new DAO_PhieuTra().Them(PhieuTra);
    }

    public static ArrayList<DTO_PhieuTra> LayDanhSach() {
        return new DAO_PhieuTra().LayDanhSach();
    }

    public Integer LayChieuDaiDanhSach() {
        return new DAO_PhieuTra().LayChieuDaiDanhSach();
    }

}
