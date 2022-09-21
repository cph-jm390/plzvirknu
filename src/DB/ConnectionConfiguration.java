package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionConfiguration {

    public static Connection getConnection(){
        Connection connection = null;
        String url = "jdbc:mysql://localhost/Bibliotek?" + "autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "NY9hcW7DAZ!+-qg1:]G6";
        try{
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}