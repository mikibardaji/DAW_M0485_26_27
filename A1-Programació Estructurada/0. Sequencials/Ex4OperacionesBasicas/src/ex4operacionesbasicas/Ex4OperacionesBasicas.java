/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4operacionesbasicas;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4OperacionesBasicas {

    /**
     * 4Programa que llegeixi dos números, calcula i mostra el valor de la suma, la resta, el producte i la divisió.
     */
    public static void main(String[] args) {
        int numero1, numero2, suma, resta, multi;
        double divi;
        Scanner teclado = new Scanner(System.in);
        //mostrar pon numero 1
        System.out.print("Cual es el numero 1? ");
        //espera numero1
        numero1 = teclado.nextInt();
        //mostrar pon numero 2
        System.out.print("Cual es el numero 2? ");
        //espera numero2
        numero2 = teclado.nextInt();
        //calcular suma = numero1 + numero2
        suma = numero1 + numero2;
        //mostrar resultado suma
        System.out.println("La suma es " + suma);
        //calcular resta = numero1 - numero2
        resta = numero1 - numero2;
        //mostrar resultado suma
        System.out.println("La resta es " + resta);
          //calcular multiplicacion = numero1 * numero2
        multi = numero1 * numero2;
        System.out.println("La multiplicación es " + multi);
        //calcular division = numero1 / numero2
        divi = (double) numero1 / numero2; //castear es pedir que el resultado lo devuelva al tip que queremos
        System.out.println("La división es " + divi);
        
        
        
    }
    
}
