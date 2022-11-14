package BUS;

import DAO.DAO_Sach;
import DTO.DTO_Sach;
import java.util.ArrayList;

public class BUS_Sach {

    //Lấy danh sách sách
    public static ArrayList<DTO_Sach> LayDanhSach() {
        return new DAO_Sach().LayDanhSach();
    }

    //Cập nhật thông tin sách
    public Boolean CapNhat(DTO_Sach Sach) {
        return new DAO_Sach().CapNhat(Sach);
    }

    //Thêm sách
    public Boolean Them(DTO_Sach Sach) {
        return new DAO_Sach().Them(Sach);
    }

}
