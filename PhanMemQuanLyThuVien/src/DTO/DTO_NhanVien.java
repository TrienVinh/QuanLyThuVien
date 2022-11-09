package DTO;

import java.sql.Date;

public class DTO_NhanVien {

    private Boolean TrangThai;
    private Date NgaySinh;
    private String MaNhanVien, SoDienThoai, TenNhanVien;

    public DTO_NhanVien() {
    }

    public DTO_NhanVien(Boolean TrangThai, Date NgaySinh, String MaNhanVien, String SoDienThoai, String TenNhanVien) {
        this.TrangThai = TrangThai;
        this.NgaySinh = NgaySinh;
        this.MaNhanVien = MaNhanVien;
        this.SoDienThoai = SoDienThoai;
        this.TenNhanVien = TenNhanVien;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

}
