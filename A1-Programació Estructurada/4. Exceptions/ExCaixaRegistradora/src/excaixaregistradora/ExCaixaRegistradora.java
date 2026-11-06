/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excaixaregistradora;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExCaixaRegistradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String precioString;
        double precio=0,acumPrecio=0; 
        boolean precioCorrecto = true;
//        try
//                { //como quiero que salga del bucle, hago que conja todo el bucle
        do
            {
                try
                {
                System.out.print("Pon precio a registrar (0 para salir): ");
                precioString = sc.nextLine();
                precio = Double.parseDouble(precioString);
                if (precio!=0) 
                    {
                        acumPrecio = acumPrecio + precio;
                    }
//                else if (precio < 0) //si no valiera el negativo
//                {
//                    System.out.println("No se puede poner negativo");
//                }
                    else if (precio==0)
                    {
                        System.out.println("Saliendo..");
                        //activar booleano para salir precioCorrecto = false;
                    }
                }
                catch (NumberFormatException ex)
                {
                    System.out.println("Has introducido caracteres no validos");
                    precioCorrecto = false;
                    //en lugar de boolean pongo precio = 0
                }
            }while(precio!=0 && precioCorrecto==true);
//        } para que salga directamente del bucle
//                catch (NumberFormatException ex)
//                {
//                    System.out.println("Has introducido caracteres no validos");
//                    precioCorrecto = false;
//                    //en lugar de boolean pongo precio = 0
//                }
        System.out.println("Tu compra ha subido... " + acumPrecio);
    }
    
}
