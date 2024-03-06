/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author cabdelda
 */
public class Ejemplo2 {

    public static void mostrarMatriz(int[][] m) {
        int filas = m.length;
        int columnas = m[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(m[i][j]+" ");

            }

        }
    }
    public static void mostrarMatriz_bis(int[][] m) {
         for (int i = 0; i < m.length; i++) {
             System.out.println(Arrays.toString(m[i]));
         }
        
    }
    public static void llenarMatriz(int[][] m){
        int filas = m.length;
        int columnas = m[0].length;
        
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j]=r.nextInt(1,11);
                
            }
            
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[5][4];

        System.out.println("N de filas: " + matriz.length);
        System.out.println("N de columnas: " + matriz[0].length);

        mostrarMatriz(matriz);
        
       
    }

}
