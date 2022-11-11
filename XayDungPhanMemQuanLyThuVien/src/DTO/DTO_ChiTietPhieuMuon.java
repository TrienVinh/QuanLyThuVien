package DTO;

public class DTO_ChiTietPhieuMuon {

    private Integer SoLuongSach;
    private String MaDauSach, MaPhieuMuon;

    public DTO_ChiTietPhieuMuon() {
    }

    public DTO_ChiTietPhieuMuon(Integer SoLuongSach, String MaDauSach, String MaDinhDanhSach, String MaPhieuMuon) {
        this.SoLuongSach = SoLuongSach;
        this.MaDauSach = MaDauSach;
        this.MaPhieuMuon = MaPhieuMuon;
    }

    public Integer getSoLuongSach() {
        return SoLuongSach;
    }

    public void setSoLuongSach(Integer SoLuongSach) {
        this.SoLuongSach = SoLuongSach;
    }

    public String getMaDauSach() {
        return MaDauSach;
    }

    public void setMaDauSach(String MaDauSach) {
        this.MaDauSach = MaDauSach;
    }

    public String getMaPhieuMuon() {
        return MaPhieuMuon;
    }

    public void setMaPhieuMuon(String MaPhieuMuon) {
        this.MaPhieuMuon = MaPhieuMuon;
    }

}
