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
Determina el área de un cuadrado. y Determina el perímetro de un cuadrado
*/
public class repaso1 {
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
    
    System.out.println("Bienvenido(a) Ingrese el lado A del cuadrado:");
    String strladoA = buffer.readLine();
    Integer ladoA = Integer.parseInt(strladoA);
    
    System.out.println("Bienvenido(a) Ingrese el lado B del cuadrado:");
    String strladoB = buffer.readLine();
    Integer ladoB = Integer.parseInt(strladoB);

    int area = ladoA*ladoB;
    System.out.println("El Area del cuadrado es: " + area);
    
    int perimetro = ladoA+ladoB+ladoA+ladoB;
    System.out.println("El Perimetro del cuadrado es: " + perimetro);
    
    
    
    
    }
}
