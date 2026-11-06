/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9acumulasuma1al10;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex9AcumulaSuma1al10 {

    /**
     * Realiza un programa que calcule y escriba la suma
     * y el producto de los 10 primeros números
naturales.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumuladoSuma=0, numero;
        for (int i = 1; i <= 10; i++) {
            acumuladoSuma = acumuladoSuma + i;
            //acumuladoSuma += i; sinonimo
            //System.out.println("contador vale " + i);
            //System.out.println("acumalado vale " + acumuladoSuma);
            //sc.nextLine(); //pausa
        }
        System.out.println("El total acumulado es " + acumuladoSuma);

        int acumuladoMultiplicacion = 1;
        for (int i = 1; i <= 10; i++) {
            //acumuladoMultiplicacion = acumuladoMultiplicacion * i; sinonimo
            acumuladoMultiplicacion *=  i;
            System.out.println("contador vale " + i);        
            System.out.println("acumalado vale " + acumuladoMultiplicacion);
            System.out.println("Pausa aprieta enter para seguir");
            sc.nextLine();
        }
//codigo si en lugar de sumar el contador 
//sumaras 10 numeros introducidos        
//        acumuladoSuma = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Introduce un numero y los ire sumando: ");
//            numero = sc.nextInt();
//            acumuladoSuma = acumuladoSuma + numero;
//        }
//        System.out.println("La suma de tus numeros es " + acumuladoSuma);
    }
    
}
