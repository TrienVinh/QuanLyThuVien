package EXE;

import UTIL.UTIL_ThaoTac;
import java.sql.Date;

public class Test {

    public static void main(String[] args) {
        UTIL_ThaoTac t = new UTIL_ThaoTac();
        Date d1 = t.LayNgayThangNamHienTai();
        Date d = t.CapNhatNgayThangNam(d1);
        System.out.println(d);
    }

}
