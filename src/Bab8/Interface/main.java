/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Interface;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota");
        mobil.berjalan();
        mobil.carabergerak();
        mobil.kecepatanMax();
        System.out.println("=====================");
        Pesawat pesawat = new Pesawat("Boeng 737");
        pesawat.carabergerak();
        pesawat.kecepatanMax();
        pesawat.berjalan();
        pesawat.terbang();
    }
}
