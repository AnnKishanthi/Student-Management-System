
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kirishanthy
 */
public class database {
    
    public static void main (String [] args)
    {
    ConnectDb();
    }
    
    public static Connection ConnectDb()
    {
    Connection connection = null;
      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/studentregistration", "root", "");
            return connection;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      return connection;
       
    }

}
