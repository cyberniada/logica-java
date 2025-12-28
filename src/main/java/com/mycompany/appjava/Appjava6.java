
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        //Pide al usuario un número entero y muestra si es positivo, negativo o cero.
        
        System.out.println("Introduce un número: ");
        
        if (numero > 0){
       
                System.out.println("Este número es positivo");
        }
        if (numero < 0) {
                    
                    System.out.println("Este número es negativo");

                }
                
         if (numero == 0){
                    
                      
                    System.out.println("Este número es cero");
                }

    }
}
// '&&' es 'and' y '||' es 'or' que se hace con 'alt gr + 1'
