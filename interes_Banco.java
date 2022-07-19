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
 *Suponga que un individuo desea invertir su capital en un banco y desea saber 
 * cuanto dinero ganara despues de un mes ei el banco paga a razon de 2% mensual
 */

public class interes_Banco {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarDatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarDatos);
    
    System.out.println("Ingrese la Cantidad de dinero invertido:");
    String strDinero = buffer.readLine();
    Double Dinero = Double.valueOf(strDinero);
    
    double interes = 0.2;
    double total = (Dinero * interes);
    
    System.out.println("La ganancia pasado un mes es de: " + total + " Pesos");
    
}

}
