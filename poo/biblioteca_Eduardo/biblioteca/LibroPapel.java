/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.biblioteca;

/**
 *
 * @author fuehered
 */
public class LibroPapel extends Documento{
    
    public LibroPapel(String titulo, String autor, String editorial, int anioLanzado) {
        super(titulo, autor, editorial, anioLanzado);
    }

    @Override
    public String toString() {
        return "Libro:" + super.toString();
    }

}
