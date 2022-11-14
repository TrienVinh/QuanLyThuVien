package BUS;

import DAO.DAO_ChiTietPhieuMuon;
import DTO.DTO_ChiTietPhieuMuon;
import java.util.ArrayList;

public class BUS_ChiTietPhieuMuon {

    //Lấy danh sách chi tiết phiếu mượn theo mã phiếu mượn
    public static ArrayList<DTO_ChiTietPhieuMuon> LayDanhSachTheoMa(String MaPhieuMuon) {
        return new DAO_ChiTietPhieuMuon().LayDanhSachTheoMa(MaPhieuMuon);
    }

    //Thêm chi tiết phiếu mượn
    public Boolean Them(DTO_ChiTietPhieuMuon ChiTietPhieuMuon) {
        return new DAO_ChiTietPhieuMuon().Them(ChiTietPhieuMuon);
    }

}
