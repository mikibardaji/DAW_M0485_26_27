/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1adivinanumero1a10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1AdivinaNumero1a10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroElegido, numRandom;
        
        numRandom = rand.nextInt(1, 11);
        //System.out.println("aleatorio " + numRandom);
        System.out.print("Que numero crees que sacare? ");
        numeroElegido = sc.nextInt();
        
        if (numRandom == numeroElegido)
        {
            System.out.println("Has acertado");
        }
        else if (numeroElegido > numRandom)
        {
            System.out.println("Te has pasado");
        }
        else
        {
            System.out.println("El numero es mas grande");
        }
        System.out.println("El numero era " + numRandom);
    }
    
}
