/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.poo.persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author macarena
 */
public class Persona {

    //atributos
    private final int MAYORIAEDAD = 18;
    private final String LISTA = "TRWAGMYFPDXBNJZSQVHLCKE";
    private String DNI;
    private String nombre;
    private String apellidos;
    private char sexo;                  //H ó M
    private LocalDate fechaNacimiento;
    private int edad;                   //en años
    private int altura;                 //en cm
    private double peso;                //en kg
    private boolean casado;             //si o no

    //constructor/es
    //constructor parametrizado    
    public Persona(String DNI) {
        if (validarDNI(DNI)) {
            this.DNI = DNI;
            this.nombre = "";
            this.apellidos = "";
            this.sexo = 0;
            this.fechaNacimiento = null;
            this.altura = 0;
            this.edad = 0;
            this.peso = 0.0;
            this.casado = false;
        } else {
            System.out.println("Error al crear el objeto. DNI no válido");
        }
    }

    //métodos
    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public String getFechaNacimiento() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return dtf.format(this.fechaNacimiento);
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public boolean isCasado() {
        return casado;
    }

    private boolean validarDNI(String DNI) {
        //validamos el DNI
        //-> 8 numeros y una letra 
        boolean valid = false;
        if (DNI.length() == 9 && Character.isAlphabetic(DNI.charAt(8))) {
            
            if (DNI.charAt(8) == calcularLetra(DNI)) {
                valid = true;
                for (int i = 0; i < 8; i++) {
                    if (!Character.isDigit(DNI.charAt(i))) {
                        valid = false;
                    }
                }
            }else{
                valid=false;
            }            
        }
        return valid;
    }

    private Character calcularLetra(String DNI) {
        return LISTA.charAt(Integer.parseInt(DNI.substring(0, 8)) % 23);
    }

    private void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        //calculo de la edad

    }

    private void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isMayorEdad() {
        return this.edad >= MAYORIAEDAD;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", fechaNacimiento=" + getFechaNacimiento() + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", casado=" + casado + '}';
    }
    
    public double pesoIdeal(){
        double pesoIdeal=0.75 * (this.altura - 150) + 50;
        return this.peso - this.pesoIdeal();
    }

}
