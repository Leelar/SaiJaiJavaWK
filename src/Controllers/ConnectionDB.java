
package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    public static Connection getConnection(){
        try {
            String url ="jdbc:sqlserver://DESKTOP-DAAEP0D\\SQLEXPRESS;databaseName=Minimarksystem";
            String user="sa";
            String pwd="123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c =DriverManager.getConnection(url,user,pwd);
            return c;
        } catch (Exception e) {
        }
        return null;
    }
}
