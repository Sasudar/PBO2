/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasagregrasidankomposisi;

/**
 *
 * @author user
 */
public class Mesin {
    private int cc;
    private int silinder;
    public Mesin(int cc, int silinder) {
    this.cc = cc;
    this.silinder = silinder;
}

public void infoMesin() {
    System.out.println("Kapasitas mesin: " + cc + " cc");
    System.out.println("Jumlah silinder: " + silinder);
}

}
