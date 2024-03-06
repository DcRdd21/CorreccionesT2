/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author smatu
 */
public class Primos {

    public static void main(String[] args) {
        int cantidadPrimos = 100;
        int numeroActual = 2;  // Comenzamos desde el primer número primo

        System.out.println("Primeros " + cantidadPrimos + " números primos:");

        while (cantidadPrimos > 0) {
            if (Primo.Primo(numeroActual)) {
                System.out.print(numeroActual + " ");
                cantidadPrimos--;
            }
            numeroActual++;
        }
    }
    
}
