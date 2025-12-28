package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int mes;
        System.out.println("Introduce un mes");
        mes = teclado.nextInt();

        switch (mes) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                      break;
            case 3:
                System.out.println("31");
                      break;
            case 4:
                System.out.println("30");
                      break;
            case 5:
                System.out.println("31");
                      break;
            case 6:
                System.out.println("30");
                      break;
            case 7:
                System.out.println("31");
                      break;
            case 8:
                System.out.println("30");
                      break;
            case 9:
                System.out.println("31");
                      break;
            case 10:
                System.out.println("30");
                      break;
            case 11:
                System.out.println("31");
                      break;
            case 12:
                System.out.println("30");
                      break;
                      
            default: System.out.println("Mes incorrecto");
        }

    }
}
// '&&' es 'and' y '||' es 'or' que se hace con 'alt gr + 1'
