/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomteoria;

import java.util.Random;



/**
 *
 * @author mabardaji
 */
public class RandomTeoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        //generar enter aleatorio 2^32
        int numAleatorio = aleatorio.nextInt();
        System.out.println("ha salido el " + numAleatorio);
        
        //enter aleatori entre 2 numeros
        numAleatorio = aleatorio.nextInt(0, 5);
        System.out.println("(0-5) ha salido el " + numAleatorio);
        
        //decimals
        double numDecimal = aleatorio.nextDouble(0, 5);
        System.out.println("(0-5 decimales) ha salido el " + numDecimal);
        
        //aleatori entre dos opcions (boolean)
        boolean cierto = aleatorio.nextBoolean(); //dos opciones
        
        String color;
        if (cierto==true)
        {
            color = "Rojo";
        }
        else
        {
            color = "Negro";
        }
        
        System.out.println("Ha salido el " + color);
        
        int numero = aleatorio.nextInt(1, 101);
        if (numero>=1 && numero<=48)
        {
             color = "Rojo";
        }
        else if(numero>=49 && numero <=96)
        {
             color = "Negro";
        }
        else //sera del 97 al 100
        {
            color = "Verde";
        }
        
        System.out.println("En la ruleta ha salido el " + color);
            
        //System.out.println(cierto);
        
        
        //
        
    }
    
}
