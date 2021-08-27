
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefanía Santana
 */
public class Ejercicio2 {
    /**Realizar un programa que dado por teclado un límite numérico
     * (por ejemplo 100) muestre en pantalla todos los números hasta ese
     * límite (empezando por 1).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el límite numérico: ");
        int limite = sc.nextInt();
        int i;
        for (i = 1; i <= limite; i++) {
            System.out.println(i);
        }
    }
}
