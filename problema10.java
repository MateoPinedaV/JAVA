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
Calculadora de préstamo

Tomas un préstamo de un amigo y necesitas calcular cuánto le deberás después de 3 meses.
Le devolverá el 10% del monto restante del préstamo cada mes.Cree un programa que tome el monto 
del préstamo como entrada, calcule y genere el monto restante después de 3 meses.

Entrada de muestra:
20000

Salida de muestra:
10628

Este es el calendario de pagos mensuales:

Mes 1
Pago: 10% de 20000 = 2000
Cantidad restante: 18000

Mes 2
Pago: 10% de 18000 = 1800
Cantidad restante: 16200

Mes 3:
Pago: 10% de 16200 = 1620
Cantidad restante: 14580

*/
public class problema10 {
     
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarvalorcompra = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarvalorcompra);
    
    System.out.println("Bienvenido(a) Ingrese el monto de la deuda:");
    String strmonto = buffer.readLine();
    Double monto = Double.valueOf(strmonto);
    
    for(int i=0; i<3; i++){
        double atrasos = monto*0.1; // representa 10%
        monto = monto - atrasos;
		
    }
    System.out.println((double)monto);
	
    }
}
    
    
    

