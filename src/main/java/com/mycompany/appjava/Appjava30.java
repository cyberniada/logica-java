/** Pide 10 números y muestra cuántos son positivos, negativos y cero.
 * . */
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int negativo = 0;
        int positivo = 0;
        int cero = 0;
        
        for (int i=1; i<=10; i++){

        System.out.println("Introduce un número" + i + ":");
        int num = scanner.nextInt();
        
        if (num > 0 ) {
            positivo++;
        } else if ( num < 0 ) { 
            negativo++;
        } else {
            cero++;
        }
            
        }

        System.out.println("Positivo: " + positivo);
        System.out.println("Negativo: " + negativo);
        System.out.println("Ceros: " + cero);

}
}