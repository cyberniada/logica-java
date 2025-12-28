
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava7 {

    public static void main(String[] args) {
 System.out.println("Introduce un número");
 
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        
     
        
         if (numero % 2 == 0) {
         System.out.println("Este número es par");
             
         }
         
         else {
          System.out.println("Este número es impar");
                 
            
         }
        

    }
}