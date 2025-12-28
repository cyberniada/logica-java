/**
 * Si la compra es mayor a 100 €, aplica un 10% de descuento; si no,
 * muestra el total sin descuento.
 */
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava9 {

    public static void main(String[] args) {

        System.out.println("introduce el precio de tu compra");
        Scanner teclado = new Scanner(System.in);
        double compra = teclado.nextDouble();

        if (compra >= 100) {
            double descuento = compra * 0.10;
            System.out.println("Tienes un descuento");
            System.out.println("Tienes un " + descuento + " de descuento");

        } else {
            System.out.println("No tienes descuento");
        }

    }
}
