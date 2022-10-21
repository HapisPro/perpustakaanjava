/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author MyDesktop
 */
public class config {
    private static Connection MySQLConfig;
  
    
    public static Connection congfigDB()throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/dbperpustakaan";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
            System.out.println("berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal");
        }
        return MySQLConfig;
    }
    
}
