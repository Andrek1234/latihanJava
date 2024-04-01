/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package LatihanIfElse;

/**
 *
 * @author ACER
 */

import java.util.Scanner;
public class LatIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String keterangan, nama;
        int nilai;
        
        System.out.print("Masukan Nama Siswa: ");
        nama = input.nextLine();
        System.out.print("Masukan Nilai Akhir: ");
        nilai = input.nextInt();
        if (nilai > 70){
            keterangan = "Lulus";
        }else{
            keterangan = "Gagal";
        }
        System.out.println("Nilai Akhir");
        System.out.println("=====================================");
        System.out.println("Nama Siswa                : "+nama);
        System.out.println("Nilai akhir Yang di dapat : "+nilai);
        System.out.println("Keterangan                : "+keterangan);
        System.out.println("=====================================");
    }
}
