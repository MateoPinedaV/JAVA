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
public class promediode3Numeros {
/*
Crear un programa que permita ingresar 3 numeros y mosstrar cual es el numero promedio    
*/ 
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
    
    float promedio = (num1 + num2 + num3)/3;
    System.out.println("El promedio de los 3 numeros es: " + promedio);
    
    
    
}
}
