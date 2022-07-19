/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MATEO PINEDA
 */

/*
Para tu clase de matemáticas necesitas un programa para calcular el factorial de un número.
Tienes un programa que toma un número como entrada. Tarea Complete el programa para calcular el 
factorial del número dado y enviarlo. Ejemplo de entrada 6 Ejemplo de salida 720 Explicación El factorial 
de un número es igual al producto de todos los números menores o iguales que el número dado. El factorial de 
6 será 6*5*4*3*2*1 = 720. Sugerencia Use el bucle while para calcular el factorial del número.
*/

public class problema7 {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
    
    System.out.println("Bienvenido(a) Ingrese el numero del que deseas conocer el factorial:");
    String strnum = buffer.readLine();
    Integer num = Integer.parseInt(strnum);
    
    int factorial = 1;
    while(num > 1){
        factorial*= num --;
    }

    System.out.println("El factorial del numero ingresado es: " + factorial);
            
    }
}
          