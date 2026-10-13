/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11validaciohores;

import java.util.Scanner;

/**
 *
 * Validació de durada i franja horària (Variables Numèriques)
Un estudiant vol oferir un servei de classes de programació. El programa li demanarà dos valors numèrics: l'hora d'inici (un sencer de 0 a 23) i la durada estimada del servei en minuts (un sencer).
Perquè el servei es pugui publicar, ha de complir les dues condicions següents:
L'hora d'inici ha de ser com a mínim a les 8 i com a màxim a les 20 (per evitar serveis nocturns).
La durada del servei no pot superar els 120 minuts (2 hores).
Si es compleixen ambdues condicions, mostra el missatge: "Servei acceptat. S'ha publicat correctament al catàleg."
Si l'hora és incorrecta però la durada és bona, mostra: "Error: L'hora d'inici ha d'estar entre les 8h i les 20h."
Si l'hora és bona però la durada és excessiva, mostra: "Error: La durada del servei no pot superar els 120 minuts."
Si no en compleix cap de les dues, mostra: "Error: L'hora i la durada introduïdes no són vàlides."

 */
public class Ex11ValidacioHores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIABLES
        int horaInici,durada;
        
        System.out.print("Introdueix l'hora d'inici (0-23): ");
        // ESPERAR
        horaInici = sc.nextInt();
        // MOSTRAR
        System.out.print("Introdueix la durada del servei en minuts: ");
        // ESPERAR
        durada = sc.nextInt();
        
         if (horaInici >= 8 && horaInici <= 20 && durada <= 120) {
            System.out.println("Servei acceptat. S'ha publicat correctament al cataleg.");
            }
         else
         { //casos incorrectes
             if (horaInici >= 8 && horaInici <= 20 && durada > 120) {
            System.out.println("Error: La durada del servei no pot superar els 120 minuts.");
            }
             else if ((horaInici < 8 || horaInici > 20) && durada <= 120)
             {
                 System.out.println("Error: L'hora d'inici ha d'estar entre les 8h i les 20h.");
             }
             else
             {
                 System.out.println( "Servei acceptat. S'ha publicat correctament al catàleg.");
             }
         }
         
    }
    
}
