/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author cabdelda
 */
public class Tema7 {
    public static void mostrarAlturas(int[] array) {
         for (int i = 0; i < array.length; i++){
          int altura = array[i];
          System.out.println(altura);
    }
    }
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        //creamos un array para almacenar alturas de 25 pax
        
        int[] alturas = new int[25];
        
        //mostramos el contenido inicial del array
        
      mostrarAlturas(alturas);
      
      //rellenamos el array con alturas aleaorias 
      //entre 100 y 200cm
      Random r = new Random();
      for  (int i = 0; i < alturas.length; i++){
          alturas[i]=r.nextInt(100,201);
          
          
      }
         mostrarAlturas(alturas);
         
        //creacion e inicializacion directa de un array 
        String[] calificaciones = {"IN","S","B","NT","SB"};
            System.out.println(calificaciones.length);
            
        Arrays.fill(alturas,10,15,-1);
            System.out.println(Arrays.toString(alturas));
      }
    }
    
    

