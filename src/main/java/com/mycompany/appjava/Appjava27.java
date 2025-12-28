//Calcula el factorial de un número (n!)
package com.mycompany.appjava;
   import java.util.Scanner;

public class Appjava27 {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el factorial de un número");
        int n = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

}
