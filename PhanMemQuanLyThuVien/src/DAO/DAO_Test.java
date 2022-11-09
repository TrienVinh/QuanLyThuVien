package DAO;

import DTO.DTO_Test;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DAO_Test {

    private ResultSet ResultSet = null;
    private PreparedStatement PreparedStatement = null;

    public Boolean Them(DTO_Test Test) {
        String TruyVan = "Insert Into Test(Ngay, ThoiGian) Values(?,?)";
        try {
            PreparedStatement = new MySQLConnection().Connection.prepareStatement(TruyVan);
            PreparedStatement.setDate(1, Test.getNgay());
            PreparedStatement.setTimestamp(2, Test.getThoiGian());
            MySQLConnection MySQLConnection = new MySQLConnection();
            MySQLConnection.Disconnect();
            return PreparedStatement.executeUpdate() > 0;
        } catch (Exception Exception) {
            JOptionPane.showMessageDialog(null, "Test không thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

}
