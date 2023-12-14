/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class Penjualan_Gadget {
    //Atribut
    String warna,processor, merk,gadget;
    int internal;
    int ram;
    int harga;
    int dataHarga;
    
    //Menggunakan Constructor (private)
    public Penjualan_Gadget(){
        this.internal = 256;
        this.ram = 8;
        this.harga = 250000;
    }
    //Setter dan Getter
    public int getInternal() {
        return internal;
    }

    public int getRam() {
        return ram;
    }
    public int getHarga() {    
        return harga;
    }

    //overloading
    public void setInternal(int internal) {
        this.internal = internal;
    }

    public void setRam(int ram) {
        ram = ram;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    //Method
    void dataGadget(String Gadget){
    this.gadget = Gadget; 
    }
    void dataWarna(String Warna){
    this.warna = Warna; 
    }
    void dataMerk(String Merk){
       this.merk = Merk; 
    }
    void dataProcessor(String Processor){
       this.processor = Processor; 
    }
     int dataRam(){
       return ram; 
    }
      int dataInternal(){
       return internal; 
    }
      int dataHarga(){
       return harga; 
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
       String cetakGadget(){
        return gadget;
    }

}
