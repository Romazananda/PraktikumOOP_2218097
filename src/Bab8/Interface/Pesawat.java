/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Interface;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class Pesawat extends kendaraan implements Berjalan, Terbang{

    public Pesawat(String merek) {
        super(merek);
    }

    
    @Override
    void carabergerak() {
        System.out.println("Pesawat bergerak dalam udara dengan menggunakan mesin-mesin yang memungkinkan untuk terbang");
    }

    @Override
    void kecepatanMax() {
        System.out.println("900km/h");
    }

    @Override
    public void berjalan() {
        System.out.println("Pesawat "+ getMerek()+ " berjalan maju melalui roda yang bersentujan langsung dengan permukaan tanah");
    }

    @Override
    public void terbang() {
        System.out.println("Pesawat "+ getMerek()+ " mesin yang berkecepatan tinggi, baling2 dan sayapaerodinamic memungkinkan peswat untuk lepas landas, terbang");
    }
    
}
