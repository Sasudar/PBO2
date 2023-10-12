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
public class SertifikatRumah {
   private String nomorsertifikat;
   private String namapemilik;

    public String getNomorsertifikat() {
        return nomorsertifikat;
    }

    public void setNomorsertifikat(String nomorsertifikat) {
        this.nomorsertifikat = nomorsertifikat;
    }

    public String getNamapemilik() {
        return namapemilik;
    }

    public void setNamapemilik(String namapemilik) {
        this.namapemilik = namapemilik;
    }

    public SertifikatRumah() {
    }
    public SertifikatRumah(String nomorsertifikat, String namapemilik) {
        this.nomorsertifikat = nomorsertifikat;
        this.namapemilik = namapemilik;
    }
    public void tampilinfosertif(){
        System.out.println("Nomor sertifikat rumah:"+nomorsertifikat);
        System.out.println("Nama pemilik sertifikat:"+namapemilik);
    }
   
   
}
