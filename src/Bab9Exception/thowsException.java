/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9Exception;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class thowsException {
    static void Eror() throws ClassNotFoundException{
        System.out.println("Ada yang eror nih!");
        throw new ClassNotFoundException("Eror sudah saya Tangkap");
    }
    public static void main(String[] args) {
        try{
            thowsException.Eror();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
