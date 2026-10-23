/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num, aleatorio;
        System.out.print("Pon un numero: ");
        num = sc.nextInt();
        aleatorio = rd.nextInt(1, 151);
        System.out.println("aleatorio es " + aleatorio);
        
        if ((aleatorio %3) ==0)
        {
            System.out.println("Es divisible entre 3");
        }
        else
        {
            System.out.println("No es divisible entre 3");
        }
        
        if (aleatorio >=50 && aleatorio <=100)
        {
            System.out.println("esta entre 50 y 100");
        }
        
        if (aleatorio> num)
        {
            System.out.println("Aleatorio es mayor que tu numero");
        }
        else if (aleatorio < num)
         {
            System.out.println("Aleatorio es menor que tu numero");
        }
        else
        {
            System.out.println("son iguales,");
        }
        
        int resta = aleatorio - num;
        if (resta <0)
        {
            System.out.println("Si restes els dos numeros surt negatiu");
        }
    }
    
}
