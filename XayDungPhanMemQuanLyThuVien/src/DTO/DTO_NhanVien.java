package DTO;

import java.sql.Date;

public class DTO_NhanVien {

    //Tồn tại (đã bị xóa hay chưa)
    private Boolean TonTai;
    
    //Ngày sinh
    private Date NgaySinh;
    
    //Mã nhân viên, số điện thoại, tên nhân viên
    private String MaNhanVien, SoDienThoai, TenNhanVien;

    public DTO_NhanVien() {
    }

    public DTO_NhanVien(Boolean TonTai, Date NgaySinh, String MaNhanVien, String SoDienThoai, String TenNhanVien) {
        this.TonTai = TonTai;
        this.NgaySinh = NgaySinh;
        this.MaNhanVien = MaNhanVien;
        this.SoDienThoai = SoDienThoai;
        this.TenNhanVien = TenNhanVien;
    }

    public Boolean getTonTai() {
        return TonTai;
    }

    public void setTonTai(Boolean TonTai) {
        this.TonTai = TonTai;
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
