/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

/**
 *
 * @author umdp
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Rumah rm=new Rumah();
      rm.setLuasbangunan(123.5f);
      Pagar pg=new Pagar();
      rm.setPagar(pg);
      rm.infoRumah();
      
        
    }
    
}
