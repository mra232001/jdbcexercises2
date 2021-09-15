import java.sql.*;

public class Stored_Procedures extends Parent_off_all{
    public static void main(String[] args) throws SQLException{
        makeConnection();
        CallableStatement st = con.prepareCall("call lamdeptrai(?, ?)");
        st.setString(1, "son");
        st.setInt(2, 29);
        Print_all_table.printAllTable(st, "employee");
    }
}
