package BUS;

import DAO.DAO_ChiTietPhieuPhat;
import DTO.DTO_ChiTietPhieuPhat;
import java.util.ArrayList;

public class BUS_ChiTietPhieuPhat {

    public Boolean Them(DTO_ChiTietPhieuPhat ChiTietPhieuPhat) {
        return new DAO_ChiTietPhieuPhat().Them(ChiTietPhieuPhat);
    }

    public static ArrayList<DTO_ChiTietPhieuPhat> LayDanhSachTheoMa(String MaPhieuPhat) {
        return new DAO_ChiTietPhieuPhat().LayDanhSachTheoMa(MaPhieuPhat);
    }

}
