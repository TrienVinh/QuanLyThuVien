package GUI;

public class GUI_DangNhap extends javax.swing.JFrame {

    public GUI_DangNhap() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabel_Logo = new javax.swing.JLabel();
        JLabel_DangNhap = new javax.swing.JLabel();
        JLabel_MaNhanVien = new javax.swing.JLabel();
        JTextField_MaNhanVien = new javax.swing.JTextField();
        JLabel_MatKhau = new javax.swing.JLabel();
        JButton_DangNhap = new javax.swing.JButton();
        JButton_Thoat = new javax.swing.JButton();
        JPasswordField_MatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHẦN MỀM QUẢN LÝ THƯ VIỆN");
        setResizable(false);

        JLabel_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/ICONS/IMG_ICON_KeSach.png"))); // NOI18N
        JLabel_Logo.setAlignmentX(0.5F);

        JLabel_DangNhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLabel_DangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_DangNhap.setText("ĐĂNG NHẬP");
        JLabel_DangNhap.setAlignmentX(0.5F);
        JLabel_DangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JLabel_DangNhap.setMaximumSize(new java.awt.Dimension(200, 30));
        JLabel_DangNhap.setMinimumSize(new java.awt.Dimension(200, 30));
        JLabel_DangNhap.setPreferredSize(new java.awt.Dimension(200, 30));

        JLabel_MaNhanVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLabel_MaNhanVien.setText("Mã nhân viên");
        JLabel_MaNhanVien.setAlignmentX(0.5F);
        JLabel_MaNhanVien.setMaximumSize(new java.awt.Dimension(150, 30));
        JLabel_MaNhanVien.setMinimumSize(new java.awt.Dimension(150, 30));
        JLabel_MaNhanVien.setPreferredSize(new java.awt.Dimension(150, 30));
        JLabel_MaNhanVien.setRequestFocusEnabled(false);

        JTextField_MaNhanVien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTextField_MaNhanVien.setMaximumSize(new java.awt.Dimension(150, 25));
        JTextField_MaNhanVien.setMinimumSize(new java.awt.Dimension(150, 25));
        JTextField_MaNhanVien.setPreferredSize(new java.awt.Dimension(150, 25));

        JLabel_MatKhau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLabel_MatKhau.setText("Mật khẩu");
        JLabel_MatKhau.setAlignmentX(0.5F);
        JLabel_MatKhau.setMaximumSize(new java.awt.Dimension(150, 30));
        JLabel_MatKhau.setMinimumSize(new java.awt.Dimension(150, 30));
        JLabel_MatKhau.setPreferredSize(new java.awt.Dimension(150, 30));

        JButton_DangNhap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JButton_DangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/ICONS/IMG_ICON_DangNhap.png"))); // NOI18N
        JButton_DangNhap.setText("Đăng nhập");
        JButton_DangNhap.setAlignmentX(0.5F);
        JButton_DangNhap.setMaximumSize(new java.awt.Dimension(150, 30));
        JButton_DangNhap.setMinimumSize(new java.awt.Dimension(150, 30));
        JButton_DangNhap.setPreferredSize(new java.awt.Dimension(150, 30));

        JButton_Thoat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JButton_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/ICONS/IMG_ICON_Thoat.png"))); // NOI18N
        JButton_Thoat.setText("Thoát");
        JButton_Thoat.setAlignmentX(0.5F);
        JButton_Thoat.setMaximumSize(new java.awt.Dimension(150, 30));
        JButton_Thoat.setMinimumSize(new java.awt.Dimension(150, 30));
        JButton_Thoat.setPreferredSize(new java.awt.Dimension(150, 30));

        JPasswordField_MatKhau.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JPasswordField_MatKhau.setMaximumSize(new java.awt.Dimension(150, 25));
        JPasswordField_MatKhau.setMinimumSize(new java.awt.Dimension(150, 25));
        JPasswordField_MatKhau.setPreferredSize(new java.awt.Dimension(150, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(JLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabel_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(JTextField_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButton_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(JButton_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLabel_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(JPasswordField_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(JLabel_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextField_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPasswordField_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButton_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_DangNhap;
    private javax.swing.JButton JButton_Thoat;
    private javax.swing.JLabel JLabel_DangNhap;
    private javax.swing.JLabel JLabel_Logo;
    private javax.swing.JLabel JLabel_MaNhanVien;
    private javax.swing.JLabel JLabel_MatKhau;
    private javax.swing.JPasswordField JPasswordField_MatKhau;
    private javax.swing.JTextField JTextField_MaNhanVien;
    // End of variables declaration//GEN-END:variables
}
