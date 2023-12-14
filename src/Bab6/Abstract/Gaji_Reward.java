/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6.Abstract;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class Gaji_Reward extends Gaji_abs_reward{
    double menit;
    double waktu;
    double tunj_bonus, gajipokok, tunj_anak, anak;

    @Override
    double tunjanganAnak() {
        if(anak ==1){
            return (0.1*gajipokok);
        }else if (anak>1){
            return (0.2*gajipokok);
        }else{
            return tunj_anak;
        }
    }

    @Override
    double lembur() {
        waktu = (menit/60);
        return (waktu*25000);
    }
    
}
