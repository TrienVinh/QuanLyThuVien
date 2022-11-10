package GUI;

import BUS.BUS_NhatKyHoatDong;
import BUS.BUS_TaiKhoan;
import DTO.DTO_NhatKyHoatDong;
import DTO.DTO_TaiKhoan;
import UTIL.*;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

public class GUI_DangNhap extends javax.swing.JFrame {

    BUS_NhatKyHoatDong BUS_NhatKyHoatDong = new BUS_NhatKyHoatDong();
    BUS_TaiKhoan BUS_TaiKhoan = new BUS_TaiKhoan();
    UTIL_KiemTra UTIL_KiemTra = new UTIL_KiemTra();
    UTIL_ThaoTac UTIL_ThaoTac = new UTIL_ThaoTac();

    public GUI_DangNhap() {
        initComponents();
    }

    public void BatDauChuongTrinh() {
        this.setVisible(true);
    }

    public void ChuyenDenTrangNhanVien() {
        GUI_TrangNhanVien GiaoDienTrangNhanVien = new GUI_TrangNhanVien();
        GiaoDienTrangNhanVien.setVisible(true);
        this.setVisible(false);
    }

    public void ChuyenDenTrangQuanTriVien() {
        GUI_TrangQuanTriVien GiaoDienTrangQuanTriVien = new GUI_TrangQuanTriVien();
        GiaoDienTrangQuanTriVien.setVisible(true);
        this.setVisible(false);
    }

    public void KhoiChayPhanMem() {
        Boolean KiemTraKetNoiCoSoDuLieu = UTIL_KiemTra.KiemTraKetNoiCoSoDuLieu();
        if (KiemTraKetNoiCoSoDuLieu) {
            BatDauChuongTrinh();
        } else {
            KetThucChuongTrinh();
        }
    }

    public void KetThucChuongTrinh() {
        System.exit(0);
    }

    public void KiemTraDangNhap() {
        String MaNhanVien = JTextField_MaNhanVien.getText();
        String MatKhau = JPasswordField_MatKhau.getText();
        Boolean KiemTraNhapThongTinDangNhap = UTIL_KiemTra.KiemTraNhapThongTinDangNhap(MaNhanVien, MatKhau);
        if (KiemTraNhapThongTinDangNhap) {
            MaNhanVien = UTIL_ThaoTac.VietHoaChuoi(MaNhanVien);
            DTO_TaiKhoan TaiKhoanDangNhap = BUS_TaiKhoan.LayTaiKhoangTheoMaNhanVien(MaNhanVien);
            String MaNhanVienDangNhap = TaiKhoanDangNhap.getMaNhanVien();
            String MatKhauDangNhap = TaiKhoanDangNhap.getMatKhau();
            if (MaNhanVien.equals(MaNhanVienDangNhap)) {
                MatKhau = UTIL_ThaoTac.MaHoaMatKhau(MatKhau);
                if (MatKhau.equals(MatKhauDangNhap)) {
                    String TinhTrang = TaiKhoanDangNhap.getTinhTrang();
                    if (TinhTrang.equals("Khả dụng")) {
                        String HoatDong = "Nhân viên '" + MaNhanVien + "' đăng nhập vào hệ thống";
                        Timestamp ThoiGian = UTIL_ThaoTac.LayThoiGianHienTai();
                        DTO_NhatKyHoatDong NhatKyHoatDong = new DTO_NhatKyHoatDong();
                        NhatKyHoatDong.setMaNhanVien(MaNhanVien);
                        NhatKyHoatDong.setHoatDong(HoatDong);
                        NhatKyHoatDong.setThoiGian(ThoiGian);
                        BUS_NhatKyHoatDong.Them(NhatKyHoatDong);
                        String PhanQuyen = TaiKhoanDangNhap.getPhanQuyen();
                        JOptionPane.showMessageDialog(null, "Đăng nhập thành công. Chào mừng nhân viên '" + MaNhanVien + "' trở lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        switch (PhanQuyen) {
                            case "Nhân viên": {
                                ChuyenDenTrangNhanVien();
                                break;
                            }
                            case "Quản trị viên": {
                                ChuyenDenTrangQuanTriVien();
                                break;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tài khoản hiện tại đang bị khóa. Vui lòng liên hệ quản trị viên để mở khóa !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Mật khẩu không chính xác. Vui lòng kiểm tra lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy tài khoản của nhân viên '" + MaNhanVien + "' . Vui lòng kiểm tra lại !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void Thoat() {
        String[] LuaChon = {"Có", "Không"};
        int KetQua = JOptionPane.showOptionDialog(null, "Bạn có chắc muốn thoát không ?", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, LuaChon, LuaChon[0]);
        if (KetQua == JOptionPane.YES_OPTION) {
            KetThucChuongTrinh();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_DangNhap = new javax.swing.JPanel();
        JLabel_DangNhap = new javax.swing.JLabel();
        JPanel_ThongTinDangNhap = new javax.swing.JPanel();
        JLabel_MaNhanVien = new javax.swing.JLabel();
        JTextField_MaNhanVien = new javax.swing.JTextField();
        JLabel_MatKhau = new javax.swing.JLabel();
        JButton_DangNhap = new javax.swing.JButton();
        JButton_Thoat = new javax.swing.JButton();
        JPasswordField_MatKhau = new javax.swing.JPasswordField();
        JLabel_Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHẦN MỀM QUẢN LÝ THƯ VIỆN");

        JPanel_DangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JLabel_DangNhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLabel_DangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_DangNhap.setText("ĐĂNG NHẬP");
        JLabel_DangNhap.setPreferredSize(new java.awt.Dimension(200, 30));

        JLabel_MaNhanVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLabel_MaNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ICON/IMG_ICON_NguoiDung.png"))); // NOI18N
        JLabel_MaNhanVien.setText("Mã nhân viên");
        JLabel_MaNhanVien.setPreferredSize(new java.awt.Dimension(150, 30));
        JLabel_MaNhanVien.setRequestFocusEnabled(false);
        JLabel_MaNhanVien.setVerifyInputWhenFocusTarget(false);

        JTextField_MaNhanVien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTextField_MaNhanVien.setPreferredSize(new java.awt.Dimension(150, 30));

        JLabel_MatKhau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLabel_MatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ICON/IMG_ICON_MatKhau.png"))); // NOI18N
        JLabel_MatKhau.setText("Mật khẩu");
        JLabel_MatKhau.setPreferredSize(new java.awt.Dimension(150, 30));
        JLabel_MatKhau.setRequestFocusEnabled(false);
        JLabel_MatKhau.setVerifyInputWhenFocusTarget(false);

        JButton_DangNhap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JButton_DangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ICON/IMG_ICON_DangXuat.png"))); // NOI18N
        JButton_DangNhap.setText("Đăng nhập");
        JButton_DangNhap.setPreferredSize(new java.awt.Dimension(150, 30));
        JButton_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_DangNhapActionPerformed(evt);
            }
        });

        JButton_Thoat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JButton_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ICON/IMG_ICON_Thoat.png"))); // NOI18N
        JButton_Thoat.setText("Thoát");
        JButton_Thoat.setPreferredSize(new java.awt.Dimension(150, 30));
        JButton_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_ThoatActionPerformed(evt);
            }
        });

        JPasswordField_MatKhau.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JPasswordField_MatKhau.setPreferredSize(new java.awt.Dimension(150, 30));

        javax.swing.GroupLayout JPanel_ThongTinDangNhapLayout = new javax.swing.GroupLayout(JPanel_ThongTinDangNhap);
        JPanel_ThongTinDangNhap.setLayout(JPanel_ThongTinDangNhapLayout);
        JPanel_ThongTinDangNhapLayout.setHorizontalGroup(
            JPanel_ThongTinDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ThongTinDangNhapLayout.createSequentialGroup()
                .addGroup(JPanel_ThongTinDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_ThongTinDangNhapLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(JPanel_ThongTinDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanel_ThongTinDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPasswordField_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanel_ThongTinDangNhapLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(JButton_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(JButton_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150))
        );
        JPanel_ThongTinDangNhapLayout.setVerticalGroup(
            JPanel_ThongTinDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ThongTinDangNhapLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(JPanel_ThongTinDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(JPanel_ThongTinDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPasswordField_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(JPanel_ThongTinDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButton_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        JLabel_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ICON/IMG_ICON_KeSach.png"))); // NOI18N

        javax.swing.GroupLayout JPanel_DangNhapLayout = new javax.swing.GroupLayout(JPanel_DangNhap);
        JPanel_DangNhap.setLayout(JPanel_DangNhapLayout);
        JPanel_DangNhapLayout.setHorizontalGroup(
            JPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_DangNhapLayout.createSequentialGroup()
                .addGroup(JPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_DangNhapLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(JPanel_ThongTinDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_DangNhapLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(JLabel_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_DangNhapLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(JLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        JPanel_DangNhapLayout.setVerticalGroup(
            JPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_DangNhapLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(JLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(JLabel_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(JPanel_ThongTinDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_DangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_DangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_DangNhapActionPerformed
        KiemTraDangNhap();
    }//GEN-LAST:event_JButton_DangNhapActionPerformed

    private void JButton_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_ThoatActionPerformed
        Thoat();
    }//GEN-LAST:event_JButton_ThoatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_DangNhap;
    private javax.swing.JButton JButton_Thoat;
    private javax.swing.JLabel JLabel_DangNhap;
    private javax.swing.JLabel JLabel_Logo;
    private javax.swing.JLabel JLabel_MaNhanVien;
    private javax.swing.JLabel JLabel_MatKhau;
    private javax.swing.JPanel JPanel_DangNhap;
    private javax.swing.JPanel JPanel_ThongTinDangNhap;
    private javax.swing.JPasswordField JPasswordField_MatKhau;
    private javax.swing.JTextField JTextField_MaNhanVien;
    // End of variables declaration//GEN-END:variables
}
