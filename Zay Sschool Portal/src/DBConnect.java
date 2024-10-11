
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

static Connection con;
    
    public static Connection DBConnection(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "justicechidi";
            String url = "jdbc:mysql://localhost:3306/zay_school_portal?autoReconnect=true&useSSL=false";
            con = DriverManager.getConnection(url, user, password);


            
        } catch (Exception e) {
            e.printStackTrace();
        }
return con;
    
    
}
}
