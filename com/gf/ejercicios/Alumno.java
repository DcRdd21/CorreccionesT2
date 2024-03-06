/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios;

/**
 *
 * @author cabdelda
 */
public class Alumno {
    private String nombre;
    private double nota;
    private String calificación;

    public Alumno(String nombre, double nota, String calificación) {
        this.nombre = nombre;
        this.nota = nota;
        this.calificación = calificación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCalificación() {
        return calificación;
    }

    public void setCalificación(String calificación) {
        this.calificación = calificación;
    }

    @Override
    public String toString() {
        return "Alumno: " + "\t\nnombre=" + nombre + ", nota=" + nota + ", calificaci\u00f3n=" + calificación ;
    }
    
}
