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
 *Calcular el numero de pulsaciones que una persona debe tener por cada 
 *10 segundos de ejercicio si la formula es: numpulsaciones = (220-edad)/10
 */
public class pulsaciones {
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
 
    System.out.println("Ingrese su edad:");
    String stredad = buffer.readLine();
    Integer edad = Integer.parseInt(stredad);
    
    double pulsaciones = (220-edad)/10;
    System.out.println("El numero de pulsaciones que debes tener por cada 10 segundos es: " + pulsaciones);
}

}