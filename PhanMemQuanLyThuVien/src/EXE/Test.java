package EXE;

import UTIL.UTIL_ThaoTac;
import java.sql.Timestamp;

public class Test {

    public static void main(String[] args) {
        UTIL_ThaoTac T = new UTIL_ThaoTac();
        Timestamp s = T.LayThoiGianHienTai();
        String str = T.ChuyenTimestampSangString(s);
        System.out.println(str);

    }

}
