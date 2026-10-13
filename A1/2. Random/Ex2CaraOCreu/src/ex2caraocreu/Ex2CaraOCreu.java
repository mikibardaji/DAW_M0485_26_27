/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2caraocreu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2CaraOCreu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        //int moneda  = rand.nextInt(1, 3);
        boolean moneda  = rand.nextBoolean();
        String monedaTexto;
        System.out.println("Cara o cruz?");
        monedaTexto = sc.nextLine();
        //if (moneda==true)
        if (moneda)
        {
            System.out.println("La moneda ha salido Cara");
        }
        else
        {
            System.out.println("La moneda ha salido Cruz");
        }
        
        
        //true => Cara i false => Cruz
        //if (moneda==true && monedaTexto.equalsIgnoreCase("CARA")) equivalente a la linea de abajo
        if (moneda && monedaTexto.equalsIgnoreCase("CARA"))
        {
            System.out.println("Ganaste");
        }
        //else if (moneda==false && monedaTexto.equalsIgnoreCase("CRUZ")) equivalente a la linea de abajo
        else if (!moneda && monedaTexto.equalsIgnoreCase("CRUZ"))
         {
            System.out.println("Ganaste");
        }
        else
        {
            System.out.println("Perdiste!");
        }
    }
    
}
