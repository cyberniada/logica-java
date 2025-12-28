
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava34 {

    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);

        int i, suma = 0;

        // Lectura inicial del centinela
        System.out.println("Introduce un número (-1 para finalizar):");
        i = teclado.nextInt();

        while (i != -1) {
            // Se asume que aquí va la lógica de suma
            suma = suma + i; 

            // Actualización del centinela (lectura dentro del bucle)
            System.out.println("Introduce un número (-1 para finalizar):");
            i = teclado.nextInt();
        } // fin while

        // Salida de resultados
        System.out.println("La suma total es: " + suma);
    } // fin main

}