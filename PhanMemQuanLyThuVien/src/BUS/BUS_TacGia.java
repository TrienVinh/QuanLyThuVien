package BUS;

import DAO.DAO_TacGia;
import DTO.DTO_TacGia;
import java.util.ArrayList;

public class BUS_TacGia {

    public Boolean CapNhat(DTO_TacGia TacGia) {
        return new DAO_TacGia().CapNhat(TacGia);
    }

    public Boolean Them(DTO_TacGia TacGia) {
        return new DAO_TacGia().Them(TacGia);
    }

    public Boolean Xoa(DTO_TacGia TacGia) {
        return new DAO_TacGia().Xoa(TacGia);
    }

    public DTO_TacGia LayTenTheoMa(String MaTacGia) {
        return new DAO_TacGia().LayTenTheoMa(MaTacGia);
    }

    public static ArrayList<DTO_TacGia> LayDanhSach() {
        return new DAO_TacGia().LayDanhSach();
    }

}
