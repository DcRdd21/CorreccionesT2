/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.biblioteca;

/**
 *
 * @author fuehered
 */
public class Software extends DocDigitales{
    
    public Software(String titulo, String autor, String editorial, int anioLanzado, String licencia) {
        super(titulo, autor, editorial, anioLanzado, licencia);
    }

    @Override
    public String toString() {
        return "Software:" + super.toString();
    }
    
    
}
