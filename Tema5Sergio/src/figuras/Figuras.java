/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

// Clase abstracta para Figuras Geométricas

import punto.Punto;

// Clase abstracta para Figuras Geométricas
abstract class FiguraGeometrica {
    private Punto centro;

    public FiguraGeometrica(Punto centro) {
        this.centro = centro;
    }

    abstract double calcularArea();
    abstract double calcularPerimetro();

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
}

// Círculo
class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(Punto centro, double radio) {
        super(centro);
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

// Rectángulo
class Rectangulo extends FiguraGeometrica {
    private double ancho;
    private double alto;

    public Rectangulo(Punto centro, double ancho, double alto) {
        super(centro);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    double calcularArea() {
        return ancho * alto;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}

// Cuadrado
class Cuadrado extends Rectangulo {
    public Cuadrado(Punto centro, double lado) {
        super(centro, lado, lado);
    }
}
// Triángulo
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(Punto centro, double base, double altura) {
        super(centro);
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    double calcularPerimetro() {
        // En un triángulo, el perímetro no se puede calcular directamente sin conocer los lados
        return -1;
    }
}