package DTO;

public class DTO_TacGia {

    //Tồn tại (đã bị xóa hay chưa)
    private Boolean TonTai;
    
    //Mã tác giả, tên tác giả
    private String MaTacGia, TenTacGia;

    public DTO_TacGia() {
    }

    public DTO_TacGia(Boolean TonTai, String MaTacGia, String TenTacGia) {
        this.TonTai = TonTai;
        this.MaTacGia = MaTacGia;
        this.TenTacGia = TenTacGia;
    }

    public Boolean getTonTai() {
        return TonTai;
    }

    public void setTonTai(Boolean TonTai) {
        this.TonTai = TonTai;
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
