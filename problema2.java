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
 Tom y Bob estan jugando un juego de mesa, en el que ambos jugadores
 comienzan con el mismo numero de puntos. Tom gano el primer
 juego y obtuvo 1 punto, mientas que bob perdio el juego
 y por lo tanto perdio 1 punto. crear un programa que 
 muestre de forma correcta los resultados de cada ronda.
*/
import java.util.Scanner;

public class problema2 {
    
   public static void main(String[]args){
       
       Scanner scanner = new Scanner(System.in);
       //Tomar puntaje inicial
       int puntajeinicial = scanner.nextInt();
       int puntajeTom = puntajeinicial;
       int puntajeBob = puntajeinicial;
       
       System.out.println("Resultados ronda 1: ");
       System.out.println(++puntajeTom);
       System.out.println(--puntajeBob);
       
       
       
       
   } 
 }
