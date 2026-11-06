/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvalidarnota;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExValidarNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String notaString;
        int nota=0;
        boolean notavalida=false;
        do
        {
            try
            {
                System.out.print("Introduce la nota de tu examen: ");
                notaString  = sc.nextLine();
                nota = Integer.parseInt(notaString);
                if (nota<0 || nota>10)
                {
                    System.out.println("La nota debe estar entre 0 y 10");
                }
                else
                {
                    notavalida = true;
                }
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Has introduit text i te que ser numero");
            }
        }while(!notavalida);    
        //}while(!(nota>=0 && nota<=10));
    //}while((nota<0 || nota>10));
        System.out.println("Tu nota ha quedado registrada" + nota);
    }
    
}
