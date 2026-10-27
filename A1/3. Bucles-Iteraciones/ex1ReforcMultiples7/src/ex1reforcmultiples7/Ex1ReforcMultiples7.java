/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1reforcmultiples7;

import java.util.Scanner;

/**
 * Escriu un programa que mostri per pantalla els 10 múltiples de 7 a partir del numero que indiqui el usuari.
 * @author mabardaji
 */
public class Ex1ReforcMultiples7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor, contMultiple7=0;
        System.out.print("Introduce un valor y mostrare los 10 numeros siguientes multiples de 7: ");
        valor = scan.nextInt();
        while (contMultiple7<10)
            {
                //detectar si es multiple de 7
                if (valor%7==0)
                {
                    contMultiple7++;
                    System.out.println(valor + " es multiple de 7, llevas " + contMultiple7); 
                }
                valor++;
            }
        System.out.println("Fin de programa");
    }
    
}
