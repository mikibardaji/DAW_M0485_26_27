/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriastring;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Te pregunta el nombre
        // y te pregunta en que ciclo del proven te has matriculado
        // si existe te da la bienvenida
        // sino te dice que no estas matriculado
        String nombre,ciclo;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Com et dius?");
        nombre = sc.nextLine();
        System.out.println("En quin cicle t'has matriculat");
        ciclo = sc.nextLine();
        
        if (ciclo.equalsIgnoreCase("DAW")) //ignora mayusculas i si fiques daw es correcte/true
            {
                System.out.println("Benvingut al Proven a Desenvolupament Aplicacions Web");
            }
        else if(ciclo.equalsIgnoreCase("DAM"))
            {
                System.out.println("Benvingut al Proven a Desenvolupament Aplicacions Mulltimedia");
            }
        else if(ciclo.equalsIgnoreCase("asix"))
            {
                System.out.println("Benvingut al Proven a Administració Sistemes Informatics i Xarxa");
            } 
        else if(ciclo.equalsIgnoreCase("DawBio"))
            {
                System.out.println("Benvingut al Proven a BioInformatica");
            } 
        else
            {
                System.out.println("No estas al proven");
            }
    }
    
}
