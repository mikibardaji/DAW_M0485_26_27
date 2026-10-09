/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9saldomoneder;

import java.util.Scanner;

/**
 * Un usuari vol reservar una tutoria de programació. El servei només es pot fer si encaixa en els horaris de l'expert. Demana la franja que vol l'alumne ("Mati" o "Tarda") i la modalitat ("Online" o "Presencial").
L'expert només treballa sota aquestes condicions: al matí només fa serveis Online, i a la tarda només fa serveis Presencials.
Si la combinació introduïda és correcta, mostra: "Reserva confirmada amb l'expert."
Si no coincideix, mostra: "L'expert no està disponible en aquesta franja per a aquesta modalitat."

 * @author mabardaji
 */
public class Ex9SaldoMoneder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        String hora;
        String servei;
        
        System.out.println("Quina franja prefereixes: Mati o Tarda?");
        hora = teclado.nextLine();
       
        System.out.println("Quina modalitat prefereixes: Online o Presencial?");
        servei = teclado.nextLine();
        
        if ((hora.equalsIgnoreCase("Mati") && servei.equalsIgnoreCase("Online"))
                || (hora.equalsIgnoreCase("Tarda") && servei.equalsIgnoreCase("Presencial")))
                {
                    System.out.println("Reserva confirmada amb l'expert");
                }
       /* else if (hora.equalsIgnoreCase("Tarda") && servei.equalsIgnoreCase("Presencial"))
        {
            System.out.println("Reserva confirmada amb l'expert");
        }*/
        else
        {
            System.out.println("L'expert no està disponible en aquesta franja per a aquesta modalitat");
        }
        
        
    }
    
}
