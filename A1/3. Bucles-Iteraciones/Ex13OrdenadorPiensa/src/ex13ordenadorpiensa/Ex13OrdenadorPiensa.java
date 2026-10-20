/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13ordenadorpiensa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex13OrdenadorPiensa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int minMaquina=1, maxMaquina=101;
        int numUsuario, numMaquina;
        char opcion;
        System.out.print("Que numero has pensado?");
        numUsuario = sc.nextInt();
        do
        {
        //pensar la maquina
            numMaquina = rd.nextInt(minMaquina, maxMaquina);
            System.out.println("Pienso que es el.. " + numMaquina);
            System.out.println("El numero es mas grande (g) , mas pequeño (p) o acerte(a)");
            opcion = sc.next().charAt(0);
            System.out.println("has dicho " + opcion);
            switch (opcion) {
                case 'a':
                case 'A':   
                    System.out.println("Acerte!!!! ");
                    break;
                case 'g':
                case 'G':    
                    //si es mas grande el valor minimo debe ser el de la maqujina
                    minMaquina = numMaquina+1;
                    break;
                case 'p':
                case 'P':    
                    maxMaquina = numMaquina;
                    break;
                default: //opcion incorrecte
                    System.out.println("Escribe a,p o g... has escrito " + opcion);
                    break;
            }
        } while(opcion!='a');
        System.out.println("Mi nuevo minimo es " + minMaquina + " maximo " + maxMaquina);
    }
    
}
