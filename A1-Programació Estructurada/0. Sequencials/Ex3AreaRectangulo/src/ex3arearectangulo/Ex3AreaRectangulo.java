/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3arearectangulo;

import java.util.Scanner;

/**
 * 3.	Programa que calcula l'àrea d'un rectangle, dades d’entrada s'introdueixen per teclat.
 * @author mabardaji
 */
public class Ex3AreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, altura, areaRectangulo;
        Scanner lector = new Scanner(System.in);
        // TODO code application logic here
        // Mostrar cual es la base
        System.out.print("Cual es la base del rectangulo? ");
        // esperar base
        base = lector.nextDouble();
        //Mostra  cual es la altura
        System.out.print("Cual es la altura del rectangulo? ");
        //espera altura
        altura = lector.nextDouble();
        //Calcular area = base * altura
        areaRectangulo = base * altura;
        //Mostrar final
        System.out.println("La area del rectangulo es " + areaRectangulo);
        
    }
    
}
