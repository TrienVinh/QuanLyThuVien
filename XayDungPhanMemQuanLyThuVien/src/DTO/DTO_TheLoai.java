package DTO;

public class DTO_TheLoai {

    //Tồn tại (đã bị xóa hay chưa)
    private Boolean TonTai;
    
    //Mã thể loại, tên thể loại
    private String MaTheLoai, TenTheLoai;

    public DTO_TheLoai() {
    }

    public DTO_TheLoai(Boolean TonTai, String MaTheLoai, String TenTheLoai) {
        this.TonTai = TonTai;
        this.MaTheLoai = MaTheLoai;
        this.TenTheLoai = TenTheLoai;
    }

    public Boolean getTonTai() {
        return TonTai;
    }

    public void setTonTai(Boolean TonTai) {
        this.TonTai = TonTai;
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
