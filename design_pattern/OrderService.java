/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design_pattern;


/**
 *
 * @author user
 */
public class OrderService {
    public void save(String orderId){
       Connection connection =new Connection("localhost","root","root");
        DatabaseHelper.getConnection().sql("INSERT INTO ORDER.....");
       
        
    }
}
