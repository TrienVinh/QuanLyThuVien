package DTO;

import java.sql.Date;
import java.sql.Timestamp;

public class DTO_Test {

    private Date Ngay;
    private Timestamp ThoiGian;

    public DTO_Test() {
    }

    public DTO_Test(Date Ngay, Timestamp ThoiGian) {
        this.Ngay = Ngay;
        this.ThoiGian = ThoiGian;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }

    public Timestamp getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Timestamp ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

}
