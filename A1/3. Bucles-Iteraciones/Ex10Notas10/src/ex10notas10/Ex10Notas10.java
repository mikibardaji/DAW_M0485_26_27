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
        int nota,cont10=0;
        boolean nota10=false;
        do{//no hay contador, tampoco acumulo
            System.out.print("pon una nota del 0 al 10 (-1 para terminar): ");
            nota = sc.nextInt();
            if (nota==10)
            {
                nota10 = true; //flag
                cont10++; //flag y de contador
            }
        }while(nota!=-1); //lo contrario de la opcion salir (nota==-1)
        
        if (nota10)
        {
            System.out.println("Has sacado algun 10");
        }
        
        if (cont10>0)
        {
            System.out.println("Has sacado algun 10");
        }
        
    }
    
}
