/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriacondicionalbecafamilianumerosa;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaCondicionalBecaFamiliaNumerosa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notaPrimero, notaSegundo, media;
        int hermanos;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Que nota sacaste en primero? ");
        notaPrimero = teclado.nextDouble();
        System.out.print("Que nota sacaste en segundo? ");
        notaSegundo = teclado.nextDouble();
        System.out.print("Cuantos hermanos sois? ");
        hermanos = teclado.nextInt();
        media = (notaPrimero + notaSegundo)/2;
        System.out.println("media " + media);
        
        //te preguntaran cuantos hermanos tienes
        //si tienes media mas de 8 te dan 1500
        //si no llegas a 8 , luego si tienes 3 o mas hermanos te dan beca de 750 euros
        
        if (media >=8)
        {
            System.out.println("Te concedemos la beca porque tu nota es " + media
                + " la beca es de 1500 euros" );
        }
        else
            {
                if (hermanos>=3)
                {
                    System.out.println("Por ser familia numerosa tienes una beca de 750 euros" );
                }
                else
                {
                    System.out.println("No tienes beca");
                }
            }
        
        
        
    }
    
}
