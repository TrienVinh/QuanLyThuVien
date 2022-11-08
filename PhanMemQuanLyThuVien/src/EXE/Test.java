package EXE;

import BUS.BUS_NgonNgu;
import DTO.DTO_NgonNgu;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<DTO_NgonNgu> DanhSachNgonNgu = BUS_NgonNgu.TimKiemTheoMa("NN01");
        for (int i = 0; i < DanhSachNgonNgu.size(); i++) {
            System.out.println(DanhSachNgonNgu.get(i).getTenNgonNgu());
        }
    }

}
