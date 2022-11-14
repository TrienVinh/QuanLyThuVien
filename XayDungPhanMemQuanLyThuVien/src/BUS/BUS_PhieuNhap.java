package BUS;

import DAO.DAO_PhieuNhap;
import DTO.DTO_PhieuNhap;
import java.util.ArrayList;

public class BUS_PhieuNhap {

    //Lấy chiều dài danh sách phiếu nhập
    public static ArrayList<DTO_PhieuNhap> LayDanhSach() {
        return new DAO_PhieuNhap().LayDanhSach();
    }

    //Thêm phiếu nhập
    public Boolean Them(DTO_PhieuNhap PhieuNhap) {
        return new DAO_PhieuNhap().Them(PhieuNhap);
    }

    //Lấy chiều dài danh sách phiếu nhập
    public Integer LayChieuDaiDanhSach(){
        return new DAO_PhieuNhap().LayChieuDaiDanhSach();
    }
    
}
