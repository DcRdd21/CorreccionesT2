/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author matmense
 * 
 * Escribe un programa Areas que permita al usuario elegir el cálculo del área de cualquiera
de las siguientes figuras geométricas: cuadrado, rectángulo, círculo o triángulo, mediante
métodos. Para ello muestra al usuario un menú
 * 
 */
public class Areas {
    public static double cuadrado(double lado){
        return lado*lado;
    }
    public static double rectangulo(double base, double altura){
        return base*altura;
    }
    public static double circulo(double radio){
        return Math.PI*Math.pow(radio, 2);
    }
    public static double triangulo(double base, double altura){
        return base*altura/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Que quieres hacer: ");
        System.out.println("Area de Cuadrado '1': ");
        System.out.println("Area de Rectangulo '2': ");
        System.out.println("Area de Circulo '3': ");
        System.out.println("Area de Triangulo '4': ");
        int resp=sc.nextInt();
        
        switch(resp){
            case (1):
                System.out.println("Introduce el lado del cuadrado: ");
                double lado=sc.nextDouble();
                System.out.println("El area del cuadrado con lado " + lado + "es: " + cuadrado(lado));
                break;
            case (2):
                System.out.println("Introduce la base del rectangulo: ");
                double base=sc.nextDouble();
                System.out.println("Introduce la altura del rectangulo: ");
                double altura=sc.nextDouble();
                System.out.println("El area del rectangulo con base " + base + " y altura " + altura + "es: " + rectangulo(base, altura));
                break;
            case (3):
                System.out.println("Introduce el radio del circulo: ");
                double radio=sc.nextDouble();
                System.out.println("El area del circulo con lado " + radio + "es: " + circulo(radio));
                break;
            case (4):
                System.out.println("Introduce la base del triangulo: ");
                double basetr=sc.nextDouble();
                System.out.println("Introduce la altura del triangulo: ");
                double alturatr=sc.nextDouble();
                System.out.println("El area del triangulo con base " + basetr + " y altura " + alturatr + "es: " + triangulo(basetr, alturatr));
                break;
            default:
                System.out.println("Esa opción no existe. Intente de nuevo.");
                break;
        }
        
    }
}
