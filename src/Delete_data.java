import java.sql.*;

public class Delete_data extends Parent_off_all{
    public static void  delete(){
        try{
            makeConnection();
            Statement st = con.createStatement();
            String sql = "delete from employee " +
                    "where age = 21";
            st.executeUpdate(sql);
            Print_all_table.printAllTable(st, "employee");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
