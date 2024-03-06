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
public class RevistaPapel extends Documento{
    
    protected int volumen;
    protected int numero;
    protected String mesSalida;

    public RevistaPapel(String titulo, String autor, String editorial, int volumen, int numero, LocalDate lanzamiento) {
        super(titulo, autor, editorial, lanzamiento.getYear());
        this.volumen = volumen;
        this.numero = numero;
        this.mesSalida = String.valueOf(lanzamiento.getMonth());
    }

    public int getVolumen() {
        return volumen;
    }

    public int getNumero() {
        return numero;
    }

    public String getMesSalida() {
        return mesSalida;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMesSalida(String mesSalida) {
        this.mesSalida = mesSalida;
    }

    @Override
    public String toString() {
        return super.toString() + ", volumen=" + volumen + ", numero=" + numero + ", mes Salida=" + mesSalida;
    }

    
    
}
