package DTO;

public class DTO_DauSach {

    private Boolean TrangThai;
    private Double DonGia;
    private Integer SoLuong;
    private String MaDauSach, MaNgonNgu, MaNhaXuatBan, MaTacGia, MaTheLoai, TenDauSach;

    public DTO_DauSach() {
    }

    public DTO_DauSach(Boolean TrangThai, Double DonGia, Integer SoLuong, String MaDauSach, String MaNgonNgu, String MaNhaXuatBan, String MaTacGia, String MaTheLoai, String TenDauSach) {
        this.TrangThai = TrangThai;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.MaDauSach = MaDauSach;
        this.MaNgonNgu = MaNgonNgu;
        this.MaNhaXuatBan = MaNhaXuatBan;
        this.MaTacGia = MaTacGia;
        this.MaTheLoai = MaTheLoai;
        this.TenDauSach = TenDauSach;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
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

    public String getMaNgonNgu() {
        return MaNgonNgu;
    }

    public void setMaNgonNgu(String MaNgonNgu) {
        this.MaNgonNgu = MaNgonNgu;
    }

    public String getMaNhaXuatBan() {
        return MaNhaXuatBan;
    }

    public void setMaNhaXuatBan(String MaNhaXuatBan) {
        this.MaNhaXuatBan = MaNhaXuatBan;
    }

    public String getMaTacGia() {
        return MaTacGia;
    }

    public void setMaTacGia(String MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public String getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(String MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public String getTenDauSach() {
        return TenDauSach;
    }

    public void setTenDauSach(String TenDauSach) {
        this.TenDauSach = TenDauSach;
    }

}
