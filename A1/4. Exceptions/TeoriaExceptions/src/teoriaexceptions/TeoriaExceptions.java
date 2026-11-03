/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaexceptions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=4;
        int b=0;
        int result;
        String numeroString;
        //ArithmeticException
        result = a/b;
        System.out.println("la división es " + result);
        
        //InputMismatchException
//        System.out.print("Pon un valor...");
//        result = sc.nextInt();
//        System.out.println("Has introducido...  " + result);

        
        //NumberFormatException
        //numeroString = "48a";
        //result = Integer.parseInt(numeroString);
        //System.out.println("El string tenia el valor " + result);
        
    }
    
}
