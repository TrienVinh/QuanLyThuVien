package BUS;

import DAO.DAO_NgonNgu;
import DTO.DTO_NgonNgu;
import java.util.ArrayList;

public class BUS_NgonNgu {
    
    public Boolean Them(DTO_NgonNgu NgonNgu) {
        return new DAO_NgonNgu().Them(NgonNgu);
    }
    
    public Boolean CapNhat(DTO_NgonNgu NgonNgu) {
        return new DAO_NgonNgu().CapNhat(NgonNgu);
    }
    
    public Boolean Xoa(DTO_NgonNgu NgonNgu) {
        return new DAO_NgonNgu().Xoa(NgonNgu);
    }
    
    public static ArrayList<DTO_NgonNgu> LayDanhSach() {
        return new DAO_NgonNgu().LayDanhSach();
    }
    
    public static ArrayList<DTO_NgonNgu> TimKiemTheoMa(String MaNgonNgu) {
        return new DAO_NgonNgu().TimKiemTheoMa(MaNgonNgu);
    }
    
}
