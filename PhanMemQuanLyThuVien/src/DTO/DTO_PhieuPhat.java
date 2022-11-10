package DTO;

import java.sql.Timestamp;

public class DTO_PhieuPhat {

    private Double TongTien;
    private String MaNhanVien, MaPhieuMuon, MaPhieuPhat;
    private Timestamp ThoiGian;

    public DTO_PhieuPhat() {
    }

    public DTO_PhieuPhat(Double TongTien, String MaNhanVien, String MaPhieuMuon, String MaPhieuPhat, Timestamp ThoiGian) {
        this.TongTien = TongTien;
        this.MaNhanVien = MaNhanVien;
        this.MaPhieuMuon = MaPhieuMuon;
        this.MaPhieuPhat = MaPhieuPhat;
        this.ThoiGian = ThoiGian;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
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

    public String getMaPhieuPhat() {
        return MaPhieuPhat;
    }

    public void setMaPhieuPhat(String MaPhieuPhat) {
        this.MaPhieuPhat = MaPhieuPhat;
    }

    public Timestamp getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Timestamp ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

}
