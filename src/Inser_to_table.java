import java.sql.*;

public class Inser_to_table extends Parent_off_all{
    public static void insert() {
        try{
            makeConnection();
            Statement state = con.createStatement();
            state.executeUpdate("insert into employee(ename, age) values('hoang', 20)");
            ResultSet res = state.executeQuery("select * from employee");
            while(res.next()){
                System.out.println(res.getString("ename") + " " + res.getString("age"));
            }
        }catch (Exception e){
            e.printStackTrace();
            /// dau ma
        }
    }
}
