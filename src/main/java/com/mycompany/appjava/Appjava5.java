// Forma más corta de hacer el ejercicio 4

package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int mes;
        System.out.println("Introduce un mes");
        mes = teclado.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 9, 11:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;

            case 4, 6, 8, 10, 12:
                System.out.println("30");
                break;

            default:
                System.out.println("Mes incorrecto");
        }

    }
}
// '&&' es 'and' y '||' es 'or' que se hace con 'alt gr + 1'
