package BUS;

import DAO.DAO_ChiTietPhieuNhap;
import DTO.DTO_ChiTietPhieuNhap;
import java.util.ArrayList;

public class BUS_ChiTietPhieuNhap {

    public Boolean Them(DTO_ChiTietPhieuNhap ChiTietPhieuNhap) {
        return new DAO_ChiTietPhieuNhap().Them(ChiTietPhieuNhap);
    }

    public static ArrayList<DTO_ChiTietPhieuNhap> LayDanhSachTheoMa(String MaPhieuNhap) {
        return new DAO_ChiTietPhieuNhap().LayDanhSachTheoMa(MaPhieuNhap);
    }

}
