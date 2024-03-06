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
    
    protected int numDoc;
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected int anioLanzado;
    protected boolean consultado; //indica si el documento está siendo consultado o no
    
    
    public Documento(int numDoc,String titulo, String autor, String editorial, int añoLanzado) {
        this.numDoc=numDoc;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioLanzado = añoLanzado;
        this.consultado=false;
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

    public int getAnioLanzado() {
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

    public void setAnioLanzado(int añoLanzado) {
        this.anioLanzado = añoLanzado;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public boolean isConsultado() {
        return consultado;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public void setConsultado(boolean consultado) {
        this.consultado = consultado;
    }

    @Override
    public String toString() {        
        return "Nº doc: " + this.numDoc + "En consulta: " + this.consultado + 
                "Titulo:" + this.titulo + "Autor=" + this.autor + "Editorial=" + this.editorial 
                + "Año publicacion=" + anioLanzado;
    }
    
}
