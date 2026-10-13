/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4del1an;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4del1aN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon el numero maximo al que quieres que cuente: ");
        int tope = sc.nextInt();
        for (int i = 1; i <= tope; i++) {
            if (i<tope)
            {
                System.out.print(i + "-"); //para que quede mas bonito lo pongo en la misma
            } //linea
            else
            {
                System.out.print(i); //el ultimo no quiero un guion 
            }    

        }
        System.out.println("");   //para poner un salto de linea al final de todo!
    }
    
}
