/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

import java.io.IOException;

/**
 *
 * @author MATEO PINEDA
 */

/*
Crear un programa que muestre los 100 primeros numeros primos
*/
public class ejercicio4 {
    
    public static void main(String[]args) throws IOException{
        String resultado = "";
        
        int contador = 0;
        int numero = 1;
        while(contador < 100){
            if(esprimo(numero)){
                resultado += numero + ", ";
                contador ++;
            }
            numero++;
        }
        System.out.println("Los primeros 100 numeros primos son: " + resultado);
    }
    
    private static Boolean esprimo(Integer numero){
        Boolean esunnumeroprimo = true;
        
        for (int i=2; i<numero; i++){
           
            if(numero % i == 0){
                esunnumeroprimo = false;
            }
        }
        
        return esunnumeroprimo;
    }
    

}