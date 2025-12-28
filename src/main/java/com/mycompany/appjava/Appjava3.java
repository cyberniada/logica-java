package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
            int resul = 0, resul2=0;
        System.out.println("Introduce un número");
        int n = teclado.nextInt();
        if (n <= 100 && n > 0) {
            resul = n * n;
            System.out.println("resultado (cuadrado): " + resul);
            
            if (n <20 || n % 2 == 0) { // 'n % 2== 0' significa números pares
                resul2 = n * n * n;
                System.out.println("resultado (cubo): " + resul2);
            }
        } else {
           System.out.println("número muy grande");
        }

        
    }

}

// '&&' es 'and' y '||' es 'or' que se hace con 'alt gr + 1'
