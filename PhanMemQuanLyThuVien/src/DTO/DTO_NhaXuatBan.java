package DTO;

public class DTO_NhaXuatBan {

    private Boolean TrangThai;
    private String MaNhaXuatBan, TenNhaXuatBan;

    public DTO_NhaXuatBan() {
    }

    public DTO_NhaXuatBan(Boolean TrangThai, String MaNhaXuatBan, String TenNhaXuatBan) {
        this.TrangThai = TrangThai;
        this.MaNhaXuatBan = MaNhaXuatBan;
        this.TenNhaXuatBan = TenNhaXuatBan;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaNhaXuatBan() {
        return MaNhaXuatBan;
    }

    public void setMaNhaXuatBan(String MaNhaXuatBan) {
        this.MaNhaXuatBan = MaNhaXuatBan;
    }

    public String getTenNhaXuatBan() {
        return TenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String TenNhaXuatBan) {
        this.TenNhaXuatBan = TenNhaXuatBan;
    }

}
