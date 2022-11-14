package DTO;

import java.sql.Timestamp;

public class DTO_PhieuNhap {

    //Tổng tiền
    private Double TongTien;
    
    //Mã nhà xuất bản, mã nhân viên, mã phiếu nhập
    private String MaNhaXuatBan, MaNhanVien, MaPhieuNhap;
    
    //Thời gian
    private Timestamp ThoiGian;

    public DTO_PhieuNhap() {
    }

    public DTO_PhieuNhap(Double TongTien, String MaNhaXuatBan, String MaNhanVien, String MaPhieuNhap, Timestamp ThoiGian) {
        this.TongTien = TongTien;
        this.MaNhaXuatBan = MaNhaXuatBan;
        this.MaNhanVien = MaNhanVien;
        this.MaPhieuNhap = MaPhieuNhap;
        this.ThoiGian = ThoiGian;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public String getMaNhaXuatBan() {
        return MaNhaXuatBan;
    }

    public void setMaNhaXuatBan(String MaNhaXuatBan) {
        this.MaNhaXuatBan = MaNhaXuatBan;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(String MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public Timestamp getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Timestamp ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

}
