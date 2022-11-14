package BUS;

import DAO.DAO_PhieuTra;
import DTO.DTO_PhieuTra;
import java.util.ArrayList;

public class BUS_PhieuTra {

    //Lấy danh sách phiếu trả
    public static ArrayList<DTO_PhieuTra> LayDanhSach() {
        return new DAO_PhieuTra().LayDanhSach();
    }

    //Thêm phiếu trả
    public Boolean Them(DTO_PhieuTra PhieuTra) {
        return new DAO_PhieuTra().Them(PhieuTra);
    }

}
