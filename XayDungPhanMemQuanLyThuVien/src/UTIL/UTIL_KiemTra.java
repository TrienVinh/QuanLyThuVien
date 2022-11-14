package UTIL;

import javax.swing.JOptionPane;

public class UTIL_KiemTra {

    UTIL_ThaoTac UTIL_ThaoTac = new UTIL_ThaoTac();

    public boolean KiemTraMaNhanVienHopLe(String MaNhanVien) {
        MaNhanVien = UTIL_ThaoTac.XoaKhoangTrangThua(MaNhanVien);
        if (MaNhanVien.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mã nhân viên không được để trống. Vui lòng kiểm tra lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            MaNhanVien = UTIL_ThaoTac.VietHoa(MaNhanVien);
            String DinhDang = "NV" + "[0-9]{2}";
            Boolean MaNhanVienHopLe = MaNhanVien.matches(DinhDang);
            if (MaNhanVienHopLe) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Mã nhân viên không đúng định dạng. Vui lòng kiểm tra lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }

    }

    public boolean KiemTraMatKhauHopLe(String MatKhau) {
        MatKhau = UTIL_ThaoTac.XoaKhoangTrangThua(MatKhau);
        if (MatKhau.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mật khẩu không được để trống. Vui lòng kiểm tra lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            String DinhDang = "^[A-Za-z0-9]+$";
            Boolean MatKhauHopLe = MatKhau.matches(DinhDang);
            if (MatKhauHopLe) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Mật khẩu không đúng định dạng. Vui lòng kiểm tra lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }

    }

}
