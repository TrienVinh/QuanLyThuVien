package DTO;

import java.sql.Timestamp;

public class DTO_PhieuMuon {

    //Tổng sách 
    private Integer TongSach;
    
    //Mã độc giả, mã nhân viên, mã phiếu mượn
    private String MaDocGia, MaNhanVien, MaPhieuMuon;
    
    //Thời gian
    private Timestamp ThoiGian;

    public DTO_PhieuMuon() {
    }

    public DTO_PhieuMuon(Integer TongSach, String MaDocGia, String MaNhanVien, String MaPhieuMuon, Timestamp ThoiGian) {
        this.TongSach = TongSach;
        this.MaDocGia = MaDocGia;
        this.MaNhanVien = MaNhanVien;
        this.MaPhieuMuon = MaPhieuMuon;
        this.ThoiGian = ThoiGian;
    }

    public Integer getTongSach() {
        return TongSach;
    }

    public void setTongSach(Integer TongSach) {
        this.TongSach = TongSach;
    }

    public String getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(String MaDocGia) {
        this.MaDocGia = MaDocGia;
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

    public Timestamp getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Timestamp ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

}
