/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.poo.racional;

/**
 *
 * @author rodduraa
 */
public class AppRacional {
    public static void main(String[] args) {
        Racional r1 = new Racional(1,2);
        System.out.println(r1.toDecimal());
        Racional r2 = new Racional(3,4);
        System.out.println(r2.toDecimal());
        Racional resultado = r1.sumar(r2);
        System.out.println("Suma: "+resultado.toString());
        resultado = r1.restar(r2);
        System.out.println("Resta: "+resultado.toString());
        resultado = r1.producto(r2);
        System.out.println("Producto: "+resultado.toString());
        resultado = r1.dividir(r2);
        System.out.println("Division: "+resultado.toString());
        
        Racional r3=new Racional(10, 5);
        r3.simplificar();
        System.out.println(r3);
        
    }
}
