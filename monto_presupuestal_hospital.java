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
*En un hopital existen 3 areas: Ginecologia, pediatria,traumatologia. El presupuesto anual del hospital se reparte
*conforme a la siguiente tabla
*area --- % del presupuesto
*ginecologia 40%
* traumatologia 30%
* pediatria 30%
* Obetener ña cantidad de dinero que recibira cada area, para culaquier monto presupuestal
 */

public class monto_presupuestal_hospital {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarDatos = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarDatos);
    
    System.out.println("Ingrese el Monto Presupuestal del hospital:");
    String strmonto = buffer.readLine();
    Double monto = Double.valueOf(strmonto);
    
    System.out.println("Al area de ginecologia le corresponde: $" + monto * 0.40 );
    System.out.println("Al area de Pediatria le corresponde: $" + monto * 0.30 );
    System.out.println("Al area de traumatologia le corresponde: $" + monto * 0.30 );
    
    
    }
}