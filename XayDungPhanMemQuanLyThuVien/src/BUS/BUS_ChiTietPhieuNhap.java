package BUS;

import DAO.DAO_ChiTietPhieuNhap;
import DTO.DTO_ChiTietPhieuNhap;
import java.util.ArrayList;

public class BUS_ChiTietPhieuNhap {

    //Lấy danh sách chi tiết phiếu nhập theo mã
    public static ArrayList<DTO_ChiTietPhieuNhap> LayDanhSachTheoMa(String MaPhieuNhap) {
        return new DAO_ChiTietPhieuNhap().LayDanhSachTheoMa(MaPhieuNhap);
    }

    //Thêm chi tiết phiếu nhập
    public Boolean Them(DTO_ChiTietPhieuNhap ChiTietPhieuNhap) {
        return new DAO_ChiTietPhieuNhap().Them(ChiTietPhieuNhap);
    }

}
