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
Se necesita un programa para convertir dias a segundos
ejemplo de entrada 12 dias salida esperada = 1036800
*/

public class problema3 {
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardias = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardias);
    
    System.out.println("Bienvenido(a) Ingrese el numero de dias que desea pasar a segundos:");
    String strdias = buffer.readLine();
    Integer dias = Integer.parseInt(strdias);
    
    // 1 dia = 24 horas
    // 24 horas = 1,440 minutos
    // 1,440 minutos = 86,400 segudos
    
    int segundos = 86400;
    int convertirSeg = segundos*dias;
    
    System.out.println("El numero total de dias: " + dias + " es igual a: " + convertirSeg + " segundos");
    
    
    
    }
}