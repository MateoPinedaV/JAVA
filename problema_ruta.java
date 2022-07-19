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
* Todos los lunes, miercoles y viernes una persona corre la misma ruta y cronometra 
* los tiempos obtenidos. determinar el tiempo promedio que la persona tarda en recorrer la ruta en una semana cualquiera
 */
public class problema_ruta {
     
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarDatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarDatos);
    
    System.out.println("Ingrese la ruta recorrida en Kilometros:");
    String strruta = buffer.readLine();
    Double ruta = Double.valueOf(strruta);
    
    System.out.println("Ingrese el tiempo del dia lunes:");
    String strLunes = buffer.readLine();
    Double lunes = Double.valueOf(strLunes);
    
    System.out.println("Ingrese el tiempo del dia Miercoles:");
    String strMiercoles = buffer.readLine();
    Double miercoles = Double.valueOf(strMiercoles);
    
    System.out.println("Ingrese el tiempo del dia viernes:");
    String strViernes = buffer.readLine();
    Double viernes = Double.valueOf(strViernes);
    
    double promedio = (lunes +miercoles + viernes)/3;
    
    System.out.println("El tiempo promedio que tarda en recorrer la ruta semanal de: " + ruta + " Km " + " es de :" + promedio + " Minutos");
    
    
    
}
}