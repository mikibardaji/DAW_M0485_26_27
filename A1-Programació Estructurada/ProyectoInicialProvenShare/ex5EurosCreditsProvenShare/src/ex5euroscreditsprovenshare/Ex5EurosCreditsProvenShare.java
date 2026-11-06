/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5euroscreditsprovenshare;

import java.util.Scanner;

/**
 *
 * Dins del moneder de ProvenShare hi ha dues carteres: una amb euros reals i una altra amb crèdits del campus. 
 * L'aplicació permet recarregar el compte intercanviant diners reals per crèdits ficticis, on 1 euro equival exactament a 8 crèdits ProvenShare. 
 * El programa ha de demanar una quantitat de diners en euros reals (amb decimals)
 * i calcular automàticament a quants crèdits equivalen, mostrant el resultat final per consola.
 */
public class Ex5EurosCreditsProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final double EUROSAPROVENSHARE = 8;
        double euro,creditos;
        
        System.out.print("Cuanto dinero tienes? ");
        euro = teclado.nextDouble();
        //System.out.println("Dinero que tengo es: " + euro);
        creditos = euro * EUROSAPROVENSHARE;
        
        System.out.println("En creditos son : " + creditos);   
        
    }
    
}
