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
El gerente de ventas decidió dar una tarjeta de regalo a los clientes cuyas compras sumen más
de 15000. Además, los clientes cuyas compras totales sean superiores a 30000 recibirán una
segunda tarjeta de regalo. Se le proporciona un programa, que toma el monto de la compra 
como entrada e imprime "Tarjeta de regalo" si es superior a 15000.

Tarea Complete el código para imprimir "Tarjeta de
regalo" nuevamente si la compra es superior a 30000. Entrada de muestra 36000

Salida esperada
Tarjeta de regalo
Tarjeta de regalo
*/


public class problema4 {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarvalorcompra = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarvalorcompra);
    
    System.out.println("Bienvenido(a) Ingrese el valor de su compra:");
    String strvalor = buffer.readLine();
    Integer valor = Integer.parseInt(strvalor);
    
    // Condicion 1
    if (valor > 15000){
    System.out.println("Tarjeta de regalo");   
    }
    
    // Condicion 2
    if (valor > 30000){
    System.out.println("Tarjeta de regalo");   
    }
    
    
    
    
    }

}