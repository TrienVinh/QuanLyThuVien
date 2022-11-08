package DTO;

public class DTO_NgonNgu {

    private Boolean TrangThai;
    private String MaNgonNgu, TenNgonNgu;

    public DTO_NgonNgu() {
    }

    public DTO_NgonNgu(Boolean TrangThai, String MaNgonNgu, String TenNgonNgu) {
        this.TrangThai = TrangThai;
        this.MaNgonNgu = MaNgonNgu;
        this.TenNgonNgu = TenNgonNgu;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaNgonNgu() {
        return MaNgonNgu;
    }

    public void setMaNgonNgu(String MaNgonNgu) {
        this.MaNgonNgu = MaNgonNgu;
    }

    public String getTenNgonNgu() {
        return TenNgonNgu;
    }

    public void setTenNgonNgu(String TenNgonNgu) {
        this.TenNgonNgu = TenNgonNgu;
    }

}
