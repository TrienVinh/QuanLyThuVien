package UTIL;

import DAO.MySQLConnection;
import javax.swing.JOptionPane;

public class UTIL_KiemTra {

    UTIL_ThaoTac ThaoTac = new UTIL_ThaoTac();

    public Boolean KiemTraNhapMaDauSach(String MaDauSach) {
        String DinhDang = "DS" + "[0-9]{2}";
        MaDauSach = ThaoTac.XoaKhoangTrangThua(MaDauSach);
        if (MaDauSach.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã đầu sách không được để trống. Vui lòng nhập lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            MaDauSach = ThaoTac.VietHoaChuoi(MaDauSach);
            if (MaDauSach.matches(DinhDang)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Mã đầu sách không đúng định dạng. Vui lòng nhập lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
    }

    public Boolean KiemTraNhapMaDocGia(String MaDocGia) {
        String DinhDang = "DG" + "[0-9]{2}";
        MaDocGia = ThaoTac.XoaKhoangTrangThua(MaDocGia);
        if (MaDocGia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã độc giả không được để trống. Vui lòng nhập lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            MaDocGia = ThaoTac.VietHoaChuoi(MaDocGia);
            if (MaDocGia.matches(DinhDang)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Mã độc giả không đúng định dạng. Vui lòng nhập lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
    }

    public Boolean KiemTraNhapMaNgonNgu(String MaNgonNgu) {
        String DinhDang = "NN" + "[0-9]{2}";
        MaNgonNgu = ThaoTac.XoaKhoangTrangThua(MaNgonNgu);
        if (MaNgonNgu.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã ngôn ngữ không được để trống. Vui lòng nhập lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            MaNgonNgu = ThaoTac.VietHoaChuoi(MaNgonNgu);
            if (MaNgonNgu.matches(DinhDang)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Mã ngôn ngữ không đúng định dạng. Vui lòng nhập lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
    }

    public Boolean KiemTraNhapMaNhanVien(String MaNhanVien) {
        String DinhDang = "NV" + "[0-9]{2}";
        MaNhanVien = ThaoTac.XoaKhoangTrangThua(MaNhanVien);
        if (MaNhanVien.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã nhân viên không được để trống. Vui lòng nhập lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            MaNhanVien = ThaoTac.VietHoaChuoi(MaNhanVien);
            if (MaNhanVien.matches(DinhDang)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Mã nhân viên không đúng định dạng. Vui lòng nhập lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
    }

    public void KiemTraKetNoiCoSoDuLieu() {
        MySQLConnection MySQLConnection = new MySQLConnection();
        MySQLConnection.Disconnect();
    }

}
