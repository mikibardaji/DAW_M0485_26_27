/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex1CondicionalsEstatProducte;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1CondicionalsEstatProducte {

    /**
     * Exercici 1: Validació de l'estat del material
Quan un estudiant penja un producte físic, hem de comprovar el seu estat de conservació. 
* Crea un programa en Java que demani per teclat l'estat d'un producte 
* ("Nou", "Com nou", "Bo" o "Acceptable").
Si l'estat és "Nou" o "Com nou", mostra el missatge: 
* "Producte excel·lent. Es publicarà ràpidament."
Si no, mostra: "Producte acceptat per al catàleg."
(Nota: Recorda ignorar les majúscules i minúscules en comparar el text).

     */
    public static void main(String[] args) {
        String estatProducte; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quin és l'estat del teu producte? ('Nou', 'Com nou', 'Bo' o 'Acceptable')");
        estatProducte = sc.nextLine();
        System.out.println("El teu producte es troba amb estat " + 
                estatProducte.toUpperCase());
        if (estatProducte.equalsIgnoreCase("NOU") ||  estatProducte.equalsIgnoreCase("Com nou"))
            {
                 System.out.println("Producte excel·lent. Es publicarà ràpidament.");
            }
        else if (estatProducte.equalsIgnoreCase("Bo") ||  estatProducte.equalsIgnoreCase("Acceptable"))
            {
                System.out.println("Producte acceptat per al catàleg.");
            }
        else
            {
                System.out.println("Producte no es pot catalogar pel seu estat");
            }
    }
    
}
