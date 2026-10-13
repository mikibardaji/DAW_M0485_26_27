/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9millesnautiques;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex9MillesNautiques {

    /**
     * 9. Programa que transforma 
     * las milles nàutiques a metres.
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double millasNauticas, metros;
       final int MILLASAMETROS = 1852; //una milla es 1852 metrso
       
        System.out.print("Dime cuantas millas nauticas has recorrido? ");
        millasNauticas = sc.nextDouble();
        metros = millasNauticas*MILLASAMETROS;
        System.out.println("En metros serian " + metros);
         
        
    }
    
}
