/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asier.ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author sobblaas
 */
public class ListaAleatoria {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        Random rdm = new Random();
        int iterador = 0;

        do {
            int aleatorio = rdm.nextInt(1, 11);
            if (!Arrays.stream(numeros).anyMatch(obj -> obj == aleatorio)) {
                numeros[iterador] = aleatorio;
                iterador++;
            }
        } while (iterador < numeros.length);
        
        for(int i=0;i<numeros.length;i++){
            System.out.printf("Posicion %d: %d\n",i,numeros[i]);
        }
    }
}
