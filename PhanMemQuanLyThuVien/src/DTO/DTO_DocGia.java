package DTO;

import java.util.Date;

public class DTO_DocGia extends DTO_ConNguoi {

    private Boolean TrangThai;
    private Date NgayDangKy, NgayGiaHan, NgayHetHan;
    private String MaDocGia, SoDienThoai;

    public DTO_DocGia() {
    }

    public DTO_DocGia(Boolean TrangThai, Date NgayDangKy, Date NgayGiaHan, Date NgayHetHan, String MaDocGia, String SoDienThoai) {
        this.TrangThai = TrangThai;
        this.NgayDangKy = NgayDangKy;
        this.NgayGiaHan = NgayGiaHan;
        this.NgayHetHan = NgayHetHan;
        this.MaDocGia = MaDocGia;
        this.SoDienThoai = SoDienThoai;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
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

}
