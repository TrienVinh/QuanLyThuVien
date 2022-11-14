package BUS;

import DAO.DAO_PhieuMuon;
import DTO.DTO_PhieuMuon;
import java.util.ArrayList;

public class BUS_PhieuMuon {

    //Lấy danh sách phiếu mượn
    public static ArrayList<DTO_PhieuMuon> LayDanhSach() {
        return new DAO_PhieuMuon().LayDanhSach();
    }

    //Thêm phiếu mượn
    public Boolean Them(DTO_PhieuMuon PhieuMuon) {
        return new DAO_PhieuMuon().Them(PhieuMuon);
    }

    //Lấy chiều dài danh sách phiếu mượn
    public Integer LayChieuDaiDanhSach() {
        return new DAO_PhieuMuon().LayChieuDaiDanhSach();
    }

}
