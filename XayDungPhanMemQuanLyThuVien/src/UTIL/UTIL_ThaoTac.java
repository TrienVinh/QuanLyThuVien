package UTIL;

import DTO.DTO_NgayThangNam;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UTIL_ThaoTac {

    //Cập nhật ngày tháng năm
    public Date CapNhatNgayThangNam(Date NgayThangNamDangDate) {
        Calendar Lich = Calendar.getInstance();
        SimpleDateFormat DinhDangNgayThangNam = new SimpleDateFormat("yyyy-MM-dd");
        String NgayThangNamDangString = DinhDangNgayThangNam.format(NgayThangNamDangDate);
        try {
            Lich.setTime(DinhDangNgayThangNam.parse(NgayThangNamDangString));
        } catch (ParseException ParseException) {
            Logger.getLogger(UTIL_ThaoTac.class.getName()).log(Level.SEVERE, null, ParseException);
        }
        Lich.add(Calendar.MONTH, 1);
        NgayThangNamDangString = DinhDangNgayThangNam.format(Lich.getTime());
        NgayThangNamDangDate = ChuyenStringSangDate(NgayThangNamDangString);
        return NgayThangNamDangDate;
    }

    //Chuyển ngày tháng năm dạng String sang dạng String
    public Date ChuyenStringSangDate(String NgayThangNamDangString) {
        Date NgayThangNamDangDate = Date.valueOf(NgayThangNamDangString);
        return NgayThangNamDangDate;
    }

    //Lấy ngày tháng năm hiện tại
    public Date LayNgayThangNamHienTai() {
        long MiliGiay = System.currentTimeMillis();
        Date NgayThangNamHienTai = new java.sql.Date(MiliGiay);
        return NgayThangNamHienTai;
    }

    //Chuyển ngày tháng năm dạng Date sang dạng String
    public String ChuyenDateSangString(Date NgayThangNamDangDate) {
        SimpleDateFormat DinhDangNgayThangNam = new SimpleDateFormat("dd/MM/yyyy");
        String NgayThangNamDangString = DinhDangNgayThangNam.format(NgayThangNamDangDate);
        return NgayThangNamDangString;
    }

    //Chuyển DTO_NgayThangNam sang dạng String
    public String ChuyenDTO_NgayThangNamSangString(DTO_NgayThangNam NgayThangNam) {
        Integer NamDangInteger = NgayThangNam.getNam();
        Integer NgayDangInteger = NgayThangNam.getNgay();
        Integer ThangDangInteger = NgayThangNam.getThang();
        String NamDangString = String.valueOf(NamDangInteger);
        String NgayDangString = String.valueOf(NgayDangInteger);
        String ThangDangString = String.valueOf(ThangDangInteger);
        String NgayThangNamDangString = NamDangString + "-" + ThangDangString + "-" + NgayDangString;
        return NgayThangNamDangString;
    }

    //Mã hóa mật khẩu
    public String MaHoaMatKhau(String MatKhauDangString) {
        Integer MatKhauDangInteger = MatKhauDangString.hashCode();
        MatKhauDangString = String.valueOf(MatKhauDangInteger);
        return MatKhauDangString;
    }

    //Viết hoa chuỗi
    public String VietHoa(String Chuoi) {
        Chuoi = Chuoi.toUpperCase();
        return Chuoi;
    }

    //Viết thường chuỗi
    public String VietThuong(String Chuoi) {
        Chuoi = Chuoi.toUpperCase();
        return Chuoi;
    }

    //Xóa khoảng trắng thừa của chuỗi
    public String XoaKhoangTrangThua(String Chuoi) {
        Chuoi = Chuoi.replaceAll("\\s+", " ");
        Chuoi = Chuoi.trim();
        return Chuoi;
    }

}
