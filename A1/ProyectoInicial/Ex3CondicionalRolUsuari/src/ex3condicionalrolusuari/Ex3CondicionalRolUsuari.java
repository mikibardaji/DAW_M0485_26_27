/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3condicionalrolusuari;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3CondicionalRolUsuari {

    /**
     * Exercici 3: El filtre de l'Administrador
Per protegir la comunitat, només els usuaris amb el rol d'administrador poden esborrar usuaris del sistema. 
* Crea un programa que demani el nom d'usuari i el seu rol (estudiant / administrador).
Si el rol és "administrador", mostra: "Accés permès. Pots gestionar els usuaris."
Si el rol és qualsevol altre, mostra: "Accés denegat. Només els administradors tenen aquest permís."

     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario, rol;
        
        // Mostrar "Cuál es tu nombre de usuario?"
        System.out.print("Cual es tu nombre de usuario? ");

        // Esperar usuario
        usuario = teclado.nextLine();
        // Mostrar "Cuál es tu rol?"
        System.out.print("Cual es tu rol? ");

        // Esperar rol
        rol = teclado.nextLine();
        
        if (rol.equalsIgnoreCase("ADMINISTRADOR"))
        {
            System.out.println("Benvingut " + usuario);
            System.out.println("Ets administrador pots gestionar usuaris");
        }
        else
        {
            System.out.println("Benvingut " + usuario );
            System.out.println("Accés denegat. Només els administradors tenen aquest permís.");
        }
    }
    
}
