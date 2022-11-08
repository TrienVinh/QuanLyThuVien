package DTO;

import java.util.Date;

public class DTO_PhieuMuon {

    private Date ThoiGian;
    private Integer SoLuong;
    private String MaDocGia, MaNhanVien, MaPhieuMuon;

    public DTO_PhieuMuon() {
    }

    public DTO_PhieuMuon(Date ThoiGian, Integer SoLuong, String MaDocGia, String MaNhanVien, String MaPhieuMuon) {
        this.ThoiGian = ThoiGian;
        this.SoLuong = SoLuong;
        this.MaDocGia = MaDocGia;
        this.MaNhanVien = MaNhanVien;
        this.MaPhieuMuon = MaPhieuMuon;
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

}
