/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author matmense
 */
public class Ejemplo2 {
    
    public static double raizCuadrada(int num){
        if (num>0) {
            return Math.sqrt(num);
        }
        num--;
        return -1; //indicador de error
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println();
        
    }
    
}
