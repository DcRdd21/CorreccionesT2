/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.poo.racional;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author rodduraa
 */
public class Racional {

    //Parametros
    private int numerador;
    private int denominador;

    //Constructores
    public Racional(int num, int den) {
        this.numerador = num;
        this.denominador = den;
    }

    //metodos
    public double getNumerador() {
        return numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Racional sumar(Racional r2) {
        Racional resultado = new Racional((this.numerador * r2.denominador) + (r2.numerador * this.denominador),
                (this.denominador * r2.denominador));
        resultado.simplificar();
        return resultado;
    }

    public Racional restar(Racional r2) {
        Racional resultado = new Racional((this.numerador * r2.denominador) - (r2.numerador * this.denominador), (this.denominador * r2.denominador));
        resultado.simplificar();
        return resultado;
    }

    public Racional producto(Racional r2) {
        Racional resultado = new Racional(this.numerador * r2.numerador, this.denominador * r2.denominador);
        resultado.simplificar();
        return resultado;
    }

    public Racional dividir(Racional r2) {
        Racional resultado = new Racional(this.numerador * r2.denominador, this.denominador * r2.numerador);
        resultado.simplificar();
        return resultado;
    }

    //devuelve el decimal equivalente 
    public double toDecimal() {
        NumberFormat nf=NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(4);
        return Double.parseDouble(nf.format(this.numerador / (double)this.denominador));
    }

    //Imprime el numero racional
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(this.numerador) + "/" + df.format(this.denominador);
    }

    //Compara si dos numeros racionales son iguales
    public boolean equals(Racional r2) {
        return (this.numerador == r2.numerador) && (this.denominador == r2.denominador);
    }

    //Compara si el primer numero es menor,mayor o igual al segundo
    public int compareTo(Racional r2) {
        if(this.toDecimal() > r2.toDecimal()) return 1;
        if(this.toDecimal() < r2.toDecimal()) return -1;
        return 0; //son iguales       
    }

    public void simplificar() {
        double n1 = this.numerador;
        double n2 = this.denominador;
        double resto = 1;
        while (resto != 0) {
            resto = n1 % n2;
            n1 = n2;
            if (resto != 0) {
                n2 = resto;
            }
        }
        //n2 contiene el MCD
        this.numerador = (int) (this.numerador / n2);
        this.denominador = (int) (this.denominador / n2);
    }
}
