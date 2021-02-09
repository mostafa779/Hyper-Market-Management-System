/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seller;

/**
 *
 * @author 7ouda
 */
public class Order {
  private String p_name ;  
  private String p_category ;
  private int quantity ;
  private int bill ;
  private int id ;
  private int date ;

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_category() {
        return p_category;
    }

    public void setP_category(String p_category) {
        this.p_category = p_category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order(String p_name, String p_category, int quantity, int bill, int id , int date) {
        this.p_name = p_name;
        this.p_category = p_category;
        this.quantity = quantity;
        this.bill = bill;
        this.id = id;
        this.date = date ;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Order() {
    }

  
  
}
