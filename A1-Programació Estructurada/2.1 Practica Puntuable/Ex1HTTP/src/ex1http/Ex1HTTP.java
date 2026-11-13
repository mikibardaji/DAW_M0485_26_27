/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1http;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1HTTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String puerto;
        System.out.print("Que puerto? ");
        puerto = sc.nextLine();
        
        switch (puerto) {
            case "200":
                System.out.println("OK: La sol·licitud ha tingut èxit." );
                break;
            case "301":
                System.out.println("Moved Permanently: La pàgina s'ha mogut de lloc.");
                break;                
            case "404":
                System.out.println("Not Found: El recurs no existeix.");
                break;
            case "500":
                System.out.println("Internal Server Error: Error al servidor.");
                break;
            default:
                System.out.println("Error: Codi HTTP desconegut o no gestionat per l'aplicació (Codi 501 Not Implemented).");
        }
    }
    
}
