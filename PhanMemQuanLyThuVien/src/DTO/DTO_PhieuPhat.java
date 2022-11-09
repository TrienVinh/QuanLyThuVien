package DTO;

import java.sql.Date;

public class DTO_PhieuPhat {

    private Date ThoiGian;
    private Double TongTien;
    private String MaNhanVien, MaPhieuMuon, MaPhieuPhat;

    public DTO_PhieuPhat() {
    }

    public DTO_PhieuPhat(Date ThoiGian, Double TongTien, String MaNhanVien, String MaPhieuMuon, String MaPhieuPhat) {
        this.ThoiGian = ThoiGian;
        this.TongTien = TongTien;
        this.MaNhanVien = MaNhanVien;
        this.MaPhieuMuon = MaPhieuMuon;
        this.MaPhieuPhat = MaPhieuPhat;
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

}
