package DTO;

import java.sql.Timestamp;

public class DTO_PhieuTra {

    private Integer TongSach;
    private String MaNhanVien, MaPhieuMuon, MaPhieuTra;
    private Timestamp ThoiGian;

    public DTO_PhieuTra() {
    }

    public DTO_PhieuTra(Integer TongSach, String MaNhanVien, String MaPhieuMuon, String MaPhieuTra, Timestamp ThoiGian) {
        this.TongSach = TongSach;
        this.MaNhanVien = MaNhanVien;
        this.MaPhieuMuon = MaPhieuMuon;
        this.MaPhieuTra = MaPhieuTra;
        this.ThoiGian = ThoiGian;
    }

    public Integer getTongSach() {
        return TongSach;
    }

    public void setTongSach(Integer TongSach) {
        this.TongSach = TongSach;
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

    public Timestamp getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Timestamp ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

}
