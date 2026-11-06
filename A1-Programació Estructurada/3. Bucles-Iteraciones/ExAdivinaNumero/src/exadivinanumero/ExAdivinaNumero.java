/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exadivinanumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExAdivinaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Random random = new Random();
        final int MAX_INTENTOS =10;
        int aleatorio = random.nextInt(1,100);
        int numero = 0, intentos=0, diferencia;
        //System.out.println("El aleatorio es " + aleatorio);
        boolean acertado = false;
        
        do
        {
            System.out.print("Que num crees que estoy pensando? ");
            numero = teclado.nextInt();
            intentos++;
            if (numero==aleatorio)
                {
                    acertado = true; //saldre del bucle
                }
            else //no has acertado 
            {
                diferencia = numero - aleatorio;
                diferencia = Math.abs(diferencia); //si es negativo te da igualmente
                if (diferencia <= 10)
                    {
                        System.out.println("Estas cerca");
                    }
                if(numero > aleatorio)
                    {
                     System.out.println("es mas pequeño");
                    }
               else //if (numero < aleatorio)
                    {
                        System.out.println("Es mas grande");
                    }
            }
            

        //}while(numero!=aleatorio);
        }while(!acertado && intentos<MAX_INTENTOS);
        
        if (acertado)
        {
            System.out.println("Lo acertaste");
        }
        else
        {
            System.out.println("Has superado el numero de intentos: " + MAX_INTENTOS);
        }
    }
    
}
