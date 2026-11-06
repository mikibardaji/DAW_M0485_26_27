/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex4DimeSigno;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4DimeSigno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor, signo;
        valor = pedirNumeroUsuario("Introduce valor y te dire si es positivo o no: ");
        
        signo = dimeSigno(valor);
        
        mostrarResultadoFinal(signo);
    }
    
    public static void mostrarResultadoFinal(int signo)
    {
         if (signo==1)
        {
            System.out.println("Has puesto un positivo");
        }
        else if (signo == -1)
        {
            System.out.println("Has puesto un negativo");
        }
        else
        {
            System.out.println("Has puesto un 0");
        }
    }
    
    
    // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si
    public static int dimeSigno(int a)
    {
        int signo;
        //negativo
        if (a<0)
        {
            signo = -1;
        }
        else if (a>0)
        {
            signo = 1;
        }
        else
        {
            signo = 0;
        }
        
        
        return signo;
    }
    
    
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
