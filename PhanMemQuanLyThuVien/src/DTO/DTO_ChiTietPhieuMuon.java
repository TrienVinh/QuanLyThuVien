package DTO;

public class DTO_ChiTietPhieuMuon {

    private Integer SoLuong;
    private String MaDauSach, MaPhieuMuon;

    public DTO_ChiTietPhieuMuon() {
    }

    public DTO_ChiTietPhieuMuon(Integer SoLuong, String MaDauSach, String MaPhieuMuon) {
        this.SoLuong = SoLuong;
        this.MaDauSach = MaDauSach;
        this.MaPhieuMuon = MaPhieuMuon;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
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
