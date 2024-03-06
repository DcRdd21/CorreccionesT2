/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collecciones;

import java.util.Objects;

/**
 *
 * @author cabdelda
 * Orden natural: idPersona
 * Orden total (alternativo): edad 
 */
    public class Persona implements Comparable<Persona>{
    private String idPersona;
    private String nombrePersona;
    private int edad;
    
    public Persona(){
             
    }

    public Persona(String idPersona, String nombrePersona, int edad) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.edad = edad;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return idPersona;
    }

    @Override  
    public int compareTo(Persona o){
        return this.idPersona.compareTo(o.idPersona);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.idPersona, other.idPersona);
    }
    
}
