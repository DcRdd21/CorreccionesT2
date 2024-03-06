/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ej4;

import java.util.Scanner;

/**
 *
 * @author margalar
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //menú de opciones
        System.out.println("Elija entre las siguientes figuras: ");
        System.out.println("1) Circulo ");
        System.out.println("2) Cuadrado ");
        System.out.println("3) Rectángulo ");
        System.out.println("4) Triángulo");
        int opcion = sc.nextInt();

        Areas app = new Areas();

        //switch de opciones 
        switch (opcion) {
            case 1: //círculo 
            {
                //pedir dato 
                System.out.println("Introduce el radio: ");
                double radio = sc.nextDouble();

                double solucion = app.circulo(radio); //llamar al objeto
                System.out.println("El área es: " + solucion); //mostrar solución
                break;
            }
            case 2: //cuadrado
            {
                //pedir dato 
                System.out.println("Introduce el lado: ");
                double lado = sc.nextDouble();

                double solucion = app.cuadrado(lado); //llamar al objeto
                System.out.println("El área es: " + solucion); //mostrar solución 
                break;
            }
            case 3: //rectángulo
            {
                //pedir datos
                System.out.println("Introduce el largo: ");
                double largo = sc.nextDouble();
                System.out.println("Introduce el ancho: ");
                double ancho = sc.nextDouble();

                double solucion = app.rectangulo(largo, ancho);//llamar al objeto 
                System.out.println("El área es: " + solucion); //mostrar la solución 
                break;
            }
            case 4: //triángulo
            {
                //pedir datos 
                System.out.println("Introduce la base: ");
                double base = sc.nextDouble();
                System.out.println("Introduce la altura: ");
                double altura = sc.nextDouble();

                double solucion = app.triangulo(base, altura); //llamar al objeto 
                System.out.println("El área es: " + solucion); //mostrar la solución
                break;
            }
            default: {
                System.out.println("Opción no contemplada"); //otras opciones 
                break;
            }
        }
    }
}
