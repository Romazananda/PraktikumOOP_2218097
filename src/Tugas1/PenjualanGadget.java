/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class PenjualanGadget {
    String warna, layar, processor, merk, internal,ram;

    void dataWarna(String Warna){
       this.warna = Warna; 
    }
    void dataMerk(String Merk){
        this.merk = Merk;
    }
    void dataInternal(String Internal){
        this.internal = Internal;
    }
     void dataRam(String Ram){
        this.ram = Ram;
    }
    void dataLayar(String Layar){
        this.layar = Layar;
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
    String cetakInternal(){
        return internal;
    }
    String cetakRam(){
        return ram;
    }
    String cetakLayar(){
        return layar;
    }
     String cetakProcessor(){
        return processor;
    }
}
