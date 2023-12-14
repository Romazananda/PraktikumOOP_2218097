/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9Exception;

/**
 *
 * @author Romaz Ananda Zilasar
 */
public class login {
    private String username, password;
    public String nama;

    public login() {
        nama = "Anugerah Prianka Mustika Aji";
        username = "Kaka";
        password = "123";
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    boolean Ceklogin(String username, String password){
        if(username.equals(getUsername())&& password.equals(getPassword())){
            return true;
        }
        return false;
          
    }
}
