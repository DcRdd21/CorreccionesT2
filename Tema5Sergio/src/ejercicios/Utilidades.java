/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author matmense
 * 
 * 1. Escribe un método llamado toFahrenheit que convierta una temperatura dada en grados
Celsius a grados Fahrenheit. La fórmula de conversión es:
F = 9 / 5 C + 3
2. Escribe un método que devuelva el divisor más grande de un entero dado (distinto del
propio entero).
3. Escribe un método llamado par que dado un número entero devuelva un booleano con
valor true si dicho número es par y false en caso contrario.
 * 
 */
public class Utilidades {
    
    public double toFahrenheit (double grados){
        double F = 9 / 5 * grados + 32;
        
        return F;
    }
    
    public int mayorDivisor (int numero){
        for (int i = numero-1; i>0; i--) {
            if (numero%i==0) {
                return i;
            }
        }
        return 1;
    }
    
    public boolean par (int numero){
        boolean esPar;
        if (numero%2==0) {
            esPar=true;
        }else{
            esPar=false;
        }
        return esPar;
    }
    
}
