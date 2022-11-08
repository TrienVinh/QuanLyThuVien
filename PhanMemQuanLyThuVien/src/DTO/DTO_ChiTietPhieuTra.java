package DTO;

public class DTO_ChiTietPhieuTra {

    private String MaDauSach, MaDinhDanhSach, MaPhieuTra;

    public DTO_ChiTietPhieuTra() {
    }

    public DTO_ChiTietPhieuTra(String MaDauSach, String MaDinhDanhSach, String MaPhieuTra) {
        this.MaDauSach = MaDauSach;
        this.MaDinhDanhSach = MaDinhDanhSach;
        this.MaPhieuTra = MaPhieuTra;
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

    public String getMaPhieuTra() {
        return MaPhieuTra;
    }

    public void setMaPhieuTra(String MaPhieuTra) {
        this.MaPhieuTra = MaPhieuTra;
    }

}
