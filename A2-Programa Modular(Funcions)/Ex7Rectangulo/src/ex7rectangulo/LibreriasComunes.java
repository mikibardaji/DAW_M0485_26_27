/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7rectangulo;

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

    public static double pedirNumeroUsuarioDouble(String frase)
    {
    //funcions de entrada datos
        //si tenen souts, si son per consola també tenen
        //tenen validacions
       Scanner sc= new Scanner(System.in);
       double num = 0;
       boolean numIncorr=false;
       
       do{
        try{
            System.out.print(frase);
            num=sc.nextDouble();
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

    
public static double pedirNumeroUsuarioDoublePositivo(String frase)
    {
    //funcions de entrada datos
        //si tenen souts, si son per consola també tenen
        //tenen validacions
       Scanner sc= new Scanner(System.in);
       double num = 0;
       boolean numCorrecto=false;
       
       do{
        try{
            System.out.print(frase);
            num=sc.nextDouble();
            if (num>=0)
            {
                numCorrecto=true;
            }
            else
            {
                System.out.println("Numero debe ser positivo");
                numCorrecto=false; //esta linea podria ser eliminada
            }
            sc.nextLine();
        } catch(InputMismatchException ex){
            System.out.println("No has puesto un numero");
            numCorrecto=false; //esta linea podria ser eliminada
            sc.nextLine();
        }
       }while(numCorrecto==false);
       
       return num;
    }    
    
}
