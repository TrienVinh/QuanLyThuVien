package UTIL;

import DTO.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UTIL_ThaoTac {

    public Date ChuyenStringSangDate(String NgayThangNamDangString) {
        Date NgayThangNamDangDate = Date.valueOf(NgayThangNamDangString);
        return NgayThangNamDangDate;
    }

    public Date ThayDoiThoiGian(Date NgayThangNamTruocKhiCong) {
        Calendar Lich = Calendar.getInstance();
        SimpleDateFormat DinhDangNgayThangNam = new SimpleDateFormat("yyyy-MM-dd");
        String NgayThangNamDangString = DinhDangNgayThangNam.format(NgayThangNamTruocKhiCong);
        try {
            Lich.setTime(DinhDangNgayThangNam.parse(NgayThangNamDangString));
        } catch (ParseException ex) {
            Logger.getLogger(UTIL_ThaoTac.class.getName()).log(Level.SEVERE, null, ex);
        }
        Lich.add(Calendar.MONTH, 1);
        NgayThangNamDangString = DinhDangNgayThangNam.format(Lich.getTime());
        Date NgayThangNamSauKhiCong = ChuyenStringSangDate(NgayThangNamDangString);
        return NgayThangNamSauKhiCong;
    }

    public Date LayNgayThangNamHienTai() {
        long Millis = System.currentTimeMillis();
        Date NgayThangNamHienTai = new Date(Millis);
        return NgayThangNamHienTai;
    }

    public DTO_NgayThangNam ChuyenStringSangDTO_NgayThangNam(String NgayThangNamDangString) {
        DTO_NgayThangNam NgayThangNam = new DTO_NgayThangNam();
        HashMap<Integer, String> LuuTru = new HashMap<>();
        Integer Dem = 0;
        StringTokenizer TachChuoi = new StringTokenizer(NgayThangNamDangString, "/");
        while (TachChuoi.hasMoreTokens()) {
            LuuTru.put(Dem, TachChuoi.nextToken());
            Dem++;
        }
        Integer Nam = Integer.parseInt(LuuTru.get(2));
        Integer Ngay = Integer.parseInt(LuuTru.get(0));
        Integer Thang = Integer.parseInt(LuuTru.get(1));
        NgayThangNam.setNgay(Ngay);
        NgayThangNam.setThang(Thang);
        NgayThangNam.setNam(Nam);
        return NgayThangNam;
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

    public String MaHoaMatKhau(String MatKhauTruocKhiMaHoa) {
        Integer MatKhauSauKhiMaHoa = MatKhauTruocKhiMaHoa.hashCode();
        String MatKhauDangString = String.valueOf(MatKhauSauKhiMaHoa);
        return MatKhauDangString;
    }

    public String TaoMaDauSach(Integer ChieuDaiDanhSachDauSach) {
        String MaDauSach = "DS";
        if (ChieuDaiDanhSachDauSach < 10) {
            MaDauSach += "0";
        }
        MaDauSach += String.valueOf(ChieuDaiDanhSachDauSach + 1);
        return MaDauSach;
    }

    public String TaoMaDinhDanhSach() {
        Random NgauNhien = new Random();
        String MaDinhDanhSach = "";
        for (int i = 0; i < 15; i++) {
            MaDinhDanhSach += String.valueOf(NgauNhien.nextInt(10));
        }
        return MaDinhDanhSach;
    }

    public String TaoMaDocGia(Integer ChieuDaiDanhSachDocGia) {
        String MaDocGia = "DG";
        if (ChieuDaiDanhSachDocGia < 10) {
            MaDocGia += "0";
        }
        MaDocGia += String.valueOf(ChieuDaiDanhSachDocGia + 1);
        return MaDocGia;
    }

    public String TaoMaNgonNgu(Integer ChieuDaiDanhSachNgonNgu) {
        String MaNgonNgu = "NN";
        if (ChieuDaiDanhSachNgonNgu < 10) {
            MaNgonNgu += "0";
        }
        MaNgonNgu += String.valueOf(ChieuDaiDanhSachNgonNgu + 1);
        return MaNgonNgu;
    }

    public String TaoMaNhaXuatBan(Integer ChieuDaiDanhSachNhaXuatBan) {
        String MaNhaXuatBan = "NXB";
        if (ChieuDaiDanhSachNhaXuatBan < 10) {
            MaNhaXuatBan += "0";
        }
        MaNhaXuatBan += String.valueOf(ChieuDaiDanhSachNhaXuatBan + 1);
        return MaNhaXuatBan;
    }

    public String TaoMaNhanVien(Integer ChieuDaiDanhSachNhanVien) {
        String MaNhanVien = "NV";
        if (ChieuDaiDanhSachNhanVien < 10) {
            MaNhanVien += "0";
        }
        MaNhanVien += String.valueOf(ChieuDaiDanhSachNhanVien + 1);
        return MaNhanVien;
    }

    public String TaoMaPhieuMuon(Integer ChieuDaiDanhSachPhieuMuon) {
        String MaPhieuMuon = "PM";
        if (ChieuDaiDanhSachPhieuMuon < 10) {
            MaPhieuMuon += "0";
        }
        MaPhieuMuon += String.valueOf(ChieuDaiDanhSachPhieuMuon + 1);
        return MaPhieuMuon;
    }

    public String TaoMaPhieuNhap(Integer ChieuDaiDanhSachPhieuNhap) {
        String MaPhieuNhap = "PN";
        if (ChieuDaiDanhSachPhieuNhap < 10) {
            MaPhieuNhap += "0";
        }
        MaPhieuNhap += String.valueOf(ChieuDaiDanhSachPhieuNhap + 1);
        return MaPhieuNhap;
    }

    public String TaoMaPhieuPhat(Integer ChieuDaiDanhSachPhieuPhat) {
        String MaPhieuPhat = "PP";
        if (ChieuDaiDanhSachPhieuPhat < 10) {
            MaPhieuPhat += "0";
        }
        MaPhieuPhat += String.valueOf(ChieuDaiDanhSachPhieuPhat + 1);
        return MaPhieuPhat;
    }

    public String TaoMaPhieuTra(Integer ChieuDaiDanhSachPhieuTra) {
        String MaPhieuTra = "PT";
        if (ChieuDaiDanhSachPhieuTra < 10) {
            MaPhieuTra += "0";
        }
        MaPhieuTra += String.valueOf(ChieuDaiDanhSachPhieuTra + 1);
        return MaPhieuTra;
    }

    public String TaoMaTacGia(Integer ChieuDaiDanhSachTacGia) {
        String MaTacGia = "TG";
        if (ChieuDaiDanhSachTacGia < 10) {
            MaTacGia += "0";
        }
        MaTacGia += String.valueOf(ChieuDaiDanhSachTacGia + 1);
        return MaTacGia;
    }

    public String TaoMaTheLoai(Integer ChieuDaiDanhSachTheLoai) {
        String MaTheLoai = "TL";
        if (ChieuDaiDanhSachTheLoai < 10) {
            MaTheLoai += "0";
        }
        MaTheLoai += String.valueOf(ChieuDaiDanhSachTheLoai + 1);
        return MaTheLoai;
    }

    public String VietHoaChuoi(String Chuoi) {
        Chuoi = Chuoi.toUpperCase();
        return Chuoi;
    }

    public String XoaKhoangTrangThua(String Chuoi) {
        Chuoi = Chuoi.replaceAll("\\s+", " ");
        Chuoi = Chuoi.trim();
        return Chuoi;
    }

    public String ChuyenTimestampSangString(Timestamp ThoiGianDangTimestamp) {
        SimpleDateFormat DinhDangTimeStamp = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        String ThoiGianDangString = DinhDangTimeStamp.format(ThoiGianDangTimestamp);
        return ThoiGianDangString;

    }

    public Timestamp LayThoiGianHienTai() {
        long Millis = System.currentTimeMillis();
        Timestamp NgayThangNamHienTai = new Timestamp(Millis);
        return NgayThangNamHienTai;
    }

}
