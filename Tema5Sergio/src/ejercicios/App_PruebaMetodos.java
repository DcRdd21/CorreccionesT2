/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author matmense
 */
public class App_PruebaMetodos {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        Utilidades app=new Utilidades();
        
        System.out.println("Introduce una temperatura en Cº: ");
        double grados=sc.nextDouble();
        
        System.out.println("Introduce un número entero: ");
        int numero=sc.nextInt();
        
        System.out.println("Cº: " + grados + "Fº: " + app.toFahrenheit(grados));
        System.out.println(numero + ", Mayor Divisor: " +app.mayorDivisor(numero));
        System.out.println(numero + ", ¿Es Par? : " + app.par(numero));
        
    }
    
}
