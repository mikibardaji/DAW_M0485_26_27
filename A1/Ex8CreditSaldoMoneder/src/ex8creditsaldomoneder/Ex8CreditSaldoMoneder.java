/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8creditsaldomoneder;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex8CreditSaldoMoneder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double preuLlibre, creditsActuals;
        String estatLlibre, missatge;
        
        System.out.print("Preu llibre: ");
        preuLlibre = teclado.nextDouble();
        System.out.print("Creditos Actuales: ");
        creditsActuals = teclado.nextDouble();
        System.out.print("Estado del libro(Disponible/Reservat): ");
        teclado.nextLine(); //limpia el buffer y el enter
        estatLlibre = teclado.nextLine();
        
        if (preuLlibre<=creditsActuals && estatLlibre.equals("Disponible"))
        {
            //System.out.println("1");
            missatge = "Compra realitzada";
        }
        else if(preuLlibre>creditsActuals)
        {
            //System.out.println("2");
            missatge = "Saldo insuficient al moneder";
        }        
        else if(estatLlibre.equals("Reservat"))
        {
            missatge = "El producte per ara esta reservat";
        }

        else
        {
            missatge = "Hi ha algun parametre no acceptable"
                    + "estat llibre" + estatLlibre
                    + "saldo " + creditsActuals
                    + "preu del llibre " + preuLlibre;
        }
        
        System.out.println(missatge);
        
    }
    
}
