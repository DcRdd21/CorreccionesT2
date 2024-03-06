/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Television;

/**
 *
 * @author fraferal
 */
public class AppTelevision {
    
    public static void main(String[] args) {

        Television t1 = new Television("SONY", 12, 50);

        System.out.println(t1.toString());

        t1.encender();

        for (int i = 0; i < 20; i++) {
            t1.subirCanal();
        }

        System.out.println(t1.toString());

        t1.cambiarCanal(2);
        for (int i = 0; i < 5; i++) {
            t1.subirVolumen();
        }

        System.out.println(t1.toString());

        System.out.println(t1.toString());

        t1.apagar();

        System.out.println(t1.toString());

    }

}
