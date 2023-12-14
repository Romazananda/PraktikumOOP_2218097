/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class CetakGadget {
    public static void main(String[] args) 
    {
        PenjualanGadget Handphone1;
        Handphone1 = new PenjualanGadget();
        Handphone1.dataMerk("Samsung");
        Handphone1.dataWarna("Hitam");
        Handphone1.dataLayar("5,5 inch");
        Handphone1.dataProcessor("Exynos");
        Handphone1.dataInternal("128 GB");
        Handphone1.dataRam("8 GB");
        System.out.println("Cetak Spesifikasi Gadget");
        System.out.println("-----------------------------------");
        System.out.println("Merk       : "+Handphone1.cetakMerk());
        System.out.println("Warna      : "+Handphone1.cetakWarna());
        System.out.println("Layar      : "+Handphone1.cetakLayar());
        System.out.println("Processor  : "+Handphone1.cetakProcessor());
        System.out.println("Internal   : "+Handphone1.cetakInternal());
        System.out.println("Ram        : "+Handphone1.cetakRam());
    }
    
    
}
