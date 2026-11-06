/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4creditsinicials;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4CreditsInicials {

    /**
     * Càlcul de crèdits inicials de regal
Quan un usuari es registra a ProvenShare, rep crèdits de benvinguda en funció dels serveis que ofereix per a la comunitat. Demana el nombre de serveis que oferirà l'estudiant en registrar-se (un nombre sencer).
Si ofereix 0 serveis, rep 10 crèdits.
Si ofereix 1 o 2 serveis, rep 50 crèdits.
Si ofereix 3 o més serveis, rep 100 crèdits.
Mostra per pantalla la quantitat de crèdits assignats.
Te preguntara si añades un amigo que compartas se te agregaran 7 puntos
     */
    public static void main(String[] args) {
        final int PUNTOS_AMIGO = 7;
        Scanner teclado = new Scanner(System.in);

        String amigo;
        int serveis, credits;
        
        // Mostrar
        System.out.print("Quants serveis oferiras? ");

        // Esperar
        serveis = teclado.nextInt();
        
        if (serveis == 0)
        {
            credits = 10;
        }
        //else if (serveis == 1 || serveis == 2)
        else if (serveis >= 1 &&  serveis <= 2)
        {
            credits = 50;
        }
        else if (serveis > 2)
        {
            credits = 100;
        }
        else
        {
            credits = 0;
        }
        
        System.out.println("Tens " + credits + " credits inicials");
        System.out.println("Ens recomanaras a un amic (SI/NO)");
        amigo = teclado.next(); //coge texto hasta encontrar Return o un espacio
        if (amigo.equals("SI"))
            {
                credits = credits + PUNTOS_AMIGO;
                System.out.println("Amb la recomanació ara tens " +  credits + " credits inicials");
            }
        else
            {
                System.out.println("Si ens recomanes et sumarem " + PUNTOS_AMIGO + " credits ");
            }
    }
    
}
