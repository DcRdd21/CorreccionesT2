/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.empleados;

import java.time.LocalDate;

/**
 *
 * @author fuehered
 */
public class AppEmpleados {

    public static void main(String[] args) {

        EmpTemporal emp1 = new EmpTemporal(LocalDate.of(2023, 12, 20), LocalDate.of(2024, 2, 5), "Pepe", "1234567T");
        System.out.println(emp1);
        Sueldo(emp1);
        System.out.println("");
        
        EmpHoras emp2=new EmpHoras(68, "Martin", "4536985K");
        System.out.println(emp2);
        Sueldo(emp2);
        System.out.println("");
        
        EmpFijo emp3=new EmpFijo(LocalDate.of(2020, 6, 25), "Jaime", "9876325L");
        System.out.println(emp3);
        Sueldo(emp3);
    }

    public static void Sueldo(Empleados e){
            System.out.println("Sueldo empleado: " + e.sueldo());
    }
    
}
