package DAO;

import connector.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.UserLogin;

public class UserLoginDAO {

    Connection conn;

    public ResultSet autenticationUser(UserLogin objectUser) throws SQLException {

        conn = new ConnectionFactory().requestConnection();

        try {
            String sql = "SELECT * FROM register WHERE username = ? and userpass = ? ";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, objectUser.getUserLogin());
            ps.setString(2, objectUser.getPasswordLogin());

            ResultSet rs = ps.executeQuery();
            return rs;

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "UserLoginDAO: " + error);
            return null;
        }
    }

}
