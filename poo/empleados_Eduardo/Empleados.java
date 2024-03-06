/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.empleados;

/**
 *
 * @author fuehered
 */
public abstract class Empleados {
    
    protected String nombre;
    protected String dni;

    public Empleados(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public abstract double sueldo();
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Empleado:" + " nombre= " + nombre + ", dni= " + dni + ", sueldo= " + sueldo();
    }
    
}
