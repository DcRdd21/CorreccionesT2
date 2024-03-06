/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author matmense
 */
public class mcd {
    
    public static int mcd(int num1 , int num2){
        
        int resto = 0;
        int resultado = 0;
        
        if (num1 < num2) {
                //si el segundo numero es mayor que el primero
                resto = num1;
                num1 = num2;
                num2 = resto;
            }

            boolean continuar = true;

            while (continuar == true) {
                resto = num1 % num2;
                if (resto == 0) {
                    resultado = num2;
                    continuar = false;
                }
                num1 = num2;
                num2 = resto;
            }
            
            return resultado; //contiene el MCD
            
    }
            
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero positivo: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero positivo: ");
        int num2 = sc.nextInt();

        boolean resolver = true;
        int v_mcd = 0;
        
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Error, los numeros deben de ser positivos.");
            System.out.println("Intentalo de nuevo.");
            resolver = false;
        } else {
            v_mcd = mcd(num1 , num2);
        }

        if (resolver == true) {
            System.out.println("MCD = " + v_mcd);
        }

    }
}
