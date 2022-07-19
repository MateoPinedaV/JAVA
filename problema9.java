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
Estás creando un sistema de seguridad bancaria. El usuario debe insertar la contraseña
correcta para poder acceder a los pagos. La contraseña es 8819. Tarea
Escribir un programa que tomará continuamente una contraseña como entrada y salida
Escribir contraseña, hasta que el cliente inserte la contraseña correcta.
Entrada de muestra 3332 8819 Salida de muestra escribir contraseña escribir contraseña
*/

public class problema9 {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresardatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresardatos);
 
    System.out.println("Ingresa la contraseña:");
    String strclave = buffer.readLine();
    Integer clave = Integer.parseInt(strclave); //Convertir string (texto) a int (Entero)
    
    do{
       System.out.println("intenta de nuevo");
       
    }
    while (clave != 8819); //
    
    }

}