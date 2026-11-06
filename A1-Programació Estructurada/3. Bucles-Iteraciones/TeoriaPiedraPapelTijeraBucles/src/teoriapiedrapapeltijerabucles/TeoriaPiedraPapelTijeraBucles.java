/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriapiedrapapeltijerabucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaPiedraPapelTijeraBucles {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numMaquina;
        char opcioJugador=' ', opcioMaquina=' ';
        String opcioJugadorTexte="No Correcte",opcioMaquinaTexte="";
        do
            {
                System.out.print("Tria la teva jugada (S: Pedra, A: Paper, T: Tisora): ");
                opcioJugador = teclado.next().charAt(0);
            }while(opcioJugador !='S' && opcioJugador!='T' && opcioJugador!='A'
                && opcioJugador !='s' && opcioJugador!='t' && opcioJugador!='a');
        // opcioJugador == 'S' || opcioJugador == 'T' || opcioJugador == 'A' <-- correctes
        
        switch (opcioJugador) {
            case 'S':
            case 's':
                opcioJugador = 'S';
                opcioJugadorTexte = "Pedra";
                break;
            case 'A':
            case 'a':
                opcioJugador = 'A';
                opcioJugadorTexte = "Paper";
                break;
            case 'T':
            case 't':
                opcioJugador = 'T';
                opcioJugadorTexte = "Tisora";
                break;
            default:
                break;
        }
        System.out.println("Has jugat : " + opcioJugadorTexte);
        //no controlem lletres incorrectes
        numMaquina = random.nextInt(1, 4);
        switch (numMaquina) {
            case 1:
                opcioMaquina = 'S';
                opcioMaquinaTexte = "Pedra";
                break;
            case 2:
                opcioMaquina = 'A';
                opcioMaquinaTexte = "Paper";
                break;
            case 3:
                opcioMaquina = 'T';
                opcioMaquinaTexte = "Tisora";
                break;
            default:
                break;
        }     
        System.out.println("La maquina ha  jugat : " + opcioMaquinaTexte);
        
        String resultat="Resultat no vàlid";
        if (opcioJugador == opcioMaquina)
        {
            resultat = "Empat";
        }
        else if ((opcioJugador == 'S' && opcioMaquina=='T')
            || (opcioJugador == 'A' && opcioMaquina=='S')
            || (opcioJugador == 'T' && opcioMaquina=='A'))    
        {
            resultat = "Jugador";
        }
        else if ((opcioJugador == 'T' && opcioMaquina=='S')
            || (opcioJugador == 'S' && opcioMaquina=='A')
            || (opcioJugador == 'A' && opcioMaquina=='T'))    
        {
            resultat = "Maquina";
        }
        
        System.out.println("El guanyador es : " + resultat);
    }
    
}
