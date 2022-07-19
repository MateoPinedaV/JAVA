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
Diseñar un programa que calcule el Índice de Masa Corporal (IMC) de una persona. 
*/
public class repaso4 {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
    
    System.out.println("Bienvenido(a) Ingresa tu peso en Kilogramos:");
    String strpeso = buffer.readLine();
    double peso = Double.valueOf(strpeso); //Convertir string a numero decimal
    
    System.out.println("Bienvenido(a) Ingresa tu altura en metros:");
    String straltura = buffer.readLine();
    double altura = Double.valueOf(straltura);
    
    double IMC = peso/(altura * altura);
    System.out.println("Tu indice de masa corporal es: " + IMC );
    
    if (IMC < 18.50){
         System.out.println("Bajo peso");
    
    }if (IMC < 16.00){
         System.out.println("Delgadez severa");
    
    }if (IMC >= 16.00 && IMC <=16.99){
         System.out.println("Delgadez Moderada");
    
    }if (IMC >= 17.00 && IMC <=18.49){
         System.out.println("Delgadez Aceptable");
    
    }if (IMC >= 18.50 && IMC <=24.99){
         System.out.println("Normal");
    
    }if (IMC >= 25.00){
         System.out.println("Sobrepeso");
    
    }if (IMC >= 25.00 && IMC <=29.99){
         System.out.println("Pre obeso(Riesgo)");
    
    }if (IMC >= 30.00){
         System.out.println("Obeso");
         
    }if (IMC >= 30.00 && IMC <=34.99){
         System.out.println("Obeso tipo 1 (Riesgo moderado)");
    
    }if (IMC >= 35.00 && IMC <=39.99){
         System.out.println("Obeso tipo 2 (Riesgo severo)");
    
    }if (IMC >= 40.00){
         System.out.println("Obeso tipo 3 (Riesgo muy severo)");
         
    }
      
      }

}

