/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design_pattern;

/**
 *
 * @author user
 */
public class Connection {
    private String host;
    private String username;
    private String password;
   
    
    public Connection() {
    }
   
    public Connection(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }
    
    
      public String sql(String a){
        return a;
    }


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
