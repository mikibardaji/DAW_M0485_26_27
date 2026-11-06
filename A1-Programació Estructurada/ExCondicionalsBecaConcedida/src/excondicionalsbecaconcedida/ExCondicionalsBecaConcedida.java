/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excondicionalsbecaconcedida;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExCondicionalsBecaConcedida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notaPrimero, notaSegundo, media;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Que nota sacaste en primero? ");
        notaPrimero = teclado.nextDouble();
        System.out.print("Que nota sacaste en segundo? ");
        notaSegundo = teclado.nextDouble();
        
        media = (notaPrimero + notaSegundo)/2;
        System.out.println("media " + media);
        //si tienes 8 o mas te dan beca 1500
        //si tenesentre 6 y 8 beca 500
        //sino nada
       
        //Opcion 1 : if's anidados
//        if (media>=8)
//            {
//                System.out.println("Te concedemos la beca porque tu nota es " + media
//                + " la beca es de 1500 euros" );
//            }
//        else
//            {
//                if (media >=6 && media <8)
//                {
//                    System.out.println("Te concedemos la beca porque tu nota es " + media
//                + " la beca es SOLO de 500 euros" );
//                }
//                else
//                {
//                    System.out.println("Beca denegada porque no llegas a 6 , tu nota es " + media + 
//                    " estudia mas y deja de jugar tanto online");
//                }
//                
//            }
        //Opcion 2: if--else if--elsef
        if (media>=8)
            {
                System.out.println("(if-elseif) Te concedemos la beca porque tu nota es " + media
                + " la beca es de 1500 euros" );
            }
        else if(media >=6 && media <8)
            {
                 System.out.println("(if-elseif) Te concedemos la beca porque tu nota es " + media
                + " la beca es SOLO de 500 euros" );
            }
        else
        {
            System.out.println("(if-elseif) Beca denegada porque no llegas a 6 , tu nota es " + media + 
                    " estudia mas y deja de jugar tanto online");
        }
        
        System.out.println("Fin programa Becas");
        
        //te preguntaran cuantos hermanos tienes
        //si tienes media mas de 8 te dan 1500
        //si no llegas a 8 , luego si tienes 3 o mas hermanos te dan beca de 750 euros
                
    }
    
}
