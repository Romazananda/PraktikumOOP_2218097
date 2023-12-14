/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2.Constuctor;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class Main_Kendaraan {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan();
        mobil.nama="Pajero Sport";
        System.out.println("Nama Kendaraan  : "+mobil.nama);
        System.out.println("Warna Kendaraan  : "+mobil.warna);
        System.out.println("Pabrikan Kendaraan  : "+mobil.pabrikan);
        System.out.println("Kecepatan Kendaraan  : "+mobil.speed+ " km/jam");
        System.out.println("Cara Kendaraan bergerak :");
        System.out.println("Saat Maju :");
        mobil.kendaraanMaju();
        System.out.println("Saat Mundur  :");
        mobil.kendaraanMuunfur();
        System.out.println("Saat Berhenti :");
        mobil.kendaraanBerhenti();
    }
}
