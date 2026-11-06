/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6calcularprecioiva;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
 // Devuelve el precio tras sumarle un 21% de IVA
 */
public class Ex6CalcularPrecioIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio, precioConIVA;
        
        for (int i = 1; i <= 5; i++) 
        {
            precio = pedirNumeroUsuarioDouble("Pon el precio del producto: ");
        
            precioConIVA = precioConIVA(precio);
            //mostrar
            mostrarPrecioFinal(precioConIVA);
        }
        
    }
    
    public static void mostrarPrecioFinal(double pre)
    {
        System.out.println("El precion con iva incluido es... " + pre);
    }
    
    public static double pedirNumeroUsuarioDouble(String frase){
       
       Scanner sc= new Scanner(System.in);
       double num = 0;
       boolean numIncorr=false;
       
       do{
        try{
            System.out.print(frase);
            num=sc.nextDouble();
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
    public static double precioConIVA(double precio)
    {
        double iva, precioTotal;
        iva = precio * 0.21;
        precioTotal = precio + iva;
        return precioTotal;
    } //NO HAY SOUTS PARA QUE ME SIRVA APRA UNA WEB, APP MOVIL O PARA CONSLTA
    
}
