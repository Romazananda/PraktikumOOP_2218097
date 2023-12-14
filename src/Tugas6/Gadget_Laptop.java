/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class Gadget_Laptop extends Gadget_Tablet{
    //Atribut
    int storage;
    int baterai;
    
    //Constructor
    public Gadget_Laptop() {
        this.storage = 512;
        this.ram = 16;
        this.baterai = 76;
        this.harga = 29999000;
    }
    
    //Setter dan Getter

    public int getStorage() {
        return storage;
    }

    public int getBaterai() {
        return baterai;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setBaterai(int baterai) {
        this.baterai = baterai;
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
    void dataLayar(String Layar){
    this.layar = Layar; 
    }
    
    String cetakMerk(){
        return merk;
    }
    String cetakWarna(){
        return warna;
    }
    int cetakStorage(){
        return storage;
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
     String cetakLayar(){
        return layar;
     }
     int cetakBaterai(){
        return baterai;
     }
}
