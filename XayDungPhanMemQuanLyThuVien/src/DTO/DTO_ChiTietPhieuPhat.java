package DTO;

public class DTO_ChiTietPhieuPhat {

    private Double LePhiBoiThuong;
    private String MaDauSach, MaPhieuPhat, MaSach, NoiDungPhat;

    public DTO_ChiTietPhieuPhat() {
    }

    public DTO_ChiTietPhieuPhat(Double LePhiBoiThuong, String MaDauSach, String MaPhieuPhat, String MaSach, String NoiDungPhat) {
        this.LePhiBoiThuong = LePhiBoiThuong;
        this.MaDauSach = MaDauSach;
        this.MaPhieuPhat = MaPhieuPhat;
        this.MaSach = MaSach;
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

    public String getMaPhieuPhat() {
        return MaPhieuPhat;
    }

    public void setMaPhieuPhat(String MaPhieuPhat) {
        this.MaPhieuPhat = MaPhieuPhat;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getNoiDungPhat() {
        return NoiDungPhat;
    }

    public void setNoiDungPhat(String NoiDungPhat) {
        this.NoiDungPhat = NoiDungPhat;
    }

}
