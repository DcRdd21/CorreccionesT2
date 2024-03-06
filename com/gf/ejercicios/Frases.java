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
public class Frases {

    public static void main(String[] args) {
        String[] frases = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < frases.length; i++) {           
            frases[i] = sc.nextLine();
            System.out.println("Introduce la frase " + i + " : ");

        }
        imprimeFrases(frases);
        mayorFrase(frases);
        menorFrase(frases);
    }

    public static void imprimeFrases(String[] frases) {
        for (int i = 0; i < frases.length; i++) {
            String lista = frases[i];
            System.out.println("frase " + i + " : " + lista);

        }
        for (String frase : frases){
            System.out.println("Frase "+frase);
        }
    }

    public static void mayorFrase(String[] frases) {
        int num=0;
        String lista = "";
        int longitud = 0;
        for (int i = 0; i < frases.length; i++) {
            if (frases[i].length() < longitud) {
                longitud = frases[i].length();
                num = i;
                lista=frases[i];
            }
        }
        System.out.println ("La frase más larga es: "+lista);
        System.out.println("La posición que ocupa es: "+ num);

    }

    public static void menorFrase(String[] frases) {
        int num=0;
        String lista = "";
        int longitud = 0;
        for (int i = 0; i < frases.length; i++) {
            if (frases[i].length() > longitud) {
                longitud = frases[i].length();
                num = i;
                lista=frases[i];
            }
        }
        System.out.println ("La frase más corta es: "+lista);
        System.out.println("La posición que ocupa es: "+ num);

    }
    

    
}
