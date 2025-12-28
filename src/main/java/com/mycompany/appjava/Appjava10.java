/**
 * Clasificación de notas
 *
 * Introduce una nota (0–10):
 *
 * 0–4 → Suspenso
 *
 * 5–6 → Aprobado
 *
 * 7–8 → Notable
 *
 * 9–10 → Sobresaliente
 */
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava10 {

    public static void main(String[] args) {

        System.out.println("introduce tu nota");
        Scanner teclado = new Scanner(System.in);
        int nota = teclado.nextInt();

        if (nota >= 0 && nota <=4) {
            System.out.println("Estás suspenso");

        }

        else if (nota == 5 || nota == 6) {
            System.out.println("Estás aprobado");

        }

        else if  (nota == 7 || nota == 8){
            System.out.println("Tienes un notable");

        }

        else if (nota == 9 || nota == 10) {
            System.out.println("Tienes un sobresaliente");
        } 
        else {
            System.out.println("Número no válido");
        }

    }
}
