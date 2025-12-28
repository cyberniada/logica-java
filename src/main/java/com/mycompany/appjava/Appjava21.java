// Muestra los números impares del 1 al 20.
package com.mycompany.appjava;

public class Appjava21 {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}