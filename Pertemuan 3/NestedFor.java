/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nestedfor;

/**
 *
 * @author ACER
 */
public class NestedFor {

    public static void main(String[] args) {
        int a, b;
        for (a = 1; a <= 5; a++){
            System.out.println();
            for (b = a; b <= 5; b++){
                System.out.print(a);
            }
        }
        System.out.println("\n");
    }
}
