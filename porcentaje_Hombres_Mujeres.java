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
public class porcentaje_Hombres_Mujeres {
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
 
    System.out.println("Ingrese el numero de Hombres:");
    String strhombres = buffer.readLine();
    Integer hombres = Integer.parseInt(strhombres);
    
    System.out.println("Ingrese el numero de Mujeres:");
    String strmujeres = buffer.readLine();
    Integer mujeres = Integer.parseInt(strmujeres);
    
    int totalEstudiantes = hombres + mujeres;
    double porcentajeHom = hombres*100/totalEstudiantes;
    double porcentajeMuj = mujeres*100/totalEstudiantes;
    
    System.out.println("Porcentaje total de hombres: " + porcentajeHom + "%");
    System.out.println("Porcentaje total de mujeres: " + porcentajeMuj + "%");
    
    

    }

}