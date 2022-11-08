package DTO;

import java.util.Date;

public abstract class DTO_ConNguoi {

    private Date NgaySinh;
    private String HoTen, GioiTinh;

    public DTO_ConNguoi() {
    }

    public DTO_ConNguoi(Date NgaySinh, String HoTen, String GioiTinh) {
        this.NgaySinh = NgaySinh;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

}
