package DTO;

public class DTO_ChiTietPhieuNhap {

    //Đơn giá
    private Double DonGia;
    
    //Số lượng sách
    private Integer SoLuongSach;
    
    //Mã đầu sách, mã phiếu nhập
    private String MaDauSach, MaPhieuNhap;

    public DTO_ChiTietPhieuNhap() {
    }

    public DTO_ChiTietPhieuNhap(Double DonGia, Integer SoLuongSach, String MaDauSach, String MaPhieuNhap) {
        this.DonGia = DonGia;
        this.SoLuongSach = SoLuongSach;
        this.MaDauSach = MaDauSach;
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
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

    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(String MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

}
