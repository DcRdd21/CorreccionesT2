/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios;

import java.util.Scanner;

/**
 *
 * @author cabdelda
 */
public class CapicuaBis {
    public static boolean esNumero(String s){
        try{
            Integer.parseInt(s);
        }catch(NumberFormatException ex){
            return false;
        }
        return true;
    }
    
    public static boolean capicua(String num){
        char[] numero = num.toCharArray();
        for (int i = 0; i < numero.length; i++) {
            if( numero[i] != numero [numero.length-1-i]) return false;
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("");
        String num = sc.next();
        
        if(!esNumero(num)){
            System.out.println("Dato no numerico");
        }else{
            if(capicua(num)){
                System.out.println("El numero es capicua");
            }else{
                System.out.println("El numero no es capicua");
            }
        }
    }
}
