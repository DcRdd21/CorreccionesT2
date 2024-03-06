/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.empleados;

/**
 *
 * @author fuehered
 */
public class EmpHoras extends Empleados {

    private double precioH = 10;
    private double numH;

    public EmpHoras(double numH, String nombre, String dni) {
        super(nombre, dni);
        this.numH = numH;
        getPrecioH();
    }

    public double getPrecioH() {
        return precioH;
    }

    public double getNumH() {
        return numH;
    }

    public void setNumH(double numH) {
        this.numH = numH;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipo: EmpHoras" + ", precioH=" + precioH + ", numH=" + numH;
    }

    @Override
    public double sueldo() {
        return this.numH * this.precioH;
    }

}
