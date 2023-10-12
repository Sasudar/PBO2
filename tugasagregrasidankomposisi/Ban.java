/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasagregrasidankomposisi;

/**
 *
 * @author user
 */
public class Ban {
    private int ukuran;
    private String merek;
    public Ban(int ukuran, String merek) {
    this.ukuran = ukuran;
    this.merek = merek;
}

public void infoBan() {
    System.out.println("Ukuran ban: " + ukuran + " inci");
    System.out.println("Merek ban: " + merek);
}

}
