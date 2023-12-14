/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Interface;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class PersegiPanjang extends BangunDatar implements Keliling,SimetriBangunanDatar{

    public double panjang,lebar;
    @Override
    double hitungluas() {
        return (panjang*lebar);
    }

    @Override
    public double tampilHasil() {
        System.out.println("Luas Persegi Panjang = "+ Double.toString(hitungluas()));
        System.out.println("Keliling Persegi Panjang = "+ Double.toString(hitungKelliling()));
        System.out.println("Banyak simetri putar = "+ hitungSimetriBangunDatar());
        return 0;
    }

    @Override
    public double hitungKelliling() {
        return (2*(panjang*lebar));
        
    }

    @Override
    public double hitungSimetriBangunDatar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
