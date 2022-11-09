package BUS;

import DAO.DAO_DocGia;
import DTO.DTO_DocGia;
import java.util.ArrayList;

public class BUS_DocGia {

    public Boolean CapNhat(DTO_DocGia DocGia) {
        return new DAO_DocGia().CapNhat(DocGia);
    }

    public Boolean GiaHan(DTO_DocGia DocGia) {
        return new DAO_DocGia().GiaHan(DocGia);
    }

    public Boolean Them(DTO_DocGia DocGia) {
        return new DAO_DocGia().Them(DocGia);
    }

    public Boolean Xoa(DTO_DocGia DocGia) {
        return new DAO_DocGia().Xoa(DocGia);
    }

    public DTO_DocGia LayTenTheoMa(String MaDocGia) {
        return new DAO_DocGia().LayTenTheoMa(MaDocGia);
    }
    
    public static ArrayList<DTO_DocGia> LayDanhSach() {
        return new DAO_DocGia().LayDanhSach();
    }

}
