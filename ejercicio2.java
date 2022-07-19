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
Crear un programa que permita ingrear un numero y mostrar si es par o impar
*/

public class ejercicio2 {
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
    
    System.out.println("Bienvenido(a) Ingrese el numero:");
    String strnumero = buffer.readLine();
    Integer numero = Integer.parseInt(strnumero);
    
    Boolean determinarNumero = (numero % 2) == 0;
    
    if(determinarNumero){
       System.out.println("El numero es Par");
    } else {
       System.out.println("El numero es impar");
    }
    
    
    
    
    }

}