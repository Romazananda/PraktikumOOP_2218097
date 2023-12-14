/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Interface;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class Kredit {
    void cekKartuKredit(String norek,String input){
        if(norek.equals(input)){
            System.out.println("Pembayaran Kredit Succes");
        }else{
         System.out.println("Pembayaran Gagal, kata sandi salah");
        }
    }
}
