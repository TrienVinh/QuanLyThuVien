package UTIL;

import DAO.MySQLConnection;
import javax.swing.JOptionPane;

public class UTIL_KiemTra {

    UTIL_ThaoTac ThaoTac = new UTIL_ThaoTac();

    public Boolean KiemTraNhapMaDauSach(String MaDauSach) {
        String DinhDang = "DG" + "[0-9]{2}";
        MaDauSach = ThaoTac.VietHoa(MaDauSach);
        MaDauSach = ThaoTac.XoaKhoangTrangThua(MaDauSach);
        if (MaDauSach.matches(DinhDang)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Mã đầu sách không đúng định dạng. Vui lòng nhập lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public Boolean KiemTraNhapMaDocGia(String MaDocGia) {
        String DinhDang = "DG" + "[0-9]{2}";
        MaDocGia = ThaoTac.VietHoa(MaDocGia);
        MaDocGia = ThaoTac.XoaKhoangTrangThua(MaDocGia);
        if (MaDocGia.matches(DinhDang)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Mã độc giả không đúng định dạng. Vui lòng nhập lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public Boolean KiemTraNhapMaNhanVien(String MaNhanVien) {
        String DinhDang = "NV" + "[0-9]{2}";
        MaNhanVien = ThaoTac.VietHoa(MaNhanVien);
        MaNhanVien = ThaoTac.XoaKhoangTrangThua(MaNhanVien);
        if (MaNhanVien.matches(DinhDang)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Mã nhân viên không đúng định dạng. Vui lòng nhập lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public void KiemTraKetNoiCoSoDuLieu() {
        MySQLConnection MySQLConnection = new MySQLConnection();
        MySQLConnection.Disconnect();
    }

}
