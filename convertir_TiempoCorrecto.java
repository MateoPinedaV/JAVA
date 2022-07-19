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
 * Dada una medida de tiempo expresada en horas, minutos y segundos con valores arbitrarios, 
 * elabore un programa que trasnforme dicha medida en una expresion correcta por ejemplo 
 * dada la medida 3h 118m 195s el programa debera dar como resultado 5h 1m 15s
 */
public class convertir_TiempoCorrecto {
    
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int hf;
		double horas;
		double ht;
		int minf;
		double minutos;
		double mt;
		double seg;
		double sf;
		
		System.out.println("Ingrese el tiempo a convertir en expresion correcta (Horas,Minutos,Segundos)");
		horas = Double.parseDouble(bufEntrada.readLine());
		minutos = Double.parseDouble(bufEntrada.readLine());
		seg = Double.parseDouble(bufEntrada.readLine());
		// Horas
		ht = horas+(minutos/60)+(seg/3600);
		// Usar funcion valor truncado
		hf = (int) Math.floor(ht);
		// Minutos
		mt = (ht-hf)*60;
		// Usar funcion valor truncado
		minf = (int) Math.floor(mt);
		// Segundos
		sf = (mt-minf)*60;
		System.out.println("La conversion de tiempo correcta es: "+hf+" Horas -- "+minf+" Minutos -- "+sf+" Segundos");
	}


}

    

