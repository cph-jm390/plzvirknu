package DB;

import MineUtil.BrugerInput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionConfiguration {
    private static String pass= null;


    public static Connection getConnection(){
        if(pass == null) {

            pass = BrugerInput.getString("angiv pw");
        }
        Connection connection = null;
        String url = "jdbc:mysql://localhost/Bibliotek?" + "autoReconnect=true&useSSL=false";
        String user = "root";
        String password = pass;
        try{
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}