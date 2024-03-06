/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

import java.util.Random;

/**
 *
 * @author bregonlu Escribe un programa ListaAleatoria que cree e imprima por
 * pantalla un array de 10 elementos con números aleatorios comprendidos entre 1
 * y 10, de tal forma que no se repita ninguno.
 */
public class ListaAleatoria {
    public static void main(String[] args) {
        int[] lista = generarListaAleatoria();
        mostrarLista(lista);
    }

    public static int[] generarListaAleatoria() {
        int[] lista = new int[10];
        boolean[] numerosUsados = new boolean[11];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = r.nextInt(10+1);
            } while (numerosUsados[numeroAleatorio]);
            numerosUsados[numeroAleatorio] = true;
            lista[i] = numeroAleatorio;
        }
        return lista;
    }

    public static void mostrarLista(int[] lista) {
        System.out.print("Lista Aleatoria: "); //recorremos el array para mostrarlo
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
            if (i < lista.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
