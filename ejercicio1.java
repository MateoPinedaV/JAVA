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
public class ejercicio1 {
//Crear un programa que permita ingresar 3 numeros y mostrar cual es el mayor
// Y cual es el menor     
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarNUMEROS = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarNUMEROS);

    System.out.println("Ingrese el numero Uno(1):");
    String strNumero1 = buffer.readLine();
    Integer num1 = Integer.parseInt(strNumero1); //Converit Str a Int
    
    System.out.println("Ingrese el numero Dos(2):");
    String strNumero2 = buffer.readLine();
    Integer num2 = Integer.parseInt(strNumero2); //Converit Str a Int
    
    System.out.println("Ingrese el numero Tres(3):");
    String strNumero3 = buffer.readLine();
    Integer num3 = Integer.parseInt(strNumero3); //Converit Str a Int
    
    
    // Mayor
    Integer numeroMayor = num1;
    
    if (num2 > numeroMayor){
        numeroMayor = num2;
    }
    if (num3 > numeroMayor){
        numeroMayor = num3;
        
    }
    
    System.out.println("El numero mayor es: " + numeroMayor);
    
    // Menor
    Integer numeroMenor = num1;
    
    if (num2 < numeroMenor){
        numeroMenor = num2;
    }
    if (num3 < numeroMenor){
        numeroMenor = num3;
        
    }
    
    System.out.println("El numero menor es: " + numeroMenor);
    
    }


}