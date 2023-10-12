/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasagregrasidankomposisi;

/**
 *
 * @author user
 */
public class Mobil {
    private String merk;
    private String warna;
    private int tahun;
    private Mesin ms;
    private Ban[] bn;
    public Mobil(String merk, String warna, int tahun) {
    this.merk = merk;
    this.warna = warna;
    this.tahun = tahun;
    ms = new Mesin(1500, 4); //mesin dengan cc dan silinder 
    bn = new Ban[4]; // empat ban
    for (int i = 0; i < bn.length; i++) {
        bn[i] = new Ban(15, "Bridgestone"); // ukuran dan merek setiap ban
    }
}

public void infoMobil() {
    System.out.println("Merk mobil: " + merk);
    System.out.println("Warna mobil: " + warna);
    System.out.println("Tahun pembuatan: " + tahun);
    ms.infoMesin(); // informasi mesin
    for (int i = 0; i < bn.length; i++) {
        System.out.println("Ban ke-" + (i+1) + ":");
        bn[i].infoBan(); // informasi setiap ban
    }
}

}
