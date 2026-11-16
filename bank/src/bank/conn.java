package bank;
import java.sql.*;
public class conn {
 Connection con;
        public Statement s;
    public conn() {
       
        try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","123456");
         s=con.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    }

