/**
 * Pide al usuario un número entero entre 1 y 10.
 * */
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava35 {
      public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

  
        
        
       System.out.println("Escribe un número del 1 al 10");
       int numero = teclado.nextInt();
       
       for (int i = 1; i <=10; i++ ) {
           
           int resultado = numero * i;
           
           System.out.println(numero + " x " + i + " = " + resultado);
           
           
           
                    
        
           
       }
       
        

    }
}
