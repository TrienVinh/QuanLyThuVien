package DTO;

import java.sql.Date;

public class DTO_DocGia {

    //Tồn tại (đã bị xóa hay chưa)
    private Boolean TonTai;
    
    //Ngày đăng ký, ngày gia hạn, ngày hết hạn
    private Date NgayDangKy, NgayGiaHan, NgayHetHan;
    
    //Mã độc giả, số điện thoại, tên độc giả
    private String MaDocGia, SoDienThoai, TenDocGia;

    public DTO_DocGia() {
    }

    public DTO_DocGia(Boolean TonTai, Date NgayDangKy, Date NgayGiaHan, Date NgayHetHan, String MaDocGia, String SoDienThoai, String TenDocGia) {
        this.TonTai = TonTai;
        this.NgayDangKy = NgayDangKy;
        this.NgayGiaHan = NgayGiaHan;
        this.NgayHetHan = NgayHetHan;
        this.MaDocGia = MaDocGia;
        this.SoDienThoai = SoDienThoai;
        this.TenDocGia = TenDocGia;
    }

    public Boolean getTonTai() {
        return TonTai;
    }

    public void setTonTai(Boolean TonTai) {
        this.TonTai = TonTai;
    }

    public Date getNgayDangKy() {
        return NgayDangKy;
    }

    public void setNgayDangKy(Date NgayDangKy) {
        this.NgayDangKy = NgayDangKy;
    }

    public Date getNgayGiaHan() {
        return NgayGiaHan;
    }

    public void setNgayGiaHan(Date NgayGiaHan) {
        this.NgayGiaHan = NgayGiaHan;
    }

    public Date getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(Date NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }

    public String getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(String MaDocGia) {
        this.MaDocGia = MaDocGia;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getTenDocGia() {
        return TenDocGia;
    }

    public void setTenDocGia(String TenDocGia) {
        this.TenDocGia = TenDocGia;
    }

}
