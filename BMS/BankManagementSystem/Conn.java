
import java.sql.*;
public class Conn {
    Connection c;
    public Statement s;

    //create connection//
    public Conn() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
c = DriverManager.getConnection("jdbc:mysql:/// bankmanagementsystem", "root", "Mysql@1193");
s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
 