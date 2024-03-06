/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ahorcado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cabdelda
 */
public class Ahorcado {
    static Scanner sc = new Scanner(System.in);
    static String [] palabras = {"MARIPOSA", "COCODRILO", "ELEFANTE", "GATO", "PERRO", "ARBOL", "CIUDAD", "ARDILLA", "AVESTRUZ"};//palabras posibles
    static String palabrasecreta;
    static String palabratransformada;
    static int fallos = 0; //contar errores
    static boolean acierto = false; //saber si se acierta

    public static void main(String[] args) {
    do {
    PalabraElegida();
    LetrasIntroducidas();
     }while(fallos<=8 && acierto==false);//concicion para seguir jugando
    }

        
public static void PalabraElegida(){//sacamos la palabra elegida de manera aleatoria
    Random rn= new Random();
    palabrasecreta = palabras[rn.nextInt()];
    palabratransformada = palabrasecreta.replace("", "_");//la transformamos a guiones bajos
    System.out.println(palabratransformada);

}

 public static void LetrasIntroducidas(){
        while (fallos < 8 && acierto==false) {
            System.out.println("Introduce una letra:");
            String letra = sc.next().toUpperCase();
            String nuevaPalabraTransformada = "";
            for (int i = 0; i < palabrasecreta.length(); i++) {
                if (palabrasecreta.charAt(i) == letra.charAt(0)) {
                    nuevaPalabraTransformada += letra.charAt(0);
                } else if (palabratransformada.charAt(i) != '_') {
                    nuevaPalabraTransformada += palabrasecreta.charAt(i);
                } else {
                    nuevaPalabraTransformada += "_";
                }//intento de crear la palabra añadiendo letras 
            }
     if (palabratransformada != palabrasecreta) {//sumamos el error
                fallos++;
                System.out.println("¡Fallaste! Llevas " + fallos + " fallos.");
            }
            else  {//en caso de acertar
                System.out.println("¡Correcto! Has ganado. La palabra era " + palabrasecreta);
                acierto = true;
            }
        }
        if (fallos == 8) {//llegar al limite de errores
            System.out.println("Has perdido. La palabra era " + palabrasecreta);
        }
    }
}

