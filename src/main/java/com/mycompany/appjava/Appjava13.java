/**
 * Año bisiesto

Pide un año y dice si es bisiesto (divisible entre 4,
* y si es divisible entre 
* 100 también debe ser divisible entre 400).
 */

package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un año");
        int fecha = teclado.nextInt();
        
        if (fecha % 4 !=0){
          System.out.print("El año no es bisiesto");
        }
        
        else if (fecha % 100 != 0) {
                System.out.print("El año es bisiesto");
        }
        
        else if (fecha % 400 == 0) {
            System.out.print("El año es bisiesto");
        }
        
      
    }
}

// != → significa “no es igual a”