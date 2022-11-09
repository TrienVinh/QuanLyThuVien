package DTO;

import java.sql.Date;

public class DTO_NhatKyHoatDong {

    private Date ThoiGian;
    private String HoatDong, MaNhanVien;

    public DTO_NhatKyHoatDong() {
    }

    public DTO_NhatKyHoatDong(Date ThoiGian, String HoatDong, String MaNhanVien) {
        this.ThoiGian = ThoiGian;
        this.HoatDong = HoatDong;
        this.MaNhanVien = MaNhanVien;
    }

    public Date getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Date ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public String getHoatDong() {
        return HoatDong;
    }

    public void setHoatDong(String HoatDong) {
        this.HoatDong = HoatDong;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

}
