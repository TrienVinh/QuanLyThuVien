package DTO;

public class DTO_NgonNgu {

    //Tồn tại (đã bị xóa hay chưa)
    private Boolean TonTai;
    
    //Mã ngôn ngữ, tên ngôn ngữ
    private String MaNgonNgu, TenNgonNgu;

    public DTO_NgonNgu() {
    }

    public DTO_NgonNgu(Boolean TonTai, String MaNgonNgu, String TenNgonNgu) {
        this.TonTai = TonTai;
        this.MaNgonNgu = MaNgonNgu;
        this.TenNgonNgu = TenNgonNgu;
    }

    public Boolean getTonTai() {
        return TonTai;
    }

    public void setTonTai(Boolean TonTai) {
        this.TonTai = TonTai;
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
