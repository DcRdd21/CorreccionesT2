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
public class App {
    public static void main(String[] args) {
        
        Ascensor a=new Ascensor(6,300);
        
        a.abrirCerrar(true);
        
        System.out.println(a.getPuertas());
        
        Persona paco=new Persona("00000123P");
        paco.setPeso(101);
        
        a.entrarSalir(paco, true);
        a.entrarSalir(paco, true);
        
        System.out.println(a.getOcupacion());
        
        a.moverAscensor(4);
        
        a.moverAscensor(1);
        
    }
}
