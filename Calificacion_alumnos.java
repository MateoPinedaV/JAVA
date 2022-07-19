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
 *un alumno desea saber cual sera su promedio general en las tres mataerias mas dificiles que cursa 
 *y cual sera el promedio que obtendra en cada una de ellas.
 *estas materias se evalucan como se muestra a continuacion:
 *Matematicas examen 90% tareas 10%  3 tareas
 *Fisica exmanen 80% tareas 20%  2 tareas
 *Quimica examen 85% tareas 15%  3 tareas
 */
public class Calificacion_alumnos {
    
    public static void main(String[]args) throws IOException {
    InputStreamReader ingresarNota = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(ingresarNota);
    
    
    double tareas;
    double promedio1;
    double promedio2;
    double promedio3;
    double promediogeneral;
 
    System.out.println("Ingresa la nota del examen de matematicas");
    String strNota = buffer.readLine();
    Double Nota = Double.valueOf(strNota);
    
    System.out.println("Ingresa las calificaciones de las 3 tareas");
    String strA1 = buffer.readLine();
    Double A1 = Double.valueOf(strA1);
    String strB1 = buffer.readLine();
    Double B1 = Double.valueOf(strB1);
    String strC1 = buffer.readLine();
    Double C1 = Double.valueOf(strC1);
    tareas = (A1+B1+C1)/3;
    promedio1 = (Nota*0.90)+(tareas*0.10);
    
    System.out.println("Ingresa la nota del examen de Fisica");
    String strNota2 = buffer.readLine();
    Double Nota2 = Double.valueOf(strNota2);
    
    System.out.println("Ingresa las calificaciones de las 2 tareas");
    String strA2 = buffer.readLine();
    Double A2 = Double.valueOf(strA2);
    String strB2 = buffer.readLine();
    Double B2 = Double.valueOf(strB2);
    tareas = (A2+B2)/2;
    promedio2 = (Nota2*0.80)+(tareas*0.20);
    
    System.out.println("Ingresa la nota del examen de Quimica");
    String strNota3 = buffer.readLine();
    Double Nota3 = Double.valueOf(strNota3);
    
    System.out.println("Ingresa las calificaciones de las 3 tareas");
    String strA3 = buffer.readLine();
    Double A3 = Double.valueOf(strA3);
    String strB3 = buffer.readLine();
    Double B3 = Double.valueOf(strB3);
    String strC3 = buffer.readLine();
    Double C3 = Double.valueOf(strC3);
    tareas = (A3+B3+C3)/3;
    promedio3 = (Nota2*0.85)+(tareas*0.15);
    promediogeneral = (promedio1+promedio2+promedio3)/3;
    
    System.out.println("El promedio de matematicas es: "+promedio1);
    System.out.println("El promedio de fisica es: "+promedio2);
    System.out.println("El promedio de quimica es: "+promedio3);
    System.out.println("El promedio general de todas las materias es: "+promediogeneral);
   
    

    }
}
