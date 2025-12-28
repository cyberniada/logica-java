/** Pedir una palabra y mostrarla letra por letra
 * . */
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava33 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String palabra = scanner.nextLine();
   
        
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
         
        }
    }
    

            
       