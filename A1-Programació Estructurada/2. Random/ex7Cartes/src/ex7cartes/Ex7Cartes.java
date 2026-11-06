/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7cartes;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Ex7Cartes {

    /**
     * Fes un programa que amb més d’un aleatori, et tregui una carta, i et digui quina t’ha sortit.
    Contar que s’haura de triar el numero i el pal. El tipus de joc de cartes potser la que vulguis, la espanyola o les de poker.
     */
    public static void main(String[] args) {
       Random random = new Random();
       
       String palo, carta;
       int numPalo, numCarta;
       numPalo = random.nextInt(4);
        //System.out.println("numPalo " + numPalo);
       if (numPalo == 0)
       {
           palo = "Corazones";
       }
       else if (numPalo == 1)
       {
           palo = "Rombos";
       }
       else if (numPalo == 2)
       {
           palo = "Picas";
       }
       else
       {
           palo = "Treboles";
       }
       
       numCarta = random.nextInt(1,14);
        //System.out.println("numCarta " + numCarta );
       if (numCarta == 1)
       {
           carta = "As";
       }
       else if (numCarta == 11)
       {
           carta = "Jota";
       }
       else if (numCarta == 12)
       {
           carta = "Dama";
       }       
       else if (numCarta == 13)
       {
           carta = "Rey";
       }   
       else
       {
           carta = String.valueOf(numCarta);
       }
       
        
//        if (numCarta >=2 && numCarta <= 10)
//        {
//            System.out.println("Ha salido : " + numCarta + " de " + palo);
//        }
//        else
//        {
        System.out.println("Ha salido : " + carta + " de " + palo);
//        }
    }
    
}
