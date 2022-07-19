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
Programa para saber si un numero es primo
*/

public class ejercicio3 {
      
    public static void main(String[]args) throws IOException {
        
        Integer numero = 11;
        Boolean esprimo = true;
        
        for (int i = 2; i < numero; i++) {
            
            if (numero % i == 0){
                esprimo = false;
                
            }
        }
                
        if (esprimo){
                 System.out.println("Es primo");
         }
        else{
                 System.out.println("No Es primo");
             
        }
   
    
    
    
    
    }          

}
 