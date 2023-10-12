/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasagregrasidankomposisi;

/**
 *
 * @author user
 */
public class Pemilik {
    private String nama;
    private String alamat;
    public Pemilik(String nama, String alamat) {
    this.nama = nama;
    this.alamat = alamat;
}

public void infoPemilik() {
    System.out.println("Nama pemilik: " + nama);
    System.out.println("Alamat pemilik: " + alamat);
}

}
