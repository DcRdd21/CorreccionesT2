/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.arrays.matrices;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author maytompa
 */
public class MatrizTraspuesta {
    
    public static void imprimirMatriz(int[][] matriz) {
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
    public static void trasponerMatriz(int[][] matriz) {
 
        int nuevaMatriz[][]= new int [5][4];
        
        for (int i = 0; i < nuevaMatriz.length; i++) {
            for (int j = 0; j < nuevaMatriz[0].length; j++) {
                nuevaMatriz[i][j]=matriz[j][i];
            }
        }
        imprimirMatriz(nuevaMatriz);
    }
    public static void main(String[] args) {
        
        Random r = new Random();
        int[][] matriz = new int[4][5];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]= r.nextInt(1, 101);
            }
        }
        
        imprimirMatriz(matriz);
        System.out.println("");
        trasponerMatriz(matriz);
        
    }
}
