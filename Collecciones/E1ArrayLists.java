/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collecciones;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author cabdelda
 */
public class E1ArrayLists {
    
    public static ArrayList<Persona> mayoresEdad(ArrayList<Persona> lista){
        ArrayList<Persona>mayores=new ArrayList<>();
        for(Persona persona:lista){
            if(persona.getEdad()>=18){
                mayores.add(persona);
            }
        }
        return mayores;
    }
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList<>();
        
        listaPersona.add(new Persona("abc111", "Pepe", 5));
        listaPersona.add(new Persona("pqw631", "Martin", 18));
        listaPersona.add(new Persona("cbr341", "Maria", 13));
        listaPersona.add(new Persona("dwr234", "Serafín", 21));
        
        System.out.println(listaPersona);
        
       // Collections.sort(listaPersona, new OrdenporEdad);
        System.out.println(listaPersona);
        
        Collections.sort(listaPersona,null);
        
        //buscar persona por id 
        Collections.sort(listaPersona);
        Persona key = new Persona();
        key.setIdPersona("abc111");
        int pos  = Collections.binarySearch(listaPersona, key);
        if(pos>-1){
            System.out.println("Persona encontrada");
            System.out.println(listaPersona.get(pos));
           
        }else{
            System.out.println("Persona con id inexistente");
        }
        
        System.out.println("BUSQUEDA CON METODO 'CONTAINS'");
        if(listaPersona.contains(key)) System.out.println("Persona encontrada");
        else System.out.println("Persona Inexistente");
        
        //busca todas las personas mayores de edad (busqueda secuencial)
        System.out.println("Personas mayores de edad");
        System.out.println(mayoresEdad(listaPersona));
        
        
        
        
        
        
    }
}
