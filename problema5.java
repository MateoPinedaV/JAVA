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
Eres un tour manager y necesitas un programa que identifique países pequeños. 
Un país se considera pequeño si su población es inferior a 10000 y su superficie 
es inferior a 10000 hectáreas. El programa dado toma población y área como entrada. 
Tarea Complete el programa para generar "pequeño país" si se cumplen ambas condiciones. 
No emita nada de lo contrario. Entrada de muestra 9955 7522 Salida de muestra pais pequeño
*/

public class problema5 {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
    
    System.out.println("Bienvenido(a) Ingrese la Poblacion:");
    String strpoblacion = buffer.readLine();
    Integer poblacion = Integer.parseInt(strpoblacion);
    
    System.out.println("Bienvenido(a) Ingrese la Superficie:");
    String strsuperficie = buffer.readLine();
    Integer superficie = Integer.parseInt(strsuperficie);
    
    if(poblacion <10000 && superficie <10000){
       System.out.println("Es un Pais Pequeño");
    }
    
    }

}