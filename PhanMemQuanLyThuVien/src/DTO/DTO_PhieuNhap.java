package DTO;

import java.sql.Date;

public class DTO_PhieuNhap {

    private Date ThoiGian;
    private Double TongTien;
    private String MaNhaXuatBan, MaNhanVien, MaPhieuNhap;

    public DTO_PhieuNhap() {
    }

    public DTO_PhieuNhap(Date ThoiGian, Double TongTien, String MaNhaXuatBan, String MaNhanVien, String MaPhieuNhap) {
        this.ThoiGian = ThoiGian;
        this.TongTien = TongTien;
        this.MaNhaXuatBan = MaNhaXuatBan;
        this.MaNhanVien = MaNhanVien;
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public Date getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Date ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public String getMaNhaXuatBan() {
        return MaNhaXuatBan;
    }

    public void setMaNhaXuatBan(String MaNhaXuatBan) {
        this.MaNhaXuatBan = MaNhaXuatBan;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(String MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

}
