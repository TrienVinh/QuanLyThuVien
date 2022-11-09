package DTO;

import java.sql.Timestamp;

public class DTO_NhatKyHoatDong {

    private String HoatDong, MaNhanVien;
    private Timestamp ThoiGian;

    public DTO_NhatKyHoatDong() {
    }

    public DTO_NhatKyHoatDong(String HoatDong, String MaNhanVien, Timestamp ThoiGian) {
        this.HoatDong = HoatDong;
        this.MaNhanVien = MaNhanVien;
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

    public Timestamp getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Timestamp ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

}
