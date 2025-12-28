//Pedirle al usuario que ponga su edad para saber si puede votar o no
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava8 {

    public static void main(String[] args) {
 System.out.println("Introduce tu edad");
 
 
 Scanner teclado = new Scanner(System.in);
 int edad= teclado.nextInt();
 
 if (edad >=18) {
     
      System.out.println("Puedes votar");
                         
         }
        
 else {
System.out.println("Espera unos añitos niño");
    }
 
    }
}