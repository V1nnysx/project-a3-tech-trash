package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String user = "root";
    private static String password = "soufoda02@";
    private static String host = "localhost";
    private static String porta = "3306";
    private static String bd = "test_login";

    public Connection requestConnection() throws SQLException {
        Connection conn = null;
        
        String url = String.format(
                "jdbc:mysql://%s:%s/%s",
                host,
                porta,
                bd
        );
        return DriverManager.getConnection(url, user, password);
    }
}
/*public Connection obtemConexao() throws Exception{
        try {
            Class.forName(driver);
            c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd,
                    usuario,
                    senha
            );
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}*/
