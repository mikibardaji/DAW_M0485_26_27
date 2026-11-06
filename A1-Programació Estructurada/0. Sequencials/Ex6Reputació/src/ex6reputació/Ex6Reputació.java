/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6reputació;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex6Reputació {

    /**
     * Exercici 6: Sistema de reputació (Estrelles)
Després de finalitzar un servei, es valora l'usuari amb una nota d'1 a 5 estrelles (un sencer). 
* Crea un programa que rebi aquesta nota i mostri un comentari textual del perfil:
5: "Usuari excel·lent i de total confiança."
4: "Molt bon usuari."
3: "Usuari correcte."
1 o 2: "Atenció: Usuari amb valoracions baixes."
Qualsevol altre número: "Error: Nota no vàlida."
Realitzar l'exercici amb if…elseif… i realitzar amb Switch.

     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valoracio;
        String missatge;
        
        System.out.println("Quina nota té el usuari? ");
        valoracio = teclado.nextInt();
/*        if (valoracio == 5)
            {
                missatge = "Usuari excel·lent i de total confiança.";
            }
        else if (valoracio == 4)
            {
                missatge = "Molt bon usuari.";
            }
        else if (valoracio == 3)
            {
                missatge = "Usuari correcte.";
            }        
        else if (valoracio == 1 || valoracio == 2)
            {
                missatge = "Atenció: Usuari amb valoracions baixes.";
            }  
        else
            {
                missatge = "Error: Nota no vàlida.";
            }
        */
        switch(valoracio)
            {
            case 5:
                missatge = "Usuari excel·lent i de total confiança.";
                break;
            case 4:
                missatge = "Molt bon usuari.";
                break;
            case 3:
                missatge = "Usuari correcte.";
                break;
            case 1:
            case 2:
                missatge = "Atenció: Usuari amb valoracions baixes.";
                break;
            default:
                missatge = "Error: Nota no vàlida.";
                break;
        }

        System.out.println("Segons ProvenShare el usuari es " + missatge);
    }
    
}
