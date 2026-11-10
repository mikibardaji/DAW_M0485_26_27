/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4minimo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class LibreriasComunes {
    /* no hay main*/
     /**
     * Pedir numero al usuario y devolverlo
     * @return
     */
    public static int pedirNumeroUsuario(String frase){
       
       Scanner sc= new Scanner(System.in);
       int num = 0;
       boolean numIncorr=false;
       
       do{
            try{
                System.out.print(frase);
                num=sc.nextInt();
                numIncorr=true;
                sc.nextLine();
            } catch(InputMismatchException ex){
                System.out.println("No has puesto un numero");
                numIncorr=false;
                sc.nextLine();
            }
       }while(numIncorr==false);
       
       
       return num;
       
    }
}
