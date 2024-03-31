/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package KondisiIf;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class IfClassAksi {
    public static void main(String[] args){
        double tot_beli;
        Scanner input = new Scanner (System.in);
        IfClass fungsiif = new IfClass();
        System.out.print("Total Pembelian Rp. ");
        fungsiif.TotBeli = input.nextDouble();
        
        System.out.println("Besarnya Potongan Rp. "+ fungsiif.potongan);
        System.out.println("Jumlah Yang harus dibayarkan Rp. "+fungsiif.JumlahBayar());
    }
    
}
