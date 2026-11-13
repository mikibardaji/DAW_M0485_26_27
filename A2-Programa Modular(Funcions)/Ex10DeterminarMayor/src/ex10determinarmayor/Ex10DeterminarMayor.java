/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10determinarmayor;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  Realiza un programa que pida introducir tres valores enteros y nos diga cu�l de ellos es el m�s
 * elevado. Implem�ntalo creando �nicamente una funci�n a la que le pasemos dos valores (no
*  tres) y nos devuelva el m�ximo de los dos valores.
 */
public class Ex10DeterminarMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,num3,num4, mayor, mayor2, mayorfinal;
//        
        num1 = pedirNumeroUsuario("Pon el primer valor: ");
        num2 = pedirNumeroUsuario("Pon el segundo valor: ");
        num3 = pedirNumeroUsuario("Pon el tercer valor: ");
        num4 = pedirNumeroUsuario("Pon el cuarto valor: ");
//        
        mayor = mayor(num1, num2);
        mayor2 = mayor(num3, num4);
//        
        mayorfinal = mayor(mayor, mayor2);
//        
        System.out.println("El numero mas grande es " + mayorfinal);
//        
   
        System.out.println("Mayor _> " + mayor(7,6));

    }
    
    public static int mayor(int a , int b)
    {
        if (a>=b)
        {
            return a;
        }
        else // if (b>a)
        {
            return b;
        }
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
