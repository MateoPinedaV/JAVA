/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

/**
 *
 * @author MATEO PINEDA
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 /*
Tu robot puede reconocer tus emociones marcadas con el número que representa 
cada una de ellas:

1 - ¡Eres feliz!
2 - ¡Estás triste!
3 - ¡Estás enojado!
4 - ¡Estás sorprendido!

Escriba un programa que tome el número de emoción como entrada y emita el mensaje
correspondiente en el formato dado. Si la entrada es una emoción que el programa no 
conoce, debe generar: "Emoción desconocida".
*/
       
public class problema6 {

   public static void main(String[]args) throws IOException {
    InputStreamReader ingresarEMOCION = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarEMOCION);
    
    System.out.println("Ingresa un numero de (1) a (4):");
    String strEMOCION = buffer.readLine();
    Integer emocion = Integer.parseInt(strEMOCION);
       
    switch(emocion){
        case 1 -> System.out.println("¡Eres feliz!");
        case 2 -> System.out.println("¡Estas triste!");
        case 3 -> System.out.println("¡Estas enojado!");
        case 4 -> System.out.println("¡Estas sorprendido!");
        default -> System.out.println("Emocion desconocida.");

                 
                 
                 
                 


        }
       
       
   }
}