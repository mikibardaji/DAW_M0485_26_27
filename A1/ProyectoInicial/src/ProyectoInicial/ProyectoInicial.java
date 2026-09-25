/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProyectoInicial;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ProyectoInicial {

    /**
     *  Un programa que preguntant al usuari quants
     * diners tenia a la cartera, i quants diners 
     * li han costat les entrades del cine, 
     * ha de saber quantes entrades ha comprat, i el preu d’una sola entrada, li calculi quants diners te disponibles per palometes i xuxes.
     * 
     */
    public static void main(String[] args) {
        int edad, dinero, dinero_mas_regalo; //declaracion no le asigno valor TIPO PRIMITIVO
        Scanner teclado = new Scanner(System.in);  
        // Mostrar "dime la edad"
        System.out.println("Dime la edad que tienes");
       
        // esperar edad (declarar la variable y decirle el tipo
        edad = teclado.nextInt();
        System.out.println("Tienes " + edad  + " años.");
        
        //Preguntar dinero
        System.out.println("Cuanto dinero tienes");
        // esperar dinero
        dinero = teclado.nextInt();
        System.out.println("Tienes " + dinero + " euros.");
        //regalar 1000 euros
        dinero += 1000;
        //dinero_mas_regalo = dinero + 1000;
        
        //mostrar dinero que tienes ahora
        System.out.println("Gracias por jugar ahora tienes " + dinero + " euros.");
    }
    
    
}
