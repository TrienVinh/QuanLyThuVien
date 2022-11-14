package BUS;

import DAO.DAO_ChiTietPhieuTra;
import DTO.DTO_ChiTietPhieuTra;
import java.util.ArrayList;

public class BUS_ChiTietPhieuTra {

    //Lấy danh sách chi tiết phiếu trả theo mã
    public static ArrayList<DTO_ChiTietPhieuTra> LayDanhSachTheoMa(String MaPhieuTra) {
        return new DAO_ChiTietPhieuTra().LayDanhSachTheoMa(MaPhieuTra);
    }

    //Thêm chi tiết phiếu trả
    public Boolean Them(DTO_ChiTietPhieuTra ChiTietPhieuTra) {
        return new DAO_ChiTietPhieuTra().Them(ChiTietPhieuTra);
    }

}
