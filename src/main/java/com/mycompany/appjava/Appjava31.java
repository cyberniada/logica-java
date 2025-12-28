/** Pide un número y muestra su tabla del 1 al 10.
 * . */
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava31 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número");
        int num = scanner.nextInt();
   
        for (int i=1; i<=10; i++){
         int resultado = num * i;
         
         
         System.out.println(num + "x" + i + "=" + resultado);
            
        }

       

}
}