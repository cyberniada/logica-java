/**
 * Pide un número y cuenta cuántas cifras tiene.
 * Ej: 482 → 3 cifras. */
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava29 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = scanner.nextInt();
        
        int original = num;
        int cifras = 0;
        
        
        if (num==0){
            cifras = 1;
        } else {
            
        
        for (; num !=0; num /= 1){
            cifras++;
         
                    }
        }
         System.out.println("El número " + original + " tiene " + cifras + " cifras.");
    }

}

