/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuiterativo;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class MenuIterativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionMenu;
        
        do
        {
            System.out.println("1. Jugar a Fifa");
            System.out.println("2. Jugar a Clash Royale");
            System.out.println("3. Jugar a Braw Stars");
            System.out.println("4. Exit");
            System.out.print("Pon opcion(1-4): ");
            opcionMenu = sc.nextInt();
            if (opcionMenu < 1 || opcionMenu>4)
            {
                System.out.println("Opción Incorrecta!!! ");
            }
        }while(opcionMenu < 1 || opcionMenu>4);     
        //opcionMenu >=1 && opcionMenu<=4 opciones correctas
        //opcionMenu == 1 || opcionMenu == 2 .... 
        System.out.println("opcion correcta del menú");
    }
    
}
