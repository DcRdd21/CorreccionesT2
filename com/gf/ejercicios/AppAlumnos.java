/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios;

import java.util.Arrays;

/**
 *
 * @author cabdelda
 */
public class AppAlumnos {

    public static void alumnosAprobados(Alumno[] clase) {

        System.out.println("");

        for (Alumno alumno : clase) {
            if (alumno != null && alumno.getNota() >= 5) {
                System.out.println(alumno);

            }
        }
    }

    public static void aumentarTamanio_manual(Alumno[] clase, int nuevoTam) {

    }

    public static void aumentarTamanio_metodo(Alumno[] clase, int nuevoTam) {

    }

    public static void cambiarTamanio_manual(Alumno[] clase, int nuevoTam) {
        Alumno[] aux = new Alumno[nuevoTam];
        int i = 0;
        for (Alumno alumno : clase) {
            aux[i] = alumno;
            i++;
        }

    }

    public static void cambiarTamanio_metodo(Alumno[] clase, int nuevoTam) {
        Arrays.copyOf(clase, nuevoTam);
    }

    public static int buscarAlumno(Alumno[] clase, String nombre) {
        int i = 0;
        for (Alumno alumno : clase) {

        }
        return 2;
    }

    public static void main(String[] args) {

        Alumno[] clase = new Alumno[30];
        System.out.println(Arrays.toString(clase));

        clase[0] = new Alumno("alumno 1 ", 5.5, "A");
        clase[1] = new Alumno("alumno 2 ", 8.75, "NT");
        clase[2] = new Alumno("alumno 3 ", 2.0, "I");
        clase[3] = new Alumno("alumno 4 ", 6.3, "B");
        clase[4] = new Alumno("alumno 5 ", 4.1, "I");
        System.out.println(Arrays.toString(clase));

        //Mostrar los alumnos aprobados
        alumnosAprobados(clase);
        //Aumentar el tamaño de la clase a 30 alumnos
        //clase=cambiarTamanio_manual(clase, 30);
        //clase=cambiarTamanio_metodo(clase, 30);

        System.out.println(Arrays.toString(clase));
    }
/*
    Alumno key = new Alumno();

    key.setNombre (
    "alumno");
    int posicion = Arrays.binarySearch(clase, key);
    if(posicion > -1){
            System.out.println(clase[posicion]);

    }

    
        else{
            System.out.println("Alumno inexistente");
    }*/
}
