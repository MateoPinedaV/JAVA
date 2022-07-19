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

/**
 * Escribir un programa que calcule el salario de un trabajador de la manera siguiente. el trabajador cobra un precio fijo por hora y se le descuenta
 * el 10% en concepto de impuesto de renta. el programa debe pedir el nombre del trabajador, las horas trabajadas , y el precio que cobra por hora
 * como salida debe imprimir el sueldo bruto, el descuento de renta y el salario a pagar
 */

public class problema_trabajador {
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarEDAD = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarEDAD);
 
    System.out.println("Ingresa tu nombre:");
    String strnombre = buffer.readLine();
    
    System.out.println("Ingresa las horas trabajadas");
    String strht = buffer.readLine();
    Integer horas = Integer.parseInt(strht);
    
    System.out.println("Ingresa el precio que cobras por hora:");
    String strvalor = buffer.readLine();
    Double valor = Double.valueOf(strvalor);
    
    double salarioBruto = horas*valor;
    double descuentoRenta = salarioBruto*0.10;
    double totalPagar = salarioBruto - descuentoRenta;
    
    System.out.println(strnombre + " Tu salario bruto es de: $" + salarioBruto);
    System.out.println("El descuento de renta es de: $" + descuentoRenta);
    System.out.println("El salario total a pagar es de: $" + totalPagar);
    
}

}
