/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10validacioncorreu;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex10ValidacionCorreu {

    /**
     * Per registrar-se a ProvenShare, el correu electrònic de l'usuari ha de ser oficial de la universitat o de l'institut. Demana a l'usuari el seu correu electrònic (un String) i el seu lloc d'estudis ("Universitat" o "Institut").
(Pista: Com que estem al principi del curs, farem que l'estudiant introdueixi l'extensió del correu, per exemple ".edu" o ".cat", per separat de la resta del text).
Si estudia a la "Universitat", l'extensió ha de ser obligatòriament ".edu" o ".cat".
Si estudia a l'Institut, l'extensió ha de ser obligatòriament ".es" o ".cat".
Si es compleix, mostra: "Correu oficial validat.". Si no, mostra: "Error: L'extensió no correspon al teu centre d'estudis."
Documentació d’ajuda per l’exercici: Mètode String endWith

     */
    public static void main(String[] args) {
        String correu, llocEstudis, missatge;
        
        Scanner txt = new Scanner(System.in);
        
        System.out.println("Introdueix el teu correu");
        correu = txt.nextLine();
        
        System.out.println("Quin es el teu lloc d'estudis (Universitat o Institut)?");
        llocEstudis = txt.nextLine();
        
        missatge = "";
               
        if (llocEstudis.equalsIgnoreCase("Universitat"))
            {
                if (correu.endsWith(".edu") || correu.endsWith(".cat"))
                {
                    missatge = "Correu oficial validat."; 
                }
                else
                {
                    missatge = "Error: L'extensió no correspon al teu centre d'estudis."; 
                }
            }
        else if (llocEstudis.equalsIgnoreCase("Institut"))
            {
                if (correu.endsWith(".es") || correu.endsWith(".cat"))
                {
                    missatge = "Correu oficial validat."; 
                }
                else
                {
                    missatge = "Error: L'extensió no correspon al teu centre d'estudis."; 
                }
            }
        else
        {
            missatge = "Destinació incorrecta";
        }
        
        System.out.println(missatge);
    }
    
}
