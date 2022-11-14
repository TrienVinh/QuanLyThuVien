package DTO;

public class DTO_NgayThangNam {

    //Năm, ngày, tháng
    private Integer Nam, Ngay, Thang;

    public DTO_NgayThangNam() {
    }

    public DTO_NgayThangNam(Integer Nam, Integer Ngay, Integer Thang) {
        this.Nam = Nam;
        this.Ngay = Ngay;
        this.Thang = Thang;
    }

    public Integer getNam() {
        return Nam;
    }

    public void setNam(Integer Nam) {
        this.Nam = Nam;
    }

    public Integer getNgay() {
        return Ngay;
    }

    public void setNgay(Integer Ngay) {
        this.Ngay = Ngay;
    }

    public Integer getThang() {
        return Thang;
    }

    public void setThang(Integer Thang) {
        this.Thang = Thang;
    }

}
