/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios;

import java.util.Scanner;

/**
 *
 * @author cabdelda
 */
public class Personas {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String[] personas = new String[20];
         for (int i = 0; i < personas.length; i++){
            personas [i] = sc.next();
            System.out.println("Persona: "+personas);
        }
         imprimePersona(personas);
         par(personas);
    }
    public static void imprimePersona(String[] s) {
        for (int i = 0; i < s.length; i++){
            System.out.println("Persona: " + i + " " +s[i]);
        }
    }
    public static void par(String[] par) {    
        for (int i = 0; i < par.length; i++){            
            System.out.println("Persona: "+par[i]);
        }
        
    }
    }

