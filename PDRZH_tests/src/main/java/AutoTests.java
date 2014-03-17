/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author Viacheslav_Tkach
 */
public class AutoTests {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        AutoTests at= new AutoTests();
        
        String quer= "select d from car";
        
        ResultSet result = at.queryExec(quer);
        ArrayList<String> line = new ArrayList();
        while(result.next()) { // process results one row at a time
            System.out.println("");
            line.clear();
            
            for (int i=1;i<=result.getMetaData().getColumnCount();i++){
                
                line.add(result.getString(i));
                

            }
            for (int j=0; j<line.size();j++){
                System.out.print(line.get(j)+ "   ");
            }
        }
    } 
        
     public ResultSet queryExec(String quer) throws SQLException{
         
        DBSelector dbs=new DBSelector();
         
        String url = "jdbc:postgresql://evbyminsd7238.minsk.epam.com:5432/pdrzh_for_testers";
        Properties identify  = new Properties();
        
        identify.setProperty("user","postgres");
        identify.setProperty("password","123");
        
        Connection conn= dbs.connectToDB(url, identify);
        
                
        ResultSet result=dbs.query(quer, conn);
        conn.close();
        return result;
        
        
    }
}
