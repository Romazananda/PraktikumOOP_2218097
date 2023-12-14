package Tugas8;

import Tugas7.*;

public class Penjualan_Gadget extends ClassAbstrack implements dapatKembalian, dapatDiscan {

    //Atribut
    String warna, processor, merk, gadget;
    int internal;
    int ram;
    int harga;
    int dataHarga;
    double total,bayar;
    String crbayar;

    //Menggunakan Constructor (private)
    public Penjualan_Gadget() {
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

    //casting
    @Override
    public int harga(int harga) {
        this.harga = harga;
        return this.harga;
    }

//    public void setHarga(int harga) {
//        this.harga = harga;
//    }
    //Method
    void dataGadget(String Gadget) {
        this.gadget = Gadget;
    }

    void dataWarna(String Warna) {
        this.warna = Warna;
    }

    void dataMerk(String Merk) {
        this.merk = Merk;
    }

    void dataProcessor(String Processor) {
        this.processor = Processor;
    }

    int dataRam() {
        return ram;
    }

    int dataInternal() {
        return internal;
    }

    int dataHarga() {
        return harga;
    }

    double cetakBayar(){
        return bayar;
    }
    String cetakMerk() {
        return merk;
    }

    String cetakWarna() {
        return warna;
    }

    int cetakInternal() {
        return internal;
    }

    int cetakRam() {
        return ram;
    }

    int cetakHarga() {
        return harga;
    }

    String cetakProcessor() {
        return processor;
    }

    String cetakGadget() {
        return gadget;
    }

    //Abstrack
    @Override
    public String Status() {
        return "Gadget Tidak Tersedia";
    }

    public String Status(String gadget) {
        return "Gadget Tersedia";
    }

    @Override
    public void scanQris(String bayar) {
        crbayar = bayar;
    }

    @Override
    public double kembalian(double saldo, double bayar) {
        total = saldo - bayar;
        return total;
    }

    @Override
    public void bayar(double bayar) {
        this.bayar=bayar;
    }

}
