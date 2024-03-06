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
        
        LibroPapel lPapel=new LibroPapel("libro 1", "Pepe", "SBN", 2008);
        Consulta c1=new Consulta(12, LocalDate.now(), "1234567P", lPapel);
        Consulta(c1);
        System.out.println("");
        
        LibroDigital lDigi=new LibroDigital("Libro 2", "Juan", "SM", 2015, "SADHGF65ASF4");
        Consulta c2=new Consulta(23, LocalDate.now(), "2345876J", lDigi);
        Consulta(c2);
        System.out.println("");
        
        RevistaPapel rPapel=new RevistaPapel("Revista 1", "Maria", "Marca", 13, 34, LocalDate.of(2022, 5, 12));
        Consulta c3=new Consulta(9, LocalDate.now(), "9745564L", rPapel);
        Consulta(c3);
        System.out.println("");
        
        RevistaMicrofilm rMicrofilm=new RevistaMicrofilm("Revista 2", "Matias", "RM", 6, 23, LocalDate.of(2000, 4, 23), 2348);
        Consulta c4=new Consulta(42, LocalDate.now(), "8236415R", rMicrofilm);
        Consulta(c4);
        System.out.println("");
        
        Software software=new Software("Software 1", "Luis", "Microsoft", 2014, "123763fgd");
        Consulta c5=new Consulta(5, LocalDate.now(), "7259135G", software);
        Consulta(c5);
        
        
        
    }
    
    public static void Consulta(Consulta c){
        System.out.println(c.toString());
        
    }
    
}
