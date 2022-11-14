package BUS;

import DAO.DAO_DocGia;
import DTO.DTO_DocGia;
import java.util.ArrayList;

public class BUS_DocGia {

    //Lấy danh sách độc giả
    public static ArrayList<DTO_DocGia> LayDanhSach() {
        return new DAO_DocGia().LayDanhSach();
    }

    //Cập nhật thông tin độc giả
    public Boolean CapNhat(DTO_DocGia DocGia) {
        return new DAO_DocGia().CapNhat(DocGia);
    }

    //Cập nhật gia hạn độc giả
    public Boolean CapNhatGiaHan(DTO_DocGia DocGia) {
        return new DAO_DocGia().CapNhatGiaHan(DocGia);
    }
    
    //Thêm độc giả
    public Boolean Them(DTO_DocGia DocGia) {
        return new DAO_DocGia().Them(DocGia);
    }

    //Xóa độc giả
    public Boolean Xoa(DTO_DocGia DocGia) {
        return new DAO_DocGia().Xoa(DocGia);
    }

    //Lấy tên độc giả theo mã
    public DTO_DocGia LayTenTheoMa(String MaDocGia) {
        return new DAO_DocGia().LayTenTheoMa(MaDocGia);
    }

    //Lấy chiều dài danh sách độc giả
    public Integer LayChieuDaiDanhSach() {
        return new DAO_DocGia().LayChieuDaiDanhSach();
    }

}
