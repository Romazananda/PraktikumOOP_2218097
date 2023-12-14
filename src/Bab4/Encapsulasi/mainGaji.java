/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4.Encapsulasi;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class mainGaji {
    public static void main(String[] args) {
        pembayaranGaji gaji = new pembayaranGaji();
        gaji.setInput("G12345");
        System.out.println("Rekening yang anda masukan  :"+gaji.getInput());
        System.out.println("Jumlah saldo anda  :"+gaji.cekSaldo());
    }
}
