/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author cabdelda
 */
public class ArrayListEjemplo {
    
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList();
        
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        
        
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        
        System.out.println(lista.size());
        System.out.println(lista);
        
        lista.add(0,"cero");
        System.out.println(lista);
        
        String old = lista.set(1, "primero");
        System.out.println("Has sustituido " + old);
        System.out.println(lista);
        
        System.out.println("Ultimo elemento de la lista: " + lista.get(lista.size()-1));
        
        System.out.println("Esta la cadena 'tres'?" + lista.contains("tres"));
        System.out.println("Esta la cadena 'uno'?" + lista.indexOf("uno"));
        
        System.out.println("Contenido del arraylist despues de borrar ");
        String deleted;
        if((deleted=lista.remove(0))!=null){
            System.out.println("Elemento borrado" + deleted );
        }
        else{
            System.out.println("No se encontro el elemento a borrar");
        }
        
        System.out.println(lista);
        
        for(String cadena:lista){
            System.out.println(cadena.toUpperCase());
        }
        
        Collections.sort(lista,Collections.reverseOrder());
        int posicion=Collections.binarySearch(lista, "nuevo");
        System.out.println("Resultado busqueda: "+posicion);
    }
}
