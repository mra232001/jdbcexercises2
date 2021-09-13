import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prepare_statement extends Parent_off_all{
    public static void prepare() throws SQLException {
        makeConnection();
        PreparedStatement ps = con.prepareStatement("select * from employee where age > ? and ename = ?");
        ps.setInt(1, 30);
        ps.setString(2, "son");
        /// parameterIndex là chỉ số của dấu ?, chứ không phải chỉ số trong talbe
        ResultSet res = ps.executeQuery();
        //Print_all_table.printAllTable(ps, "employee");
        while(res.next()){
            System.out.println(res.getString(1) + " " + res.getString(2));
        }
    }
}
