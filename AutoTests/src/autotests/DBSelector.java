/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autotests;

import java.sql.*;
import java.util.Properties;

/**
 *
 * @author Viacheslav_Tkach
 */
public class DBSelector {
    
    
             
        
    
    public Connection connectToDB(String url, Properties identify ) throws SQLException{
        //properties for connection
        /*url = "jdbc:postgresql://evbyminsd7238.minsk.epam.com:5432/pdrzh_for_testers";
        
        identify  = new Properties();
        
        identify.setProperty("user","postgres");
        identify.setProperty("password","123");
        //props.setProperty("ssl","true");
        */
        //connect to DB
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
