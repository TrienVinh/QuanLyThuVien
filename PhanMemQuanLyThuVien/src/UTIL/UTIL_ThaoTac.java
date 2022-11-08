package UTIL;

import java.util.Calendar;
import java.util.Date;

public class UTIL_ThaoTac {

    public Date LayThoiGianHienTai() {
        Calendar ThoiGian = Calendar.getInstance();
        Date ThoiGianHienTai = ThoiGian.getTime();
        return ThoiGianHienTai;
    }

    public String VietHoa(String Chuoi) {
        Chuoi = Chuoi.toUpperCase();
        return Chuoi;
    }

    public String XoaKhoangTrangThua(String Chuoi) {
        Chuoi = Chuoi.replaceAll("\\s+", " ");
        Chuoi = Chuoi.trim();
        return Chuoi;
    }

}
