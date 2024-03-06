/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.arrays.ejercicios;

/**
 *
 * @author maytompa
 */
public class Datos {
    public static void main(String[] args) {
        int[] datos= {1,2,3,4,5,6,7,8,9,10};
        
        sumaPares(datos);
    }
    
    public static void sumaPares(int[] datos) {
        int sumaTotal=0;
        for (int i = 0; i < datos.length; i++) {
            if((i+1)%2==0){
                System.out.println("Posicion " + (i+1) + ": " + datos[i]);
                sumaTotal=sumaTotal+ datos[i];
            }   
        }
        System.out.println("La suma de los pares es: " + sumaTotal);
    }
}
