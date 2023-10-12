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
public class RuangTamu {
     private int jumlahmeja;
     private int jumlahkursi;

    public int getJumlahmeja() {
        return jumlahmeja;
    }

    public void setJumlahmeja(int jumlahmeja) {
        this.jumlahmeja = jumlahmeja;
    }

    public int getJumlahkursi() {
        return jumlahkursi;
    }

    public void setJumlahkursi(int jumlahkursi) {
        this.jumlahkursi = jumlahkursi;
    }

    public RuangTamu(int jumlahmeja, int jumlahkursi) {
        this.jumlahmeja = jumlahmeja;
        this.jumlahkursi = jumlahkursi;
    }
    
    public RuangTamu(){
    }
    //tambahkan method
    public void fungsiRuangTamu(){
        System.out.println("Ruang tamu digunakan menerima tamu");
        System.out.println("Terdapat"+" "+jumlahmeja+" "+"meja");
        System.out.println("Terdapat"+" "+jumlahkursi+" "+"kursi");
        
    }
    
}
