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
public class EmpFijo extends Empleado {

    private LocalDate alta;
    private double comp = 20.5;
    private double salarioBase;

    public EmpFijo(String nombre, String dni, LocalDate alta) {
        super(nombre, dni);
        this.alta = alta;
    }

    public LocalDate getAlta() {
        return alta;
    }

    public void setAlta(LocalDate alta) {
        this.alta = alta;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", tipo: EmpFijo" + ", alta=" + alta;
    }

    @Override
    public double sueldo() {
        return this.salarioBase + (comp * (LocalDate.now().getYear()-alta.getYear()));
    }

}
