/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts1.pbo1.darren.l;

/**
 *
 * @author u-mdp
 */
public class Film {
    private String judul;
    private String jadwal;
    
    public Film(String a,String b){
        judul=a;
        jadwal=b;
    }
    public void setJudul(String judul){
        this.judul=judul;
    }  
    public String getJudul(){
        return judul;
    }
    public void setJadwal(String jadwal){
        this.jadwal=jadwal;
    }
    public String getJadwal(){
        return jadwal;
    }
}
