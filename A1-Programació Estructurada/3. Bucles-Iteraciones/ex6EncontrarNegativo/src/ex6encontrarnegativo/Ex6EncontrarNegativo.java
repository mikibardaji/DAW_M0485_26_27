/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6encontrarnegativo;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex6EncontrarNegativo {

    /**
     * Realiza un programa que lea 10 números no nulos 
     * y luego muestre un mensaje de si ha leído algún número negativo o no.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean negativo = false;
        int contador = 1;
        int numero;
      
//opcion valida 
//        for (contador = 1; contador <= 10; contador++) {
//            System.out.print("Escribe un numero: "); 
//            // esperamos numero
//            numero = teclado.nextInt();
//            // si el numero es menor que 0 
//            if (numero < 0) 
//                {
//                    negativo = true; //activado y no hay ninguna linea que lo desactive.
//                }
//        }
        while (contador <= 10 ) { // repite un codigo mientras sea cierto && negativo == false (si parara al poner negativo)
            // mostramos que escriba un numero
            System.out.print("Escribe un numero: "); 
            // esperamos numero
            numero = teclado.nextInt();
            // si el numero es menor que 0 
            if (numero < 0) 
                {
                    negativo = true; //activado y no hay ninguna linea que lo desactive.
                }
//            else no se debe desactivar porque alguno sea positivo
//                {
//                    negativo = false;
//                }
             contador = contador +1;
        }
        
        
        //if (negativo==true) lo mismo
        if (negativo) 
        {
            System.out.println("has introducido algun negativo");
        }
    }
    
}
