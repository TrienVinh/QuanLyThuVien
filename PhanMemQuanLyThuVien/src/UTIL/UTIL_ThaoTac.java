package UTIL;

import DTO.DTO_NgayThangNam;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class UTIL_ThaoTac {

    public Date ChuyenStringSangDate(String NgayThangNamDangString) {
        Date NgayThangNamDangDate = Date.valueOf(NgayThangNamDangString);
        return NgayThangNamDangDate;
    }

    public Date LayNgayThangNamHienTai() {
        long Millis = System.currentTimeMillis();
        Date NgayThangNamHienTai = new Date(Millis);
        return NgayThangNamHienTai;
    }

    public String ChuyenDateSangString(Date NgayThangNamDangDate) {
        SimpleDateFormat DinhDangNgayThangNam = new SimpleDateFormat("dd/MM/yyyy");
        String NgayThangNamDangString = DinhDangNgayThangNam.format(NgayThangNamDangDate);
        return NgayThangNamDangString;
    }

    public String ChuyenTimeSangString(Time ThoiGianDangTime) {
        SimpleDateFormat DinhDangThoiGian = new SimpleDateFormat("hh:mm:ss");
        String ThoiGianDangString = DinhDangThoiGian.format(ThoiGianDangTime);
        return ThoiGianDangString;
    }

    public String ChuyenDTO_NgayThangNamSangString(DTO_NgayThangNam NgayThangNam) {
        Integer Nam, Ngay, Thang;
        Nam = NgayThangNam.getNam();
        Ngay = NgayThangNam.getNgay();
        Thang = NgayThangNam.getThang();
        return String.valueOf(Nam) + "-" + String.valueOf(Thang) + "-" + String.valueOf(Ngay);
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

    public Timestamp LayThoiGianHienTai() {
        long Millis = System.currentTimeMillis();
        Timestamp NgayThangNamHienTai = new Timestamp(Millis);
        return NgayThangNamHienTai;
    }

    public String ChuyenTimestampSangString(Timestamp ThoiGianDangTimestamp) {
        SimpleDateFormat DinhDangTimeStamp = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        String ThoiGianDangString = DinhDangTimeStamp.format(ThoiGianDangTimestamp);
        return ThoiGianDangString;

    }

}
