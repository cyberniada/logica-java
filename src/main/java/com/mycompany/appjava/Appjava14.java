/**
 * Día de la semana

Introduce un número del 1 al 7 y muestra el día correspondiente.
 */

package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7");
        int dia = teclado.nextInt();
       
        
        
       /** switch (numero) {
        * 
            
            case 1:
                System.out.println("Hoy es lunes");
                break;   
                
                 case 2:
                System.out.println("Hoy es martes");
                break; 
                
                 case 3:
                System.out.println("Hoy es miércoles");
                break; 
                
                 case 4:
                System.out.println("Hoy es jueves");
                break; 
                
                 case 5:
                System.out.println("Hoy es viernes");
                break; 
                
                 case 6:
                System.out.println("Hoy es sábado");
                break; 
                
                 case 7:
                System.out.println("Hoy es domingo");
                break; 
                
                
        }
        
      
    }
}
         */

   
        String DiaSemana = switch (dia){
            case 1 ->
                "lunes";
            case 2 ->
                "martes";

            case 3 ->
                "miércoles";

            case 4 ->
                "jueves";

            case 5 ->
                "viernes";

            case 6 ->
                "sábado";

            case 7 ->
                "domingo";
            default -> "día inválido"; 
        };
        
 System.out.println("Hoy es " + DiaSemana);
 
 /**
  * esta opción es más limpia y se hace en las nuevas actualizaciones de java
  * Se declara la variable como switch directamente
  */
 
    }

}

    

       

