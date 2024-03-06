/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.biblioteca;

import java.time.LocalDate;

/**
 *
 * @author fuehered
 */
public class RevistaMicrofilm extends RevistaPapel {

    private int codMicrofilm;

    public RevistaMicrofilm(int numDoc, String titulo, String autor, String editorial, int volumen, int numero, LocalDate lanzamiento,
            int codMicrofilm) {
        super(numDoc, titulo, autor, editorial, volumen, numero, lanzamiento);
        this.codMicrofilm = codMicrofilm;
    }

    @Override
    public String toString() {
        return super.toString() + ", codMicrofilm=" + codMicrofilm;
    }

}
