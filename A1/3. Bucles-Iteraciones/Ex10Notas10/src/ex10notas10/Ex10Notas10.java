/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10notas10;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex10Notas10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        
        do{
            System.out.print("pon una nota del 0 al 10 (-1 para terminar): ");
            nota = sc.nextInt();
            
        }while(nota!=-1);
    }
    
}
