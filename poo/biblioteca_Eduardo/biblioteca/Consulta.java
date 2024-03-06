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

    private int numDoc;
    private LocalDate fechaConsulta;
    private String dniAlum;
    private Documento tipoDoc;

    public Consulta(int numDoc, LocalDate fechaConsulta, String dniAlum, Documento tipoDoc) {
        this.numDoc = numDoc;
        this.fechaConsulta = fechaConsulta;
        this.dniAlum = dniAlum;
        this.tipoDoc = tipoDoc;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }

    public String getDniAlum() {
        return dniAlum;
    }

    public Documento getTipoDoc() {
        return tipoDoc;
    }
   

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public void setFechaConsulta(LocalDate fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public void setDniAlum(String dniAlum) {
        this.dniAlum = dniAlum;
    }

    public void setTipoDoc(Documento tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    @Override
    public String toString() {
        return "Consulta:" + "\nnumDoc=" + numDoc + ", fechaConsulta=" + fechaConsulta + ", dniAlum=" + dniAlum + ", tipoDoc=" +  
                tipoDoc.toString();
    }

    

}
