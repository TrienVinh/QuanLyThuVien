package DTO;

public class DTO_DauSach {

    //Tồn tại (đã bị xóa hay chưa)
    private Boolean TonTai;
    
    //Đơn giá
    private Double DonGia;
    
    //Số lượng sách, số lượng sách khả dụng (số lượng sách còn nguyên vẹn)
    private Integer SoLuongSach, SoLuongSachKhaDung;
    
    //Mã đầu sách, mã ngôn ngữ, mã nhà xuất bản, mã tác giả, mã thể loại, tên đầu sách
    private String MaDauSach, MaNgonNgu, MaNhaXuatBan, MaTacGia, MaTheLoai, TenDauSach;

    public DTO_DauSach() {
    }

    public DTO_DauSach(Boolean TonTai, Double DonGia, Integer SoLuongSach, Integer SoLuongSachKhaDung, String MaDauSach, String MaNgonNgu, String MaNhaXuatBan, String MaTacGia, String MaTheLoai, String TenDauSach) {
        this.TonTai = TonTai;
        this.DonGia = DonGia;
        this.SoLuongSach = SoLuongSach;
        this.SoLuongSachKhaDung = SoLuongSachKhaDung;
        this.MaDauSach = MaDauSach;
        this.MaNgonNgu = MaNgonNgu;
        this.MaNhaXuatBan = MaNhaXuatBan;
        this.MaTacGia = MaTacGia;
        this.MaTheLoai = MaTheLoai;
        this.TenDauSach = TenDauSach;
    }

    public Boolean getTonTai() {
        return TonTai;
    }

    public void setTonTai(Boolean TonTai) {
        this.TonTai = TonTai;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public Integer getSoLuongSach() {
        return SoLuongSach;
    }

    public void setSoLuongSach(Integer SoLuongSach) {
        this.SoLuongSach = SoLuongSach;
    }

    public Integer getSoLuongSachKhaDung() {
        return SoLuongSachKhaDung;
    }

    public void setSoLuongSachKhaDung(Integer SoLuongSachKhaDung) {
        this.SoLuongSachKhaDung = SoLuongSachKhaDung;
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
