/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ej4;

/**
 *
 * @author margalar
 */
public class Areas {
    public double circulo(double radio){
        return (Math.PI*(radio*radio));
    }
    public double cuadrado(double lado){
        return lado * lado; 
    }
    public double rectangulo(double largo, double ancho){
        return largo * ancho;
    }
    public double triangulo(double base, double altura){
        return (base * altura)/2;
    }
}
