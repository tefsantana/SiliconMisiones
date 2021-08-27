
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
public class Ejercicio5 {
    public static void main(String[] args) {
        /* Realizar un programa que muestre en pantalla palabras que sean
        ingresadas por teclado hasta que se ingrese la palabra "salir".
        */
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Escriba palabras: ");  
        while (true) {  
            palabra = sc.nextLine();
            if (!"salir".equals(palabra)) {
            } else {
                break;
            }
        }
    }
}
