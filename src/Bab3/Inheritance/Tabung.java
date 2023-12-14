/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3.Inheritance;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class Tabung extends lingkaran{
    int t;
    double volume, luaspermukaan;

    public Tabung() {
        t=20;
    }
    void keterangan(){
        Deskripsi();
        System.out.println("menghitung volume tabung");
    }
    double Hitvolumetabung(){
        volume = ((phi*r*r)*t);
        return volume;
    }
    
}
