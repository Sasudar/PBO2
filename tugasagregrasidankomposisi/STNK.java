/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasagregrasidankomposisi;

/**
 *
 * @author user
 */
public class STNK {
    private Mobil mb;
    private Pemilik pk;
    private String nomor;
    private String masaBerlaku;
    public STNK(String nomor, String masaBerlaku, Mobil mb, Pemilik pk) {
    this.nomor = nomor;
    this.masaBerlaku = masaBerlaku;
    this.mb = mb;
    this.pk = pk;
}

public void infoSTNK() {
    System.out.println("Nomor STNK: " + nomor);
    System.out.println("Masa berlaku: " + masaBerlaku);
    mb.infoMobil(); // informasi mobil di STNK
    pk.infoPemilik(); // informasi pemilik di STNK
}

}
