/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcase;
import java.util.*;
/**
 *
 * @author ACER
 */
public class LatScan4 {

    public static void main(String[] args) {
        int kd;
        String nb = "";
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan kode barang [1...3]: ");
        kd = input.nextInt();
        
        switch(kd){
            case 1:
                nb = "Alat Olah Raga";
                break;
            case 2:
                nb = "Alat Elektronik";
                break;
            case 3:
                nb = "Alat Alat Memasak";
                break;
            default:
                nb = "Anda Salah Kode !!!";
                break;
        }
        System.out.println("\nNama Barang: "+nb);
    }
}
