/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latbuffered;
import java.io.*;
/**
 *
 * @author ACER
 */
public class LatBuffered {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader (keyreader);
        String kata1, kata2;
        
        System.out.print("Masukan Kata Pertama : ");
        kata1 = input.readLine();
        System.out.print("Masukan Kata Kedua : ");
        kata2 = input.readLine();
        System.out.print("\nHasil Input String " + kata1 + " " + kata2);
        
    }
}
