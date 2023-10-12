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
public class Rumah {
    private float luasbangunan;
    //composition:rumah hancur,kamar tidur dan lainnya hancur
    private KamarTidur kt;
    private RuangTamu rt;
    //agregasi:rumah hancur pagarnya tetap ada
    private Pagar pg;
    //asosiasi berupa sertifikat yaitu masih berhubungan dengan rumah
    private SertifikatRumah sr;

    public float getLuasbangunan() {
        return luasbangunan;
    }

    public void setLuasbangunan(float luasbangunan) {
        this.luasbangunan = luasbangunan;
    }
    
    

    public Rumah() {
       kt= new KamarTidur();
       rt= new RuangTamu(1, 4);
       sr=new SertifikatRumah("123", "Ali");
       
    }
    public void setPagar(Pagar pg){
        this.pg=pg;
    }
    public void addPagar(){
      this.pg.keteranganPagar();
    }
    
   public void infoRumah(){
       System.out.println("Luas bangunan: "+luasbangunan);
       kt.fungsiKamarTidur();
       rt.fungsiRuangTamu();
       pg.keteranganPagar();
       sr.tampilinfosertif();
   }
   
}

