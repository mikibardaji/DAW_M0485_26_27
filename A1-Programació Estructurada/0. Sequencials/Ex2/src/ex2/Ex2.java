/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.util.Scanner;

/**
 * 2.	Programa que calcula l'àrea d'un quadrat el costat del qual s'introdueix per teclat.
 * @author mabardaji
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double lado,areaCuadrado;
        Scanner teclado = new Scanner(System.in);
        //1.- Mostrar cuanto vale el lado del cuadrado
        System.out.print("Cuanto vale el lado del cuadrado? ");
        
        //2.- Esperar valor lado
        lado = teclado.nextDouble();
        
        //Calcular areaCuadrado
        areaCuadrado = lado * lado;
        
        //Mostrar el area del cuadrado
        System.out.println("La area del cuadrado es " + areaCuadrado);
    }
    
}
