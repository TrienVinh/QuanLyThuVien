package BUS;

import DAO.DAO_NhaXuatBan;
import DTO.DTO_NhaXuatBan;
import java.util.ArrayList;

public class BUS_NhaXuatBan {

    public Boolean Them(DTO_NhaXuatBan NhaXuatBan) {
        return new DAO_NhaXuatBan().Them(NhaXuatBan);
    }

    public Boolean CapNhat(DTO_NhaXuatBan NhaXuatBan) {
        return new DAO_NhaXuatBan().CapNhat(NhaXuatBan);
    }

    public Boolean Xoa(DTO_NhaXuatBan NhaXuatBan) {
        return new DAO_NhaXuatBan().Xoa(NhaXuatBan);
    }

    public static ArrayList<DTO_NhaXuatBan> LayDanhSach() {
        return new DAO_NhaXuatBan().LayDanhSach();
    }

    public static ArrayList<DTO_NhaXuatBan> TimKiemTheoMa(String MaNhaXuatBan) {
        return new DAO_NhaXuatBan().TimKiemTheoMa(MaNhaXuatBan);
    }

}
