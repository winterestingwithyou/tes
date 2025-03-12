/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemeninventaris;

import javax.swing.*;

/**
 *
 * @author Acer
 */
public class Role {
    private static final String[] daftarRole = {"Admin Gudang", "Pengelola Barang", "Supervisor", "Karyawan"};
    
    //Menyembunyikan Komponen berdasarkan Role
    public static void setNotVisible(String NoAccessRole, JComponent... JObject) {
        if(Role.checkInputLength(JObject)) {
            if(Role.checkInputRole(NoAccessRole)){
                for(JComponent obj : JObject) {
                    obj.setVisible(false);
                }
            } else {
                throw new IllegalArgumentException("Ada kesalahan pada Role yang diinput");
            }
        } else {
            throw new IllegalArgumentException("Silahkan masukkan minimal 1 Komponen");
        }
    }
    
    //Mendisable Button berdasarkan Role
    public static void setNoAccessButton(String NoAccessRole, JButton... button){
        if(Role.checkInputLength(button)) {
            if(Role.checkInputRole(NoAccessRole)){
                for(JButton btn : button) {
                    btn.setEnabled(false);
                }
            } else {
                throw new IllegalArgumentException("Ada kesalahan pada Role yang diinput");
            }
        } else {
            throw new IllegalArgumentException("Silahkan masukkan minimal 1 Button");
        }
    }
    
    //Cek Input NoAccessRole
    private static boolean checkInputRole(String role){
        for(String realRole : Role.daftarRole) {
            if(role.equals(realRole)){
                return true;
            }
        }
        return false;
    }
    
    //Cek jumlah Komponen yang diinput
    private static <T> boolean checkInputLength(T[] data) {
        return data.length >= 1;
    }
}
