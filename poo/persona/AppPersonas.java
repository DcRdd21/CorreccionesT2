/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.poo.persona;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author macarena
 */
public class AppPersonas {
    
    public static void main(String[] args) {
        
        Persona maria=new Persona("71233507T");

        maria.setAltura(170);
        maria.setPeso(60);
        System.out.println(maria.pesoIdeal());
        
//        
//        maria.setFechaNacimiento(LocalDate.of(2000, Month.AUGUST, 15));
//        System.out.println(maria.getFechaNacimiento());
//        
//        System.out.println(maria.toString());
//        
//        Persona pepe=new Persona("");
//        Persona juan=new Persona("hola");
        
        
       
        
    }
    
}
