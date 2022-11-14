package DTO;

public class DTO_TaiKhoan {

    //Tồn tại (đã bị xóa hay chưa)
    private Boolean TonTai;
    
    //Mã nhân viên, mật khẩu, phân quyền
    private String MaNhanVien, MatKhau, PhanQuyen;

    public DTO_TaiKhoan() {
    }

    public DTO_TaiKhoan(Boolean TonTai, String MaNhanVien, String MatKhau, String PhanQuyen) {
        this.TonTai = TonTai;
        this.MaNhanVien = MaNhanVien;
        this.MatKhau = MatKhau;
        this.PhanQuyen = PhanQuyen;
    }

    public Boolean getTonTai() {
        return TonTai;
    }

    public void setTonTai(Boolean TonTai) {
        this.TonTai = TonTai;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getPhanQuyen() {
        return PhanQuyen;
    }

    public void setPhanQuyen(String PhanQuyen) {
        this.PhanQuyen = PhanQuyen;
    }

}
