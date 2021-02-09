/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seller;

import java.sql.*;
import java.util.Date;
import java.util.logging.*;

/**
 *
 * @author 7ouda
 */
public class Orderimpl  {

    public int insert(Order order) {
        int result = 0 ;
        PreparedStatement ps = null ;
        Connection conn = null ;
        Date date = new Date();
        java.sql.Date sqldate = new java.sql.Date(date.getTime());
        try {
            conn = dbConnection.getconnection();
            String sql = "  INSERT INTO orders (Product_name,Product_category,Quantity,Bill,Date) VALUES (?,?,?,?,?)" ;
           ps = conn.prepareStatement(sql);
           ps.setString(1, order.getP_name());
           ps.setString(2, order.getP_category());
           ps.setInt(3, order.getQuantity());
           ps.setInt(4, order.getBill());
           ps.setDate(5,sqldate);
           result = ps.executeUpdate();
        } catch (Exception ex) {
            try {
                ps.close();
                dbConnection.closeConnection(conn);
            } catch (SQLException ex1) {
                Logger.getLogger(Orderimpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(Orderimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      return result ;
    }

    public int cancel(String id) {
        Order order = new Order () ;
        int result = 0 ;
        PreparedStatement ps = null ;
        Connection conn = null ;
        try {
            conn = dbConnection.getconnection();
            String sql = "DELETE FROM orders WHERE Order_ID=?" ;
            ps = conn.prepareStatement(sql);
            ps.setString(1,id);
            result = ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            Logger.getLogger(Orderimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result ;
    }
    
    public int Update (Order order) {
        int result = 0 ;
        PreparedStatement ps = null ;
        Connection conn = null ;
        try {
            conn = dbConnection.getconnection();
            String sql = "UPDATE orders SET Product_name=?,Product_category=?,Quantity=?,Bill=? where Order_ID=?" ;
           ps = conn.prepareStatement(sql);
           ps.setInt(5,order.getId());
           ps.setString(1, order.getP_name());
           ps.setString(2, order.getP_category());
           ps.setInt(3, order.getQuantity());
           ps.setInt(4, order.getBill());
           result = ps.executeUpdate();
        } catch (Exception ex) {
            try {
                ps.close();
                dbConnection.closeConnection(conn);
            } catch (SQLException ex1) {
                Logger.getLogger(Orderimpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(Orderimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      return result ;
    }

    public Order search(String id) throws Exception {
        Connection conn = dbConnection.getconnection();
        String sql ="SELECT * FROM orders WHERE Order_ID=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        Order order = new Order();
        id = String.valueOf(order.getId());
        pst.setString(1,id);
        return order;
    }
  }
