/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4dau;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Ex4Dau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random rand = new Random();
         int dau = rand.nextInt(1, 7);
         
         System.out.println("El dau ha tret... " + dau);
         if (dau ==6)
         {
             System.out.println("Molt bé");
         }
         else if (dau ==1)
         {
             System.out.println("Fatal");
         }
         else
         {
             System.out.println("Tirada normal");
         }
         
    }
    
}
