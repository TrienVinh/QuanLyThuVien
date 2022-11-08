package DTO;

public class DTO_ChiTietPhieuNhap {

    private Double DonGia;
    private Integer SoLuong;
    private String MaDauSach, MaPhieuNhap;

    public DTO_ChiTietPhieuNhap() {
    }

    public DTO_ChiTietPhieuNhap(Double DonGia, Integer SoLuong, String MaDauSach, String MaPhieuNhap) {
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.MaDauSach = MaDauSach;
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
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

    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(String MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

}
