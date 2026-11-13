/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriastringcondicionals;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaStringCondicionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Tipos primitivos es mostren amb blau*/
        int num;
        double n1;
        boolean cierto;
        char letra;
        /* aixo es un objecte de la llibreria java , tipus Scanner
        i no es mostra amb blau
        */
        Scanner teclado = new Scanner(System.in);
        String frase, nom;
        int edat;
        frase = " hola que tal? Com et dius?";
        
        System.out.println(frase);
        nom = teclado.nextLine();
        System.out.println("Et dius" + nom);
        System.out.print("Quina edat tens? ");
        edat = teclado.nextInt();
        if(edat>=18)
            {
                System.out.println(nom + " puedes entrar al bingo. ");
            }
        else
            {
                System.out.println(nom + " NO PUEDES ENTRAR!!");
            }
        System.out.println("Fin identificacion Bingo");
    }
    
}
