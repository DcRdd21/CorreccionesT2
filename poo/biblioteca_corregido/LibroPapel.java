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
    
    public LibroPapel(int numDoc,String titulo, String autor, String editorial, int añoLanzado) {
        super(numDoc, titulo,  autor,  editorial,  añoLanzado);       
    }

    @Override
    public String toString() {
        return "Libro:" + super.toString();
    }

}
