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
diseñar un programa que te calcule la nota final de curso, 
como media de las de los tres trimestres.
*/

public class repaso3 {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
    
    System.out.println("Bienvenido(a) Ingresa la nota 1:");
    String strnota1 = buffer.readLine();
    double nota1 = Double.valueOf(strnota1); //Convertir string a numero decimal
    
    System.out.println("Bienvenido(a) Ingresa la nota 2:");
    String strnota2 = buffer.readLine();
    double nota2 = Double.valueOf(strnota2);
    
    System.out.println("Bienvenido(a) Ingresa la nota 3:");
    String strnota3 = buffer.readLine();
    double nota3 = Double.valueOf(strnota3);
    
    double notafinal = (nota1 + nota2 + nota3)/3;
    System.out.println("La nota final del curso es: " + notafinal);
    
    


    
    
    
    
    }
}