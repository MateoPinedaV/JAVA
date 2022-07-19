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
 *Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente 
 *desea saber cuanto debera pagar finalmente por su compra
 */

public class valor_compra {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarDatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarDatos);
    
    System.out.println("Ingrese el valor de su compra:");
    String strcompra = buffer.readLine();
    Double compra = Double.valueOf(strcompra);
    
    double descuento = 0.15;
    double aplicardescuento = compra*descuento;
    double total = compra - aplicardescuento;
    
     System.out.println("El valor final de su comora es: " + total + " Pesos");
    
}

}
