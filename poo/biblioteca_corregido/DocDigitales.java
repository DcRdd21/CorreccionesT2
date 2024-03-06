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

    public DocDigitales(int numDoc,String titulo, String autor, String editorial, int añoLanzado,
                String licencia) {
        super(numDoc, titulo,  autor,  editorial,  añoLanzado);
        this.licencia = licencia;
    }

}
