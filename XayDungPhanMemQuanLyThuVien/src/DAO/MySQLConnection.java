package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MySQLConnection {

    Connection Connection = null;
    ResultSet ResultSet = null;
    Statement Statement = null;
    final String Database = "QuanLyThuVien";
    final String Password = "";
    final String User = "root";
    final String URL = "JDBC:MySQL://localhost:3306/" + Database + "?useUnicode=yes&characterEncoding=UTF-8";

    public MySQLConnection() {
        if (Connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection = DriverManager.getConnection(URL, User, Password);
            } catch (ClassNotFoundException ClassNotFoundException) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy thư viện JDBC !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException SQLException) {
                JOptionPane.showMessageDialog(null, "Lỗi kết nối cơ sở dữ liệu !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public Connection Connect() {
        return this.Connection;
    }

    public void Disconnect() {
        try {
            if (ResultSet != null) {
                ResultSet.close();
            }
            if (Connection != null) {
                Connection.close();
            }
            if (Statement != null) {
                Statement.close();
            }
        } catch (SQLException SQLException) {
            JOptionPane.showMessageDialog(null, "Lỗi ngắt kết nối cơ sở dữ liệu !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
