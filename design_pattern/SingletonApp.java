/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package design_pattern;

/**
 *
 * @author user
 */
public class SingletonApp {

   
    public static void main(String[] args) {
       OrderService orderService=new OrderService();
       orderService.save("0001");
       
       OrderDetailService orderDetailService= new OrderDetailService();
       orderDetailService.save("001","IndoMie");
       orderDetailService.save("001","Sabun");
       orderDetailService.save("001","Pepsoden");
       
    }
    
}
