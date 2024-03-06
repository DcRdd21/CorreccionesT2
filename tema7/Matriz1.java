/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

import java.util.Arrays;

/**
 *
 * @author cabdelda
 */
public class Matriz1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int cont=1;
        int cont2=1;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i%2==0){
                    matriz[i][j]=cont*2;
                    cont++;
                }
                else{
                    matriz[i][j]=cont*3;
                    cont2++;
                }
            }    
        }
        
        mostrar(matriz);
        
        sumar(matriz);
        
        diagonal(matriz);
    }
    
    public static void mostrar(int[][] m){
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }
    
    public static void sumar(int[][] m){
        int suma=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                suma= suma + m[i][j];
            }
        }
        System.out.println(suma);
    }
    
    public static void diagonal(int[][] m){
        int suma=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(i==j){
                System.out.print(m[i][j]);
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}