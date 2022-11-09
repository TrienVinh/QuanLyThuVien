package DTO;

import java.sql.Date;

public class DTO_PhieuTra {

    private Date ThoiGian;
    private Integer SoLuong;
    private String MaNhanVien, MaPhieuMuon, MaPhieuTra;

    public DTO_PhieuTra() {
    }

    public DTO_PhieuTra(Date ThoiGian, Integer SoLuong, String MaNhanVien, String MaPhieuMuon, String MaPhieuTra) {
        this.ThoiGian = ThoiGian;
        this.SoLuong = SoLuong;
        this.MaNhanVien = MaNhanVien;
        this.MaPhieuMuon = MaPhieuMuon;
        this.MaPhieuTra = MaPhieuTra;
    }

    public Date getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Date ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaPhieuMuon() {
        return MaPhieuMuon;
    }

    public void setMaPhieuMuon(String MaPhieuMuon) {
        this.MaPhieuMuon = MaPhieuMuon;
    }

    public String getMaPhieuTra() {
        return MaPhieuTra;
    }

    public void setMaPhieuTra(String MaPhieuTra) {
        this.MaPhieuTra = MaPhieuTra;
    }

}
