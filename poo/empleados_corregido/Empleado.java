/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados_Eduardo;

/**
 *
 * @author fuehered
 */
public abstract class Empleado {
    
    protected String nombre;
    protected String dni;

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public abstract double sueldo();

    @Override
    public String toString() {
        return "Empleado:" + " nombre= " + nombre + ", dni= " + dni + ", sueldo= " + sueldo();
    }
    
}
