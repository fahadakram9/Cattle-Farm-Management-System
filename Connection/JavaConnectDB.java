package conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JavaConnectDB {
     static Connection connection; // conncetion variables
    static Statement statement;
    
    
      public static Connection getConn() { // getter to get connection 
        return connection;
    }

    public static void setConn(Connection conn) { // setting up connection with java database 
        JavaConnectDB.connection = conn;
    }
   
    public static Connection ConnectDB(){
        //establishing connection with database
        
        try{
            Class.forName("oracle.jdbc.OracleDriver"); // establishing connection
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rimsha", "rimsha", "rimsha");
               return connection;     
            
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e); // handling exception if there is no user available 
        }
        
        return null;
    }
    
    
     public static Statement getStatement() // get statement 
    {
        return statement;
    }
    
    public static void disconnectDB() //disconnect the connection with database
    {
        try {
            connection.close();
            
        } 
        catch (SQLException ex) { // handling exception if connection is not establish before
            
            Logger.getLogger(JavaConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}
