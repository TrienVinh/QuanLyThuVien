package BUS;

import DAO.DAO_PhieuPhat;
import DTO.DTO_PhieuPhat;
import java.util.ArrayList;

public class BUS_PhieuPhat {

    public Boolean Them(DTO_PhieuPhat PhieuPhat) {
        return new DAO_PhieuPhat().Them(PhieuPhat);
    }

    public static ArrayList<DTO_PhieuPhat> LayDanhSach() {
        return new DAO_PhieuPhat().LayDanhSach();
    }

    public Integer LayChieuDaiDanhSach() {
        return new DAO_PhieuPhat().LayChieuDaiDanhSach();
    }

}
