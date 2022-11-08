package DTO;

public class DTO_ChiTietPhieuPhat {

    private Double LePhiBoiThuong;
    private String MaDauSach, MaDinhDanhSach, MaPhieuPhat, NoiDungPhat;

    public DTO_ChiTietPhieuPhat() {
    }

    public DTO_ChiTietPhieuPhat(Double LePhiBoiThuong, String MaDauSach, String MaDinhDanhSach, String MaPhieuPhat, String NoiDungPhat) {
        this.LePhiBoiThuong = LePhiBoiThuong;
        this.MaDauSach = MaDauSach;
        this.MaDinhDanhSach = MaDinhDanhSach;
        this.MaPhieuPhat = MaPhieuPhat;
        this.NoiDungPhat = NoiDungPhat;
    }

    public Double getLePhiBoiThuong() {
        return LePhiBoiThuong;
    }

    public void setLePhiBoiThuong(Double LePhiBoiThuong) {
        this.LePhiBoiThuong = LePhiBoiThuong;
    }

    public String getMaDauSach() {
        return MaDauSach;
    }

    public void setMaDauSach(String MaDauSach) {
        this.MaDauSach = MaDauSach;
    }

    public String getMaDinhDanhSach() {
        return MaDinhDanhSach;
    }

    public void setMaDinhDanhSach(String MaDinhDanhSach) {
        this.MaDinhDanhSach = MaDinhDanhSach;
    }

    public String getMaPhieuPhat() {
        return MaPhieuPhat;
    }

    public void setMaPhieuPhat(String MaPhieuPhat) {
        this.MaPhieuPhat = MaPhieuPhat;
    }

    public String getNoiDungPhat() {
        return NoiDungPhat;
    }

    public void setNoiDungPhat(String NoiDungPhat) {
        this.NoiDungPhat = NoiDungPhat;
    }

}
