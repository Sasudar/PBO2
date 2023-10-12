/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts1.pbo1.darren.l;

/**
 *
 * @author u-mdp
 */
public class Tiket {
    private Integer jumlah;
    private Integer harga;
    private Integer diskon;
    
    public Tiket(Integer a,Integer b,Integer c){
        jumlah=a;
        harga=b;
        diskon=c;
    }
   public void setJumlah(Integer jumlah){
       this.jumlah=jumlah;
   }
   public Integer getJumlah(){
       return jumlah;
   }
   public void setHarga(Integer harga){
        this.harga=harga;
   }
   
   public Integer getHarga(){
       return harga;
   }
   public void setDiskon(Integer diskon){
       this.diskon=diskon;
   }
   public Integer getDiskon(){
       return diskon;
   }
   public Integer getTotal(){
       Integer totaldiskon= (harga*jumlah)*diskon*1/100;
       Integer total =(harga*jumlah)-totaldiskon;
       
       
       
       return total;
   }
   
    
}
