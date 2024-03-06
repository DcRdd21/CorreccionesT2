/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.biblioteca;

import java.time.LocalDate;

/**
 *
 * @author fuehered
 */
public class Consulta {  
    
    private LocalDate fechaConsulta;
    private Alumno alumno;
    private Documento documento;

    public Consulta(Documento documento, LocalDate fechaConsulta, Alumno alumno) {
        this.documento=documento;
        this.documento.setConsultado(true);
        this.fechaConsulta = fechaConsulta;
        this.alumno=alumno;     
    }  

    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }
   
    public void setFechaConsulta(LocalDate fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Consulta:" + "\nNº doc:" + this.documento.getNumDoc() + "Fecha consulta=" + fechaConsulta 
                + "Dni alumno=" + this.alumno.getDni();
    }

    

}
