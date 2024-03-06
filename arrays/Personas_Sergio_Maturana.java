/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author matmense
 * 
 * Crea un programa Personas que almacene en un array los nombres de 20 personas
introducidos por teclado. Diseña los siguientes métodos:
a. imprimePersonas: visualiza por pantalla los elementos del array, una en cada fila.
b. pares: visualiza por pantalla los elementos del array que ocupan las posiciones
pares. Cada elemento debe ir en una fila.
 * 
 */
public class Personas {
    
    public static void imprimePersonas(String[]nombres){
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Posición " + i + ": ");
            System.out.println(nombres[i]);
        }
    }
    
    public static void pares(String[]nombres){
        for (int i = 0; i < nombres.length; i++) {
            if (i%2==0) {
                System.out.print("Posición " + i + ": ");
                System.out.println(nombres[i]);
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String[]nombres=new String[20];
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce un nombre (" + (i+1) + "/20): ");
            String nombre=sc.next();
            nombres[i]=nombre;
        }
        
        imprimePersonas(nombres);
        
        pares(nombres);
        
    }
    
}
