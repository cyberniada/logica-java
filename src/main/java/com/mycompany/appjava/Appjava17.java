// 1. EJERCICIOS DE FOR: Haz una tabla de multiplicar
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava17 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un número entero entre 1 y 10");
        int valor = teclado.nextInt();
        
        
        for (int i=1; i<=10; i++){
            System.out.println(valor + "x" + i + "=" + (valor * i));
        }
        

    }
}
