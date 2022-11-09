package BUS;

import DAO.DAO_ChiTietPhieuMuon;
import DTO.DTO_ChiTietPhieuMuon;
import java.util.ArrayList;

public class BUS_ChiTietPhieuMuon {

    public Boolean Them(DTO_ChiTietPhieuMuon ChiTietPhieuMuon) {
        return new DAO_ChiTietPhieuMuon().Them(ChiTietPhieuMuon);
    }

    public static ArrayList<DTO_ChiTietPhieuMuon> LayDanhSachTheoMa(String MaPhieuMuon) {
        return new DAO_ChiTietPhieuMuon().LayDanhSachTheoMa(MaPhieuMuon);
    }

}
