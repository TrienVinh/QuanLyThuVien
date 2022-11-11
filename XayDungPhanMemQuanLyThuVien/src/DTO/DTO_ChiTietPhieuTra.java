package DTO;

public class DTO_ChiTietPhieuTra {

    private Integer SoLuongSach;
    private String MaDauSach, MaPhieuTra;

    public DTO_ChiTietPhieuTra() {
    }

    public DTO_ChiTietPhieuTra(Integer SoLuongSach, String MaDauSach, String MaPhieuTra) {
        this.SoLuongSach = SoLuongSach;
        this.MaDauSach = MaDauSach;
        this.MaPhieuTra = MaPhieuTra;
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

    public String getMaPhieuTra() {
        return MaPhieuTra;
    }

    public void setMaPhieuTra(String MaPhieuTra) {
        this.MaPhieuTra = MaPhieuTra;
    }

}
