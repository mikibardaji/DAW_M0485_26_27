/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7contadorpositivosnegativos;

import java.util.Scanner;

/**
 *
 * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje indicando cuántos son positivos y cuantos negativos.
 */
public class Ex7ContadorPositivosNEgativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int num, contador = 0, contadorNegativo = 0, contadorPositivo =0;
        
        while (contador < 10) //porque empieza por 0, si empezara por 1 deberia ser <=
        {
            System.out.println("Introdueix un numero no nul:");
            num = teclado.nextInt();
            
            if (num!=0)
            {
                contador++; //si no es 0 si aumento el contador
                if (num<0)
                {
                    contadorNegativo++;
                }
                else
                {
                    contadorPositivo++;
                }
            }
 
        }
        System.out.println("Positivos: " + contadorPositivo + " negativos: " + contadorNegativo);
    }
    
}
