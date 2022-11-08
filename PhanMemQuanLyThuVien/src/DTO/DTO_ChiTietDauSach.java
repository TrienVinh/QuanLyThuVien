package DTO;

public class DTO_ChiTietDauSach {

    private String MaDauSach, MaDinhDanhSach, MaPhieuMuon, TinhTrang;

    public DTO_ChiTietDauSach() {
    }

    public DTO_ChiTietDauSach(String MaDauSach, String MaDinhDanhSach, String MaPhieuMuon, String TinhTrang) {
        this.MaDauSach = MaDauSach;
        this.MaDinhDanhSach = MaDinhDanhSach;
        this.MaPhieuMuon = MaPhieuMuon;
        this.TinhTrang = TinhTrang;
    }

    public String getMaDauSach() {
        return MaDauSach;
    }

    public void setMaDauSach(String MaDauSach) {
        this.MaDauSach = MaDauSach;
    }

    public String getMaDinhDanhSach() {
        return MaDinhDanhSach;
    }

    public void setMaDinhDanhSach(String MaDinhDanhSach) {
        this.MaDinhDanhSach = MaDinhDanhSach;
    }

    public String getMaPhieuMuon() {
        return MaPhieuMuon;
    }

    public void setMaPhieuMuon(String MaPhieuMuon) {
        this.MaPhieuMuon = MaPhieuMuon;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

}
