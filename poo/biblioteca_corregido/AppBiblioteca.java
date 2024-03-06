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
public class AppBiblioteca {
    
    public static void main(String[] args) {
        
        LibroPapel lPapel=new LibroPapel(99,"libro 1", "Pepe", "SBN", 2008);
        Consulta c1=new Consulta(lPapel, LocalDate.now(), new Alumno("1234567P"));
        consulta(c1);
        System.out.println("");
        
        LibroDigital lDigi=new LibroDigital(123,"Libro 2", "Juan", "SM", 2015, "SADHGF65ASF4");
        Consulta c2=new Consulta(lDigi, LocalDate.now(), new Alumno("1234567P"));
        consulta(c2);
        System.out.println("");
        
        RevistaPapel rPapel=new RevistaPapel(333,"Revista 1", "Maria", "Marca", 13, 34, LocalDate.of(2022, 5, 12));
        Consulta c3=new Consulta(rPapel, LocalDate.now(), new Alumno("1234567P"));
        consulta(c3);
        System.out.println("");
        
        RevistaMicrofilm rMicrofilm=new RevistaMicrofilm(456,"Revista 2", "Matias", "RM", 6, 23, LocalDate.of(2000, 4, 23), 2348);
        Consulta c4=new Consulta(rMicrofilm, LocalDate.now(), new Alumno("1234567P"));
        consulta(c4);
        System.out.println("");
        
        Software software=new Software(12345,"Software 1", "Luis", "Microsoft", 2014, "123763fgd");
        Consulta c5=new Consulta(software, LocalDate.now(), new Alumno("1234567P"));
        consulta(c5);     
    }
    
    public static void consulta(Consulta c){
        System.out.println(c.toString());
        
    }
    
}
