import java.sql.*;
import java.util.function.Consumer;

public class Connect_to_Mysql {
    public static void main(String ...args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery("select * from employee");
        Consumer consumer = x -> System.out.println(x);
        while(res.next()){
            consumer.accept(res.getString("ename") + " " + res.getString("age"));
        }
    }
}
