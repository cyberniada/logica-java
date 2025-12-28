/*
Tarifa por edad

< 12 años → Gratis

12–17 → 5 €

18–64 → 10 €

65+ → 7 €
* 
 */
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad");
        int edad = teclado.nextInt();

        if (edad <= 12) {
            System.out.print("Gratis porque eres un bebucho");
        } else if (edad >= 12 && edad <= 17) {
            System.out.print("Son 5 euros porque aún eres algo bebucho");
        } else if (edad >= 18 && edad <= 64) {
            System.out.print("Son 10 euros, eres un bebuchón grande");
        } else {
            System.out.println("Son 7 euros porque eres un abuebucho");
        }
    }

}
        
