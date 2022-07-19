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

/**
 * Escribir un programa al cual ingrese la velocidad de un movil expresada en 
 * metros por segundo e imprima en pantalla la velocidad en kilometros por hora
 */

public class conversion_ms_a_kmh {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarDatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarDatos);
    
    System.out.println("Ingrese la velocidad en metros por segundo:");
    String strvel = buffer.readLine();
    Double velocidad = Double.valueOf(strvel);
    
    double conversion = (velocidad/1000)*3600;
    System.out.println("La velocidad en kilometros por hora es: " + conversion);
    
}
}