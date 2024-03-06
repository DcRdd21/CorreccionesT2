/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Television;

/**
 *
 * @author fraferal
 */
public class Television {
   
    //atributos
    private String id;
    private int canales;
    private int canalActual;
    private int volumenActual;
    private double pulgadas;
    private boolean encendido = false;
    private boolean mute;

    //default
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCanales() {
        return canales;
    }

    public void setCanales(int canales) {
        this.canales = canales;
    }

    public int getCanalActual() {
        return canalActual;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isEncencido() {
        return encendido;
    }

    public void setEncencido(boolean encencido) {
        this.encendido = encencido;
    }

    public boolean isMute() {
        return mute;
    }

    public void setMute(boolean mute) {
        this.mute = mute;
    }

    //
    public Television(String id, int pulgadas, int canales) {
        this.id = id;
        this.pulgadas = pulgadas;
        this.canales = canales;
        canalActual = 1;
        volumenActual = 15;
        encendido = false;
        mute = false;
    }

    public void subirVolumen() {
        if (volumenActual < 30) {
            volumenActual = volumenActual + 1;
            if(mute){
                mute = false;
            }
        }
    }

    public void bajarVolumen() {
        if (volumenActual > 0){
            volumenActual = volumenActual - 1;
        }else{ 
            mute = true;
        }
    }

    public void subirCanal() {
        canalActual = canalActual + 1;
        if (canalActual > canales) {
            canalActual = 1;
        }
    }

    public void restarCanal() {
        canalActual = canalActual - 1;
        if (canalActual < 1) {
            canalActual = canales;
        }
    }
    
    public void cambiarCanal(int canal){
        if (canal < canales && canal > 0){
            canalActual = canal;
        }
    }

    public void encender() {
        encendido = true;
    }
    
    public void apagar(){
        encendido = false;
    }
    
    @Override
    public String toString(){
        return "-----------------------" + 
                "\n Marca: " + id +
                "\n encendida:" + encendido +
                "\n pulgadas:" + pulgadas +
                "\n canal actual:" + canalActual +
                "\n nº canales:" + canales +
                "\n volumen:" + volumenActual;
    }
    
    
}