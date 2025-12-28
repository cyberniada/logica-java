/**
 * Clasificación de notas. Forma alternativa más corta de hacerlo.
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

public class Appjava11 {

    public static void main(String[] args) {

        System.out.println("introduce tu nota");
        Scanner teclado = new Scanner(System.in);
        int nota = teclado.nextInt();

   switch (nota) {
    
       
       case 0: System.out.println("Estás suspenso");
       break;
        case 1: System.out.println("Estás suspenso");
       break;
        case 2: System.out.println("Estás suspenso");
       break;
        case 3: System.out.println("Estás suspenso");
       break;
        case 4: System.out.println("Estás suspenso");
       break;
        case 5: System.out.println("Estás aprobado");
       break;
        case 6: System.out.println("Estás aprobado");
       break;
        case 7: System.out.println("Has sacado un notable");
       break;
         case 8: System.out.println("Has sacado un notable");
       break;
         case 9: System.out.println("Has sacado un sobresaliente");
       break;
       case 10: System.out.println("Has sacado un sobresaliente");
       break;


   default: // un switch no puede llevar un "else" así que ponemos default
           System.out.println("Número no válido");
           
           /**
            * también podemos escribir el código como:
            * case 0: case 1: case 2: case 3: case 4:
            * System.out.println("Estás supenso");
            * break;
            * 
            * así acortamos :D
     
            */
           
    }
    
           
    }
}
