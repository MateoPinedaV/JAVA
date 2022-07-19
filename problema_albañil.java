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
 * Un constructor sabe que necesita 0.5 metros cubicos de arena por metro cuadrado de 
 * revoque a realizar. hacer un programa donde ingrese las medidas de una pared
 * Largo y alto expresada en metros y obtenga la cantidad de arina necesaria para revocarla
 */
public class problema_albañil {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarDatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarDatos);
    
    System.out.println("Ingrese el alto en metros:");
    String stralto = buffer.readLine();
    Double alto = Double.valueOf(stralto);
    
    System.out.println("Ingrese el largo en metros:");
    String strlargo = buffer.readLine();
    Double largo = Double.valueOf(strlargo);
    
    double area = largo*alto;
    double arena = area*0.5;
    
    System.out.println("El area de la pared es de: " + area + " Metros");
    System.out.println("La cantidad de arena necesaria es de: " + arena + " Metros cubicos");
    
    

    }

}