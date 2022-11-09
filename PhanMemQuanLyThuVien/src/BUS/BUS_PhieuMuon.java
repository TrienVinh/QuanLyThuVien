package BUS;

import DAO.DAO_PhieuMuon;
import DTO.DTO_PhieuMuon;
import java.util.ArrayList;

public class BUS_PhieuMuon {

    public Boolean Them(DTO_PhieuMuon PhieuMuon) {
        return new DAO_PhieuMuon().Them(PhieuMuon);
    }

    public static ArrayList<DTO_PhieuMuon> LayDanhSach() {
        return new DAO_PhieuMuon().LayDanhSach();
    }

}
