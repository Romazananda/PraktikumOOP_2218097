/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class Gadget_Tablet extends Penjualan_Gadget{
    //Atribut
    String layar;

    //Constructor
    public Gadget_Tablet() {
        this.internal = 128;
        this.ram = 6;
        this.harga = 250000;
    }
    
    //Setter dan Getter
    public String getLayar() {
        return layar;
    }
    public void setLayar(String layar) {
        this.layar = layar;
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
     String cetakLayar(){
        return layar;
     }

    @Override
    int dataRam() {
        return super.dataRam(); 
    }

    @Override
    public int getHarga() {
        return super.getHarga(); 
    }

    @Override
    public int getInternal() {
        return super.getInternal();
    }
     
}
