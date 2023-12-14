/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3.Inheritance;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class lingkaran {
     //Atribut
    int r;
    double phi,luas;
    
    //construktor

    public lingkaran() {
        r = 7;
        phi = 3.14;
    }
    
    //method
    void Deskripsi(){
        System.out.println("Ini adalah hasil menghitung");
    }
    
    //Method untuk menghitung luas
    double HitluasLingkaran(){
        //L=ohi r2
        luas=(phi*r*r);
        return luas;
    }
    
    
    
}
