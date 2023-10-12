/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts1.pbo1.darren.l;

import java.util.Scanner;

/**
 *
 * @author u-mdp
 */
public class Home {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("======BIOSKOP MDP===============");
        System.out.print("Masukkan Judul Film:");
        String Judul= scanner.next();
        System.out.print("Masukkan Jadwal:");
        String Jadwal= scanner.next();
        System.out.print("Masukkan Jumlah Tiket:");
        Integer Jumlah= scanner.nextInt();
        System.out.print("Masukkan Harga Tiket: Rp.");
        Integer Harga= scanner.nextInt();
        System.out.print("Masukkan % Diskon Tiket:");
        Integer Diskon= scanner.nextInt();
        System.out.println("=====Cetak Tiket=================");
        Film film= new Film(Judul,Jadwal);
        Tiket tiket = new Tiket (Jumlah,Harga,Diskon);
        System.out.println("Judul Film:"+film.getJudul());
        System.out.println("Jadwal:"+film.getJadwal());
        System.out.println("Jumlah:"+tiket.getJumlah());
        System.out.println("Harga:"+"Rp."+tiket.getHarga()+".0");
        System.out.println("Diskon:"+tiket.getDiskon());
        System.out.println("Total"+"Rp."+tiket.getTotal()+".0");
        
      
        
    }
    
}
