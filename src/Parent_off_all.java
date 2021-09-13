import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class Parent_off_all {
    /// Thís is the father class of all the query sql class
    static Connection con = null;
    static void makeConnection() throws SQLException{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
    }
}
