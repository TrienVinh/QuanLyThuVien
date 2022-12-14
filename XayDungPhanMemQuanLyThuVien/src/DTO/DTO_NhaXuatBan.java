package DTO;

public class DTO_NhaXuatBan {

    //Tồn tại (đã bị xóa hay chưa)
    private Boolean TonTai;
    
    //Mã nhà xuất bản, tên nhà xuất bản
    private String MaNhaXuatBan, TenNhaXuatBan;

    public DTO_NhaXuatBan() {
    }

    public DTO_NhaXuatBan(Boolean TonTai, String MaNhaXuatBan, String TenNhaXuatBan) {
        this.TonTai = TonTai;
        this.MaNhaXuatBan = MaNhaXuatBan;
        this.TenNhaXuatBan = TenNhaXuatBan;
    }

    public Boolean getTonTai() {
        return TonTai;
    }

    public void setTonTai(Boolean TonTai) {
        this.TonTai = TonTai;
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
