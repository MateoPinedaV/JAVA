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
public class edadBasico {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarEDAD = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarEDAD);
 
    System.out.println("Ingrese su edad:");
    String strEDAD = buffer.readLine();
    Integer edad = Integer.parseInt(strEDAD); //Convertir string (texto) a int (Entero)
    
    if (edad >= 18){
        System.out.println("Es mayor de edad");
    } else {
         System.out.println("Es menor de edad");
    }
        
        
}
   
}
    




