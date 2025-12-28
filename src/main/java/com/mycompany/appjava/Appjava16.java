/*
Hacer programas sencillos que hagan lo siguiente:

Leer un número entero y determinar si es mayor de 10. 
Leer dos números enteros y muestre si el primero es mayor que el segundo. 
Leer un número entero y de determinar si se trata de un número par o impar. 
Leer dos números enteros y diga si los dos son mayores de 10 o no lo son. 
Leer dos números enteros y diga si al menos uno de los dos es mayor de 10. 
Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos). 
Leer dos números enteros y diga si uno y solo uno es mayor de 10. 
Leer dos números y decir si el primero es mayor que el segundo, si es menor o si los dos 
números son iguales. 
Leer dos números enteros y diga si el segundo es divisor del primero (prevenir divisiones 
por cero, que causan error) Repasar operadores en cortocircuito para hacer un solo if. 
Leer dos números enteros y diga si el menor de ellos es divisor del mayor (prevenir 
divisiones por cero, que causan error) Repasar operadores en cortocircuito para hacer 
un solo if. 
Leer un número y decir si es múltiplo de 2, de 3 y/o de 10.  Si no es múltiplo de 2 ya no 
hay que mirar si lo es de 10. 
Leer tres números enteros y diga si hay alguno mayor que cero. 
m) Leer tres números enteros y diga si hay alguno mayor que cero, pero no todos.
* 
 */
package com.mycompany.appjava;

import java.util.Scanner;

public class Appjava16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

       /* System.out.print("Introduce un número");
        int numero=teclado.nextInt();
        
            EJERCICIO 1:
        
        if (numero > 10){
            System.out.println("Este número es mayor de 10");
        }
        
        else {
            System.out.println("Este número es menor de 10");
        }
                
        EJERCICIO 2:
        System.out.print("Introduce un número");
        int num1=teclado.nextInt();
        
         System.out.print("Introduce otro número");
        int num2=teclado.nextInt();
        
        if (num1 > num2) {
                System.out.print(num1 + "es mayor que" + num2);
                
        }
        
        else if (num2 > num1){
        
         System.out.print(num2 + "es mayor que" + num1);
    }
        
        else {
                System.out.print("ambos son iguales");*
                }*/
       
       
       
       /** Leer un número entero y de determinar si se trata de un número par o impar. 
        ejercicio 3:
        
    System.out.println("introduce un número");
    int numero=teclado.nextInt();
    
    if (numero % 2 == 0){
        System.out.println("Este número es par");
    }
    else {
        System.out.println("Este número es impar");
    }
    */
       
       /** Leer dos números enteros y diga si los dos son mayores de 10 o no lo son. **/
       
        /* System.out.print("Introduce un número");
        int num1=teclado.nextInt();
        
         System.out.print("Introduce otro número");
        int num2=teclado.nextInt();
        
        if (num1 > 10 && num2 > 10) {
            System.out.println("Los dos números son mayores de 10");
            
          
    }
        
        else if (num1 > 10 && num2 < 10) {
            System.out.println(num1 + " es mayor pero " + num2 + " no");
        }
            
            else if (num1 < 10 && num2 > 10) {
                    System.out.println(num2 + "es mayor pero " + num1 + " no");
                    
                  
                    }
            else {
                System.out.println("Ningún número es mayor");
            
        }*/
        
        
        /*Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos).
        
        
        */
        
        /*System.out.println("Introduce un número");
        int num1=teclado.nextInt();
        
        System.out.println("Introduce otro número");
        int num2=teclado.nextInt();
        
        
        if  (num1 >=10 && num1 <=20 && num2 >=10 && num2 <=20){
                
           System.out.println("Los dos números están entre 10 y 20");
           
        }
            
            else if (num2 >=10 && num2 <=20){
            System.out.println("El segundo número está entre 10 y 20");
        }
            
            else if (num1 >= 10 && num1 <= 20){
            System.out.println("El primer número está entre 10 y 20");
        } 
            else {
                 System.out.println("Ninguno está entre 10 y 20");
            }*/
        
        /*Leer dos números enteros y diga si uno y solo uno es mayor de 10. 
        
        */
        
        /*System.out.println("Introduce un número");
        int num1=teclado.nextInt();
        
        System.out.println("Introduce otro número");
        int num2=teclado.nextInt();
        
        if ((num1 > 10) ^ (num2 > 10)) {
        
        System.out.println("Solo un número es mayor que 10");
    }
        else{
             System.out.println("Ninguno es mayor de 10");
        }
         */   
        
        /*Leer dos números y decir si el primero es mayor que el segundo, si es menor o si los dos 
números son iguales. 
    
        System.out.println("Introduce un número");
        int num1 = teclado.nextInt();

        System.out.println("Introduce otro número");
        int num2 = teclado.nextInt();
        
        if (num1 > num2) {
             System.out.println("El primer número es mayor");
        }
             
             else if (num2 > num1){
                     System.out.println("El segundo número es mayor");
                     }
             
             else {
                     System.out.println("Ambos números son iguales");
                  
                     }*/
        
        /*Leer dos números enteros y diga si el segundo es divisor del primero (prevenir divisiones 
por cero, que causan error) Repasar operadores en cortocircuito para hacer un solo if. 
        
        System.out.println("Introduce un número");
        int num1 = teclado.nextInt();

        System.out.println("Introduce otro número");
        int num2 = teclado.nextInt();
        
        
        if (num2 != 0 && num1 % num2 ==0){
             System.out.println("El segundo es divisor del primero");
            
        }
        else if (num2 ==0){
             System.out.println("No se puede dividir porque es cero");
            
            
        }
        
        else {
             System.out.println("El segundo no es divisor del primero");
            
        }*/
        
        /*Leer dos números enteros y diga si el menor de ellos es divisor del mayor (prevenir 
divisiones por cero, que causan error) Repasar operadores en cortocircuito para hacer 
un solo if. 
System.out.println("Introduce un número");
int num1 = teclado.nextInt();

System.out.println("Introduce otro número");
int num2 = teclado.nextInt();

if (num1 != 0 && num2 != 0) {  // Prevenir división por cero
    if (num1 > num2) {
        if (num1 % num2 == 0) {
            System.out.println("El menor es divisor del mayor");
        } else {
            System.out.println("El menor NO es divisor del mayor");
        }
    } else if (num2 > num1) {
        if (num2 % num1 == 0) {
            System.out.println("El menor es divisor del mayor");
        } else {
            System.out.println("El menor NO es divisor del mayor");
        }
    } else {  // num1 == num2
        System.out.println("Ambos números son iguales");
    }
} else {  // Alguno es cero
    System.out.println("No se puede dividir entre cero");

} */
        
        /* número y decir si es múltiplo de 2, de 3 y/o de 10.  Si no es múltiplo de 2 ya no 
hay que mirar si lo es de 10. */
         System.out.println("Introduce un número");
        int num1 = teclado.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Es multiplo de dos");

        }
        if (num1 % 10 == 0) {
            System.out.println("Es multiplo de 10 tambien");

        
    }

    
        else {
    System.out.println("No es múltiplo de 2, no se revisa múltiplo de 10");
    }
    if (num1

    
        % 3 ==0){
    System.out.println("Es multiplo de 3");
    }

    
        else {
       System.out.println("No es múltiplo de 3");
    }

}
}
