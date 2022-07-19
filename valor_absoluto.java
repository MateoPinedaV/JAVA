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
 * Leer un numero y escribir el valor absoluto del mismo
 */
public class valor_absoluto {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
 
    System.out.println("Ingrese el numero, para conocer su valor absoluto:");
    String strnumero = buffer.readLine();
    Integer numero = Integer.parseInt(strnumero);
    
    //Usar la funcion Math.abs
    int valorAbs = Math.abs(numero);
    
    System.out.println("El valor absoluto de: " + numero + " Es: " + valorAbs);
    
}
}
