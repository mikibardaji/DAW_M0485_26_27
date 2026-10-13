/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5descuento;

import java.util.Scanner;

/**
 * Al catàleg, el preu original en crèdits d'un producte es redueix automàticament segons el seu estat de conservació. Demana el preu original (un decimal double) i l'estat ("Nou", "Bo", "Acceptable").
Si és "Nou", el preu es manté igual (0% de descompte).
Si és "Bo", s'aplica un 20% de descompte.
Si és "Acceptable", s'aplica un 50% de descompte.
Mostra el preu final calculat per pantalla.

 * @author mabardaji
 */
public class Ex5Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Variables
        double preuOriginal, preuFinal,descompte = 0;
        String estat;
        boolean estadoCorrecto=true;
        // MOSTRAR
        System.out.print("Introdueix el preu original: ");

        // ESPERAR
        preuOriginal = sc.nextDouble();
        

        // MOSTRAR
        System.out.print("Introdueix l'estat (Nou / Bo / Acceptable): ");

        // ESPERAR
        sc.nextLine(); //netejar el enter porque el siguiente scanner es uno que recoge String
        estat = sc.nextLine(); //.trim() limpia espacios por delante y por detras

        // CALCULAR
        if (estat.equalsIgnoreCase("Nou")) {
            descompte = 0;
        } else if (estat.equalsIgnoreCase("Bo")) {
            descompte = 0.20;
        } else if (estat.equalsIgnoreCase("Acceptable")) {
            descompte = 0.50;
        } else {
            System.out.println("Estat no valid.");
            estadoCorrecto = false;
        }

        if (estadoCorrecto==true)
        {
            preuFinal = preuOriginal - (preuOriginal * descompte);
            // MOSTRAR
            System.out.println("Preu final: " + preuFinal + " credits");
        }
        
    }
    
}
