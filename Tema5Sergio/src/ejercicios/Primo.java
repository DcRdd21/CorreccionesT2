/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author smatu
 * 
 * Escribe un programa Primo que muestre si un número dado por el usuario es primo o no.
Crea para ello un método llamado esPrimo.
 * 
 */
public class Primo {
    public static boolean Primo(int num){
        boolean primo = true; 
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Introduce un entero: ");
        int num=sc.nextInt();
        
        if (Primo(num)) {
            System.out.println("Es primo");
        }else{
            System.out.println("NO es primo");
        }
        
    }
}
