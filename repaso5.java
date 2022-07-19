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
Una empresa que comercializa sus productos en EEUU te manda desarrollar un programa 
que convierta dólares a euros. Diseña el algoritmo
*/
public class repaso5 {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
    
    System.out.println("Bienvenido(a) ingresa el numero de dolares:");
    String strdolar = buffer.readLine();
    Integer dolar = Integer.parseInt(strdolar);
    
    double euro = 1.07366;
    double operacion = dolar*euro;
    
    System.out.println("El numero de Dolares " + dolar + " es igual a: " + operacion +" Euros");
    
    
    
}

}