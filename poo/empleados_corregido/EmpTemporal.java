/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados_Eduardo;

import java.time.LocalDate;

/**
 *
 * @author fuehered
 */
public class EmpTemporal extends Empleado {

    private LocalDate alta;
    private LocalDate baja;
    private double salarioFijo=1000;

    public EmpTemporal(String nombre, String dni, LocalDate alta, LocalDate baja) {
        super(nombre, dni);
        this.alta = alta;
        this.baja = baja;
    }

    public LocalDate getAlta() {
        return alta;
    }

    public LocalDate getBaja() {
        return baja;
    }

    public void setAlta(LocalDate alta) {
        this.alta = alta;
    }

    public void setBaja(LocalDate baja) {
        this.baja = baja;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipo: EmpTemporal" + ", alta=" + alta + ", baja=" + baja;
    }

    @Override
    public double sueldo() {
        return this.salarioFijo;
    }

}
