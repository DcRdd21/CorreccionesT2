/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.biblioteca;

/**
 *
 * @author fuehered
 */
public abstract class DocDigitales extends Documento {

    protected String licencia;

    public DocDigitales(String titulo, String autor, String editorial, int anioLanzado, String licencia) {
        super(titulo, autor, editorial, anioLanzado);
        this.licencia = licencia;
    }

}
