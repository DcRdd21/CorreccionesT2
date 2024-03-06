/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.empleados;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author fuehered
 */
public class EmpFijo extends Empleados {

    private LocalDate alta;
    private double comp = 20.5;

    public EmpFijo(LocalDate alta, String nombre, String dni) {
        super(nombre, dni);
        this.alta = alta;
    }

    public LocalDate getAlta() {
        return alta;
    }

    public void setAlta(LocalDate alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipo: EmpFijo" + ", alta=" + alta;
    }

    @Override
    public double sueldo() {
        return 1100.5 + (comp * (LocalDate.now().getYear()-alta.getYear()));
    }

}
