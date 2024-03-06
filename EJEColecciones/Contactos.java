/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJEColecciones;

import java.util.Objects;

/**
 *
 * @author cabdelda
 */
public class Contactos implements Comparable<Contactos> {
    private String id;
    private String nombre;
    private int num;
  
    
    public Contactos(){
        
    }

    public Contactos(String id, String nombre, int num) {
        this.id = id;
        this.nombre = nombre;
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

  @Override  
    public int compareTo(Contactos o){
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id; 
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
        final Contactos other = (Contactos) obj;
        return Objects.equals(this.id, other.id);
    }


    
}
