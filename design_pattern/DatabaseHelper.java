/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design_pattern;

/**
 *
 * @author user
 */
public class DatabaseHelper {
    
    private static Connection connection;
    
    public static Connection getConnection(){
    if(connection==null){
    connection=new Connection("localhost","root","root");
    }
    return connection;
}
}
