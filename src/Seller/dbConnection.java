/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seller;
import java.sql.*;
/**
 *
 * @author 7ouda
 */
public class dbConnection {
   public static Connection getconnection () throws Exception{
   Class.forName("com.mysql.jdbc.Driver") ;
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "root", "root");
   return conn ;
   }
   public static void closeConnection (Connection conn) throws SQLException{
   conn.close();
   }
}
