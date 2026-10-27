/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4reforcedad;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4ReforcEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce la edad que tienes: ");
        edad = scan.nextInt();
        while(edad>0)
        {
            System.out.println("Al any " + anyo_actual + " tens " + edad + " anys.");
            anyo_actual--;
            edad--;
        }
//        for (edad = scan.nextInt(); edad > 0; edad--) {
//            System.out.println("Al any " + anyo_actual + " tens " + edad + " anys.");
//            anyo_actual--;
//        }
        System.out.println("Vas neixer al any " + anyo_actual);
       
    }
    
}
