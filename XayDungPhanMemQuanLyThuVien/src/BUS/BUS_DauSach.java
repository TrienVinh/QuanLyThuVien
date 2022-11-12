package BUS;

import DAO.DAO_DauSach;
import DTO.DTO_DauSach;
import java.util.ArrayList;

public class BUS_DauSach {

    public Boolean CapNhat(DTO_DauSach DauSach) {
        return new DAO_DauSach().Them(DauSach);
    }

    public Boolean Them(DTO_DauSach DauSach) {
        return new DAO_DauSach().Them(DauSach);
    }

    public Boolean Xoa(DTO_DauSach DauSach) {
        return new DAO_DauSach().Xoa(DauSach);
    }

    public DTO_DauSach LayTenTheoMa(String MaDauSach){
        return new DAO_DauSach().LayTenTheoMa(MaDauSach);
    }
    
    public Integer LayChieuDaiDanhSach(){
        return new DAO_DauSach().LayChieuDaiDanhSach();
    }
    
    public static ArrayList<DTO_DauSach> LayDanhSach() {
        return new DAO_DauSach().LayDanhSach();
    }

}
