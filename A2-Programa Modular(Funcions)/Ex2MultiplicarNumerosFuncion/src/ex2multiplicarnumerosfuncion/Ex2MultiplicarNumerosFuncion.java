/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2multiplicarnumerosfuncion;

import java.util.Scanner;

/**
 * Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
    resultado de multiplicarlos. Implementa y utiliza la función:
    double multiplica(double a, double b) // Devuelve la multiplicación de dos números
 * @author mabardaji
 */
public class Ex2MultiplicarNumerosFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double resultado;
        System.out.print("Pon el primer numero? ");
        double num1 = sc.nextDouble();
        System.out.print("Pon el segundo numero? ");
        double num2 = sc.nextDouble();
        
        resultado = multiplica(num1, num2);
        System.out.println("Su multiplicació es " + resultado);
    }
    
    public static double multiplica(double a, double b)
    {
        double multi = a*b;
        return multi;
    }
    
}
