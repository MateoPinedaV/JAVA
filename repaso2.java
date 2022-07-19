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
Crear un programa para calcular la edad de una madre en el momento de dar a luz a alguno de sus hijos.
*/

public class repaso2 {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
    
    System.out.println("Bienvenido(a) Ingresa la edad de tu Madre:");
    String stredadmadre = buffer.readLine();
    Integer edadmadre = Integer.parseInt(stredadmadre);
    
    System.out.println("Bienvenido(a) Ingresa tu edad:");
    String stredadhijo = buffer.readLine();
    Integer edadhijo = Integer.parseInt(stredadhijo);
    
    int resultado = edadmadre - edadhijo;
    System.out.println("Naciste cuando tu madre tenia " + resultado + " años");
    
    }

}