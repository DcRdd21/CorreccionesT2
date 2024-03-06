/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

import java.util.Random;

/**
 *
 * @author delcrego
 */
public class ListaAleatoria {

    public static void main(String[] args) {
        int[] array = lista(10, 1, 10);
        imprimirarray(array);
    }

    public static int[] lista(int longi, int min, int max) {
        int[] array = new int[longi];
        Random random = new Random();
        for (int i = 0; i < longi; i++) {
            int numaleatorio;
            boolean repe;
            do {
                numaleatorio = random.nextInt(10) + 1;
                repe = false;
                for (int j = 0; j < i; j++) {
                    if (array[j] == numaleatorio) {
                        repe = true;
                    }
                }
            } while (repe);
            array[i] = numaleatorio;
        }
        return array;
    }
    
    public static void imprimirarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


   
}