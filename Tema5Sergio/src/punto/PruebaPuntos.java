/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.poo.puntos;

/**
 *
 * @author macarena
 */
public class PruebaPuntos {

    public static void main(String[] args) {

        Punto p1 = new Punto(10, 20);
        System.out.println(p1);

        Punto p2 = new Punto(-5, 50);
        System.out.println(p2);

        System.out.println("Movemos el punto...");
        System.out.println("\tOriginalmente: " + p1);
        p1.mover(0, 0);
        System.out.println("\tDespués del movimiento: " + p1);

        System.out.println("Desplazamos el punto...");
        System.out.println("\tOriginalmente: " + p1);
        p1.desplazar(-1, 1);
        System.out.println("\tDespués del movimiento: " + p1);

        System.out.println("Calculamos la distancia entre los puntos...");
        System.out.println("\t" + p1);
        System.out.println("\t" + p2);

        System.out.println("\tDistancia: " + p1.distancia(p2));
        System.out.println("\tDistancia: " + Punto.distancia(p1, p2));

        System.out.println("Movemos los puntos al centro de la pantalla...");
        p1.alCentro();
        p2.alCentro();
        System.out.println("\t" + p1);
        System.out.println("\t" + p2);
        
        //comparamos los puntos        
        p1.setX(0);
        p1.setY(0);
        
        p2.setX(0);
        p2.setY(0);
        
        System.out.println(p1.equals(p2));

    }

}
