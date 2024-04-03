/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latarray1;

/**
 *
 * @author ACER
 */

import java.util.Scanner;
public class LatArray1 {

    public static void main(String[] args) {
        int i;
        int[] nil_akhir;
        nil_akhir = new int [6];
        Scanner input = new Scanner(System.in);
        for (i=0; i<6; i++){
            System.out.print("Masukan Array ke "+ i +" = ");
            nil_akhir[i] = input.nextInt();
        }
        System.out.println("\n\nData yang diinput ke Elemen Array \n");
        for (i=0; i<6; i++){
            System.out.print("Niai Akhir Index "+i);
            System.out.println(" = "+ nil_akhir[i]);
        }
    }
}
