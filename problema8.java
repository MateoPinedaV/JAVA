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
Te dan un código que toma como entrada el número de estudiantes que ingresan a la universidad. ¡Saludémoslos!
Tarea Complete el programa para mostrar "Bienvenido" para cada estudiante. Entrada de muestra
2 Salida de muestra Bienvenidos Bienvenidos

*/
public class problema8 {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
 
    System.out.println("Ingresa el numero de alumnos:");
    String stralumnos = buffer.readLine();
    Integer alumnos = Integer.parseInt(stralumnos); //Convertir string (texto) a int (Entero)
    
    for(int i = 0; i< alumnos; i++){
    System.out.println("Bienvenido");
        
    
    }
    
}

}