/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan_2_pbo;
// Pertemuan 2
/**
 *
 * @author ACER
 */

// script enkapsulasi
class Belajar {
    public String x = "Pintar";
    private String y = "Java";
}    

public class Pintar {
    public static void main(String[] args) {
        Belajar panggil = new Belajar();
        System.out.println("Panggil x : " + panggil.x);
        System.out.println("Panggil y : " + panggil.y); // coede tidak dapat dijalankan karena 'y' adalah private
    }
}
