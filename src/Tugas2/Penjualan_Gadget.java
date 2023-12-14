/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class Penjualan_Gadget {
    //Atribut
    String warna,processor, merk;
    int internal,ram,harga;
    
    //Menggunakan Constructor
    public Penjualan_Gadget(){
        this.internal = 256;
        this.ram = 8;
        this.harga = 250000;
    }
    
    //Method
    void dataWarna(String Warna){
    this.warna = Warna; 
    }
    void dataMerk(String Merk){
       this.merk = Merk; 
    }
    void dataProcessor(String Processor){
       this.processor = Processor; 
    }
    
     String cetakMerk(){
        return merk;
    }
    String cetakWarna(){
        return warna;
    }
    int cetakInternal(){
        return internal;
    }
    int cetakRam(){
        return ram;
    }
    int cetakHarga(){
        return harga;
    }
     String cetakProcessor(){
        return processor;
    }
}
