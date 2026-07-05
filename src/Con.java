
package cab;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Con {
    Connection connection;
    Statement statement;
    
    public Con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabBK", "root", "$uhan!@3110");
            statement = (Statement) connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        
        }
    
    }
}


