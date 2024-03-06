/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frases;

import java.util.Scanner;

/**
 *
 * @author fraferal
 */
public class Frases {

    public static void imprimeFrases(String[] frases) {
        for (int i = 0; i < frases.length; i++) {
            String lista = frases[i];
            System.out.println("Frase " + i + " : " + lista);
        }
    }

    public static void mayorFrase(String[] frases) {
        String lista = "";
        int posicion = 0;
        for (int a = 0; a < frases.length; a++) {
            if (frases[a].length() > lista.length()) {
                lista = frases[a];
                posicion = a;
            }
        }
        System.out.println("La frase mas larga es: |" + lista + "| en la posicion: " + posicion);
    }

    public static void menorFrase(String[] frases) {
        String lista = frases[0];
        int posicion = 0;
        for (int b = 0; b < frases.length; b++) {
            if (frases[b].length() < lista.length()) {
                lista = frases[b];
                posicion = b;
            }
        }
        System.out.println("La frase mas corta es: |" + lista + "| en la posicion " + posicion);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] frases = new String[5];

        for (int i = 0; i < frases.length; i++) {
            System.out.println("Introduce la frase: ");
            frases[i] = sc.nextLine();
        }

        imprimeFrases(frases);
        System.out.println("------------------------");
        mayorFrase(frases);
        System.out.println("------------------------");
        menorFrase(frases);

    }

}
