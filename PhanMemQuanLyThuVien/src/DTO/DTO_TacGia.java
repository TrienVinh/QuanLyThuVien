package DTO;

public class DTO_TacGia {

    private Boolean TrangThai;
    private String MaTacGia, TenTacGia;

    public DTO_TacGia() {
    }

    public DTO_TacGia(Boolean TrangThai, String MaTacGia, String TenTacGia) {
        this.TrangThai = TrangThai;
        this.MaTacGia = MaTacGia;
        this.TenTacGia = TenTacGia;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaTacGia() {
        return MaTacGia;
    }

    public void setMaTacGia(String MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

}
