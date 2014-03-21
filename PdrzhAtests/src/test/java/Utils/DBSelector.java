package utils;

import java.sql.*;
import java.util.Properties;

public class DBSelector {
    
    public ResultSet queryExec(String quer) throws SQLException {
         
        DBSelector db=new DBSelector();
         
        String url = "jdbc:postgresql://evbyminsd7238.minsk.epam.com:5432/pdrzh_for_testers";
        Properties identify  = new Properties();
        
        identify.setProperty("user","postgres");
        identify.setProperty("password","123");
        
        Connection conn= db.connectToDB(url, identify);

                
        ResultSet result=db.query(quer, conn);
        conn.close();
        return result;
        
        
    }
                     
    
    public Connection connectToDB(String url, Properties identify ) throws SQLException{
        //properties for connection
        /*url = "jdbc:postgresql://evbyminsd7238.minsk.epam.com:5432/pdrzh_for_testers";
        
        identify  = new Properties();
        
        identify.setProperty("user","postgres");
        identify.setProperty("password","123");*/
        //props.setProperty("ssl","true");

        //connect to DB
        //DatabaseMetaData DriverManager;
        Connection conn = DriverManager.getConnection(url, identify);
        return conn;
        
    }
    
    public ResultSet query ( String quer, Connection conn) throws SQLException{
        //run SQL guery
        Statement select = conn.createStatement();
        ResultSet result = select.executeQuery(quer);
        
        //select.close();
        return result;
    }
    
    
    
}
