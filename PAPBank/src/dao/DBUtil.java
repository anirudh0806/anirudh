/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Anirudh
 */
public class DBUtil {
    
   public static void main(String[] args) {
      Connection con = null;
      
      try {
         //Registering the HSQLDB JDBC driver
         Class.forName("org.hsqldb.jdbc.JDBCDriver");
         //Creating the connection with HSQLDB
         con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/papdb", "SA", "");
         
         Statement stmt = con.createStatement();
         ResultSet result = stmt.executeQuery(
            "select user_id, password, role  from login_tbl");
         
         while(result.next()){
            System.out.println(result.getString("user_id")+" | "+
               result.getString("password")+" | "+
               result.getString("role"));
         }
         
      
      }  catch (Exception e) {
         e.printStackTrace(System.out);
      }
   }
}