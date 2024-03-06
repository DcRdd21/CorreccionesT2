/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.biblioteca;

/**
 *
 * @author fuehered
 */
public abstract class Documento {
    
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected int anioLanzado;
    
    public Documento(String titulo, String autor, String editorial, int añoLanzado) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioLanzado = añoLanzado;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAñoLanzado() {
        return anioLanzado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAñoLanzado(int añoLanzado) {
        this.anioLanzado = añoLanzado;
    }

    @Override
    public String toString() {
        return "\ntitulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", año publicacion=" + anioLanzado;
    }
    
}
