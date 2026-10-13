/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7preusllibres;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex7PreusLlibres {

    /**
     *  Alerta de preus per a llibres de text (Variables Numèriques)
Dins del catàleg de productes físics, volem ajudar els estudiants a saber si un llibre de text té un preu just, és una ganga o és massa car. Crea un programa que demani per teclat el preu d'un llibre en crèdits (un decimal double).
Si l'import és menor de 15.0 crèdits, mostra: "Preu excel·lent! És una ganga."
Si l'import està entre 15.0 i 35.0 crèdits (ambdós inclosos), mostra: "Preu estàndard i correcte per a un llibre."
Si l'import és major de 35.0 crèdits, mostra: "Atenció: Aquest llibre té un preu superior a la mitjana."
Si posa un valor enter, pero sense sentit (penseu quin) , mostra “Error preu no vàlid”

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double precioLibroCredit;
        
         System.out.print("Cual es el precio del libro en creditos: ");
         precioLibroCredit = sc.nextDouble();
         
         if (precioLibroCredit < 15){ 
         System.out.println("¡Precio excelente! Es una ganga. ");
         
         } else if(precioLibroCredit >=15 && precioLibroCredit <= 35 ){
             System.out.println("Precio estándar y correcto para un libro.");
             
         }else {
             System.out.println("Atención: Este libro tiene un precio superior a la media.");
         }
    }
    
}
