/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmenufifa;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExMenuFifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        
        do{
         System.out.println(" ****Bienvenido a FIFA***");
         System.out.println(" *   A - Jugar                    *");
         System.out.println("*  B - Entrenar                *");
         System.out.println("* C - Jugar Partido Online *  ");
         System.out.println(" * D - Exit                       *  ");
         System.out.print("* Escoge Opcion : ");
         opcion = sc.nextLine().charAt(0);
         String mensaje="";
            switch (opcion) {
               case 'A':
               case 'a':
                   //mensaje = "Estas jugando";
                   System.out.println("Estas jugando");
                   break;
               case 'B':
               case 'b': 
                   System.out.println("Estas entrenando");
                   break;
               case 'C':
               case 'c': 
                   System.out.println("Estas entrenando");
                   break;
               case 'D':
               case 'd': 
                   System.out.println("Saliendo... ");
                   break;
               default:
                   System.out.println("Opcion incorrecta -> " + opcion);
           }
        }while(opcion!='D' && opcion != 'd');
//            System.out.println(mensaje);
    }
    
}
