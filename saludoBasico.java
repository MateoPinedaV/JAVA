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
public class saludoBasico {
    
    public static void main(String[]args) throws IOException {
        InputStreamReader ingresarDatos = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(ingresarDatos);
        
        System.out.println("Ingrese su nombre:");
        String nombre = buffer.readLine();
        System.out.println("Bienvenido " + nombre);
    }
}
