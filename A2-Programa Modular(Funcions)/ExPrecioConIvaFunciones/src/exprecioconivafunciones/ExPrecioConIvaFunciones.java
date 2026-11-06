/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exprecioconivafunciones;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExPrecioConIvaFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double precio, precioIVA;
        
        precio = pedirPrecioSinIva();
        
        precioIVA = calcularPrecioConIVA(precio);
        
        //resultado final podria ser un void 
        System.out.println("Precio con IVA Incluido: " + precioIVA);
   
    }
    
    
    public static double calcularPrecioConIVA(double precioSinIva)
    {
        double iva = precioSinIva * 0.21;
        double precioTotal = precioSinIva + iva;
        //return (precioSinIva + iva);
        return precioTotal;
    }
    
    public static double pedirPrecioSinIva()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cual es el precio SIN IVA? ");
        double precio = sc.nextDouble();
        return precio;
    }
    
    
}
