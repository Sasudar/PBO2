/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitungluas;

import java.util.Scanner;

/**
 *
 * @author umdp
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Tugas Menghitung Luas Segitiga,Lingkaran,Persegi");
        System.out.println("================================================");
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih Luas yang akan dihitung:");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.print("Masukkan pilihan (1/2/3): ");

        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan panjang sisi persegi: ");
            double sisi = input.nextDouble();
            Persegi persegi = new Persegi(sisi);
            double luasPersegi = persegi.hitungLuas();
            System.out.println("Luas Persegi: " + luasPersegi);
        } else if (pilihan == 2) {
            System.out.print("Masukkan panjang jari-jari lingkaran: ");
            double jariJari = input.nextDouble();
            Lingkaran lingkaran = new Lingkaran(jariJari);
            double luasLingkaran = lingkaran.hitungLuas();
            System.out.println("Luas Lingkaran: " + luasLingkaran);
        } else if (pilihan == 3) {
            System.out.print("Masukkan panjang alas segitiga: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = input.nextDouble();
            Segitiga segitiga = new Segitiga(alas, tinggi);
            double luasSegitiga = segitiga.hitungLuas();
            System.out.println("Luas Segitiga: " + luasSegitiga);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close(); 
    }
}

