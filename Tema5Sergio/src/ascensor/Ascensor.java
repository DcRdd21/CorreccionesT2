/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ascensor;

import persona.Persona;

/**
 *
 * @author smatu
 */

public class Ascensor {
    
    //Propiedades
    private int Piso; //piso en el que se encuentra el ascensor en un momento determinado.
    private int Pisos; //nº de pisos máximo del ascensor.
    private boolean Puertas; //determina si las puertas del ascensor están abiertas o cerradas.
    private boolean Alarma; //determina si la alarma del ascensor está activada o no.
    private double Capacidad; //capacidad máxima del ascensor en kg.
    private double Ocupacion; //ocupación actual del ascensor en kg.

    //Constructor
    public Ascensor(int Pisos, double Capacidad) {
        this.Pisos = Pisos;
        this.Capacidad = Capacidad;
    }
    
    //Metodos

    public int getPiso() {
        return Piso;
    }

    public void setPiso(int Piso) {
        this.Piso = Piso;
    }

    public int getPisos() {
        return Pisos;
    }

    public void setPisos(int Pisos) {
        this.Pisos = Pisos;
    }

    public boolean getPuertas() {
        return Puertas;
    }

    public void setPuertas(boolean Puertas) {
        this.Puertas = Puertas;
    }

    public boolean isAlarma() {
        return Alarma;
    }

    public void setAlarma(boolean Alarma) {
        this.Alarma = Alarma;
    }

    public double getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(double Capacidad) {
        this.Capacidad = Capacidad;
    }

    public double getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(double Ocupacion) {
        this.Ocupacion = Ocupacion;
    }
    
    //Metodo para abrir y cerrar las puetas del ascensor.
    //Ya que es un int por definición, supongo que 1 es abrir y 0 cerrar.
    public void abrirCerrar(boolean abrir){
        if (abrir || !abrir) {
            this.setPuertas(true);
            System.out.println("las puertas estan " + (abrir ? "abiertas" : "cerradas"));
        }
    }
    
    public void entrarSalir(Persona persona, boolean accion){
        //recibe como parametro accion, con valores true=ENTRAR false=SALIR
        if (this.getPuertas()) {
            double ocupacionActual = this.getOcupacion();
            //si la persona va a entrar
            if (accion){
                //si todavia no ha alcanzado la capacidad maxima
                if (ocupacionActual < this.getCapacidad()){
                    //sumo peso de persona a peso total
                    ocupacionActual = ocupacionActual + persona.getPeso();
                    //si tras sumarla sobrepasa el maximo, activo alarma
                    if (ocupacionActual>this.getCapacidad()) {
                        this.activarAlarma();
                    }
                }
            //si la persona va a salir
            }else{
                //resto perso de persona a peso total
                ocupacionActual = ocupacionActual - persona.getPeso();
            }
            this.setOcupacion(ocupacionActual);
        }
    }
    
    //Si se cumple todo se mueve, si no, no.
    public void moverAscensor(int pisoDestino) {
        if (pisoDestino>=0 && pisoDestino<=this.getPisos() && pisoDestino!=this.getPiso() && !this.isAlarma()) {
            this.abrirCerrar(false);
            if (this.getPiso()>pisoDestino) {
                int pisoActual = this.getPiso();
                for (int i = pisoActual; i >= pisoDestino; i--) {
                    System.out.println(i);
//                    Thread.sleep(1000);
                    this.setPiso(i);
                }
            }else{
                int pisoActual = this.getPiso();
                for (int i = pisoActual; i <= pisoDestino; i++) {
                    System.out.println(i);
//                    Thread.sleep(1000);
                    this.setPiso(i);
                }
            }
            this.abrirCerrar(true);
        }
    }
    
    public void activarAlarma(){
        this.setAlarma(true);
    }
    
}
