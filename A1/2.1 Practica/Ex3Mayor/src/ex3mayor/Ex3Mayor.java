/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3mayor;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double edad;
        String documentacionOK;
        System.out.print("Pon edad? ");
        edad = sc.nextDouble();
        if (edad <= 0)
        {
            System.out.println("Error: L'edat introduïda no és vàlida.");
        }
        else
        {
            if (edad <18)
            {
                System.out.println("Accés denegat: Ets menor d'edat per operar en aquesta plataforma.");
            }
            else
            {
                System.out.println("tu domecuen esta ok? (SI/NO)");
                documentacionOK = sc.nextLine();
                if (documentacionOK.equalsIgnoreCase("SI"))
                {
                    System.out.println("Accés permès: Benvingut");
                }
                else
                {
                    System.out.println("Accés pendent: Has de renovar la teva documentació");
                }
            }
        }
    }
    
}
