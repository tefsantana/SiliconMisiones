/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefanía Santana
 */
public class Ejercicio1 {
    /** Realizar un programa que muestre en pantalla los números del 1 al 35
     * (uno abajo del otro). Utilizar alguna estructura repetitiva*/
    public static void main(String[] args) {
        int numero = 1;
        while (numero <= 35) {
            System.out.println(numero);
            numero = numero + 1;
        }
    }
}
