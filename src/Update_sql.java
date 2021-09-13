import java.sql.*;
public class Update_sql extends Parent_off_all{
    public static void update() throws SQLException{
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
        makeConnection();
        Statement st = con.createStatement();
        String sql = "update employee " +
                "set ename = 'ha' " +
                "where age = 20";
        st.executeUpdate(sql);
        ResultSet res = st.executeQuery("select * from employee");
        while(res.next()){
            System.out.println(res.getString("ename") + " " + res.getString("age"));
        }
    }
}
