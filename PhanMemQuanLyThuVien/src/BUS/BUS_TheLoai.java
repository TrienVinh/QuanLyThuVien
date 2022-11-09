package BUS;

import DAO.DAO_TheLoai;
import DTO.DTO_TheLoai;
import java.util.ArrayList;

public class BUS_TheLoai {

    public Boolean CapNhat(DTO_TheLoai TheLoai) {
        return new DAO_TheLoai().CapNhat(TheLoai);
    }

    public Boolean Them(DTO_TheLoai TheLoai) {
        return new DAO_TheLoai().Them(TheLoai);
    }

    public Boolean Xoa(DTO_TheLoai TheLoai) {
        return new DAO_TheLoai().Xoa(TheLoai);
    }

    public DTO_TheLoai LayTenTheoMa(String MaTheLoai) {
        return new DAO_TheLoai().LayTenTheoMa(MaTheLoai);
    }

    public static ArrayList<DTO_TheLoai> LayDanhSach() {
        return new DAO_TheLoai().LayDanhSach();
    }

}
