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
public class AppEmpleados {

    public static void main(String[] args) {

        EmpTemporal emp1 = new EmpTemporal("Pepe", "1234567T",
                LocalDate.of(2023, 12, 20), LocalDate.of(2024, 2, 5));
        System.out.println(emp1);
        sueldo(emp1);
        System.out.println("");
        
        EmpHoras emp2=new EmpHoras( "Martin", "4536985K",68);
        System.out.println(emp2);
        sueldo(emp2);
        System.out.println("");
        
        EmpFijo emp3=new EmpFijo( "Jaime", "9876325L",LocalDate.of(2020, 6, 25));
        emp3.setSalarioBase(1000);
        System.out.println(emp3);
        sueldo(emp3);
    }

    public static void sueldo(Empleado e){
        System.out.println("Sueldo empleado: " + e.sueldo());
    }
    
}
