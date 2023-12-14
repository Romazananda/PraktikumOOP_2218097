/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9Exception;
import java.util.Scanner;
/**
 *
 * @author Romaz Ananda Zilasar
 */
public class throwException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlKaki;
        System.out.println("Berapa Jumlah kaki kerbau ? ");
        try{
            System.out.println("Jumalah kaki : ");
            jmlKaki = input.nextInt();
            if(jmlKaki !=4){
                throw new NullPointerException("Terjadi Kesalahan nih!");
            }else{
                System.out.println("Benar Jumalah kaki kerbau 4");
            }
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
