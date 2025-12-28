package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);


        
        // 1. Entrada de datos
        int NUM1; int NUM2; int RESUL;
        System.out.println("Introduce el primer operando");
        NUM1 = teclado.nextInt();
        System.out.println("Introduce el segundo operando");
        NUM2 = teclado.nextInt();
        //2. Proceso
        
        RESUL = NUM1 + NUM2;
        
        //3. mostrar resultados
        
       System.out.println("El resultado es: " + RESUL);
       
        
      
        
    }
    
}

