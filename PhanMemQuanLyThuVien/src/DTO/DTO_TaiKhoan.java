package DTO;

public class DTO_TaiKhoan {

    private Boolean TrangThai;
    private String MaNhanVien, MatKhau, PhanQuyen, TinhTrang;

    public DTO_TaiKhoan() {
    }

    public DTO_TaiKhoan(Boolean TrangThai, String MaNhanVien, String MatKhau, String PhanQuyen, String TinhTrang) {
        this.TrangThai = TrangThai;
        this.MaNhanVien = MaNhanVien;
        this.MatKhau = MatKhau;
        this.PhanQuyen = PhanQuyen;
        this.TinhTrang = TinhTrang;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getPhanQuyen() {
        return PhanQuyen;
    }

    public void setPhanQuyen(String PhanQuyen) {
        this.PhanQuyen = PhanQuyen;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

}
