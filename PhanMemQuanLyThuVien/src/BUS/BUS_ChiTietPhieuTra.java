package BUS;

import DAO.DAO_ChiTietPhieuTra;
import DTO.DTO_ChiTietPhieuTra;
import java.util.ArrayList;

public class BUS_ChiTietPhieuTra {

    public Boolean Them(DTO_ChiTietPhieuTra ChiTietPhieuTra) {
        return new DAO_ChiTietPhieuTra().Them(ChiTietPhieuTra);
    }

    public static ArrayList<DTO_ChiTietPhieuTra> LayDanhSachTheoMa(String MaPhieuTra) {
        return new DAO_ChiTietPhieuTra().LayDanhSachTheoMa(MaPhieuTra);
    }

}
