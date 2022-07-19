/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

/**
 *
 * @author MATEO PINEDA
 */
/*
Su programa de calendario debería mostrar todos los días de la semana, pero tiene errores.
Cambia el código para que el programa imprima los días.
*/
public class Problema11 { //Arrays arreglos
    
    public static void main(String[] args) {
       String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

       for (int i = 0; i < 7; i++) {
           System.out.println(days[i]);
       }
   }
}

