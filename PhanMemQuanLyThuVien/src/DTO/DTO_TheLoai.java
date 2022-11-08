package DTO;

public class DTO_TheLoai {

    private Boolean TrangThai;
    private String MaTheLoai, TenTheLoai;

    public DTO_TheLoai() {
    }

    public DTO_TheLoai(Boolean TrangThai, String MaTheLoai, String TenTheLoai) {
        this.TrangThai = TrangThai;
        this.MaTheLoai = MaTheLoai;
        this.TenTheLoai = TenTheLoai;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(String MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public String getTenTheLoai() {
        return TenTheLoai;
    }

    public void setTenTheLoai(String TenTheLoai) {
        this.TenTheLoai = TenTheLoai;
    }

}
