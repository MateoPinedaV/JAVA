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
¿Cansado de resolver ecuaciones de primer grado? Pues te proponemos que diseñes un programa 
que lo haga por ti. La ecuación de primer grado vamos a poner que sea del tipo ax + b = cx + d. 
*/
public class repaso6 {
     
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
    
    System.out.println("Bienvenido(a) Ingresa el coeficiente (A):");
    String stra = buffer.readLine();
    double a = Double.valueOf(stra); //Convertir string a numero decimal
    
    System.out.println("Bienvenido(a) Ingresa el coeficiente (B):");
    String strb = buffer.readLine();
    double b = Double.valueOf(strb);
    
    System.out.println("Bienvenido(a) Ingresa el coeficiente (C):");
    String strc = buffer.readLine();
    double c = Double.valueOf(strc); //Convertir string a numero decimal
    
    System.out.println("Bienvenido(a) Ingresa el coeficiente (D):");
    String strd = buffer.readLine();
    double d = Double.valueOf(strd);
    
    double X =(d - b)/(a - c);
    System.out.println("El resultado es: " + X);
    

    
    
    }



}