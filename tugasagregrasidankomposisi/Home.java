/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasagregrasidankomposisi;

/**
 *
 * @author user
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mobil mb=new Mobil("mazda", "merah", 1994);
       mb.infoMobil();
       Pemilik pl= new Pemilik("Budi", "Jakarta");
       STNK s1 = new STNK("B 123 ABC", "21 Desember 2026", mb, pl);
        
    }
    
}
