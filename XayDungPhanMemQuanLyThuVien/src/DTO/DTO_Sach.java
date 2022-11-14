package DTO;

public class DTO_Sach {

    //Mã đầu sách, mã phiếu mượn, mã phiếu trả, mã sách, tình trạng
    private String MaDauSach, MaPhieuMuon, MaPhieuTra, MaSach, TinhTrang;

    public DTO_Sach() {
    }

    public DTO_Sach(String MaDauSach, String MaPhieuMuon, String MaPhieuTra, String MaSach, String TinhTrang) {
        this.MaDauSach = MaDauSach;
        this.MaPhieuMuon = MaPhieuMuon;
        this.MaPhieuTra = MaPhieuTra;
        this.MaSach = MaSach;
        this.TinhTrang = TinhTrang;
    }

    public String getMaDauSach() {
        return MaDauSach;
    }

    public void setMaDauSach(String MaDauSach) {
        this.MaDauSach = MaDauSach;
    }

    public String getMaPhieuMuon() {
        return MaPhieuMuon;
    }

    public void setMaPhieuMuon(String MaPhieuMuon) {
        this.MaPhieuMuon = MaPhieuMuon;
    }

    public String getMaPhieuTra() {
        return MaPhieuTra;
    }

    public void setMaPhieuTra(String MaPhieuTra) {
        this.MaPhieuTra = MaPhieuTra;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

}
