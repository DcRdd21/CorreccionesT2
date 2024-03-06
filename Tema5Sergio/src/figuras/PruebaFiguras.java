/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import punto.Punto;

/**
 *
 * @author matmense
 */
public class PruebaFiguras {
    public static void main(String[] args) {
        Punto centro = new Punto(0, 0);

        Circulo circulo = new Circulo(centro, 5);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        System.out.println("Centro del círculo: " + circulo.getCentro());

        Rectangulo rectangulo = new Rectangulo(centro, 4, 6);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        System.out.println("Centro del rectángulo: " + rectangulo.getCentro());

        Cuadrado cuadrado = new Cuadrado(centro, 3);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
        System.out.println("Centro del cuadrado: " + cuadrado.getCentro());

        Triangulo triangulo = new Triangulo(centro, 4, 5);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: No se puede calcular directamente");
        System.out.println("Centro del triángulo: " + triangulo.getCentro());
    }
}
