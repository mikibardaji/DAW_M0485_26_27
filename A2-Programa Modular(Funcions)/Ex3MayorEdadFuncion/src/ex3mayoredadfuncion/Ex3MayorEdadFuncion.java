/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3mayoredadfuncion;

import java.util.Scanner;

/**
 * Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
3.
 * @author mabardaji
 */
public class Ex3MayorEdadFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edat;
        boolean mayor;
        System.out.print("Cuantos años tienes? ");
        edat = sc.nextInt();
        
//        mayor = esMayorEdad(edat);
//        if (mayor==true)
          //if(esMayorEdad(edat))
          if(esMayorEdad(edat)==true)
          {
              System.out.println("Eres mayor de edad puedes pasar");
          }
          else
          {
              System.out.println("Eres menor de edad no entras");
          }
    }
    
    public static boolean esMayorEdad(int a)
    {
        boolean mayorEdad;
        if (a>=18)
        {
            //return true;
            mayorEdad = true;
        }
        else
            mayorEdad = false; //al ser solo una linea puedo no poner {}
            //return false;
            
        return mayorEdad;
        
    }
}
