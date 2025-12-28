/**
 * Comparar tres números
 *
 * Determina cuál es el mayor de tres números.
 */
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número");
        int num1 = teclado.nextInt();

        System.out.print("Introduce el segundo número");
        int num2 = teclado.nextInt();

        System.out.print("Introduce el tercer número");
        int num3 = teclado.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.print("Este número mayor es " + num1);
        }

        else  if (num2 >= num1 && num2 >= num3) {
            System.out.print("Este número mayor es " + num2);
        }
            else {
                  System.out.print("Este número mayor es " + num3);
                }
      
    }
}
