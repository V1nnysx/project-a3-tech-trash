package DAO;

import connector.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.UserRegister;

public class UserRegisterDAO {

    Connection conn;
    PreparedStatement ps;

    public void registerUser(UserRegister objectRegister) throws SQLException {

        conn = new ConnectionFactory().requestConnection();

        try {
            String sql = "INSERT INTO register (username, userpass, email) VALUES (?,?,?)";
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, objectRegister.getUserLogin());
            ps.setString(2, objectRegister.getPasswordLogin());
            ps.setString(3, objectRegister.getEmailUser());
            
            ps.execute();
            ps.close();

        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "Register" + error);
        }

    }

}
