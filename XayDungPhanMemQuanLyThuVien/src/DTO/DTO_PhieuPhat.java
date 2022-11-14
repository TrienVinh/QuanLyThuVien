package DTO;

import java.sql.Timestamp;

public class DTO_PhieuPhat {

    //Tổng tiền
    private Double TongTien;
    
    //Mã nhân viên, mã phiếu mượn, mã phiếu phạt
    private String MaNhanVien, MaPhieuMuon, MaPhieuPhat;
    
    //Thời gian
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
