package DB;
import java.io.IOException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;


/**
 *
 * @author magne
 */
public class DB {
    
    public Connection conn;
    public PreparedStatement pstmt;
    public ResultSet rs;

    String strDriver = "oracle.jdbc.driver.OracleDriver";
            String strURL = "jdbc:oracle:thin:@localhost:1521";
            String strUser = "javamovie";
            String strPWD = "javamovie";
    public void DBopen() throws IOException{
        try{
            Class.forName(strDriver);
            conn = DriverManager.getConnection(strURL, strUser, strPWD);
        }catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    public void DBclose() throws IOException{
        try{
            pstmt.close();
            rs.close();
            conn.close();
        }catch (Exception e){
            System.out.println("SQLException2 : "+e.getMessage());
        }
    }

}
