import org.jetbrains.annotations.NotNull;

import java.sql.*;

class Print_all_table {
    static void printAllTable(@NotNull Statement a, String tablename) throws SQLException {
        String sql = "select * from " + tablename;
        ResultSet res = a.executeQuery(sql);
        ResultSetMetaData cur = res.getMetaData();
        int n = cur.getColumnCount();
        while(res.next()){
            for(int i = 1; i <= n; i++){
                System.out.printf("%s ", res.getString(i));
            }
            System.out.printf("\n");
        }
    }
}
