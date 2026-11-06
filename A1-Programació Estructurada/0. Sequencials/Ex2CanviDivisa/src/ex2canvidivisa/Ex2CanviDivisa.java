/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2canvidivisa;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2CanviDivisa {

    /**
     * Programa que a partir dels diners que té el usuari, i preguntant el canvi de divisa (1,10 X)
        i t’ha d’informar quants diners d’aquell país té.
     */
    public static void main(String[] args) {
        //declaració variables
        double montonDineroTienes, divisa, cambioDivisa;
        Scanner lector = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Introduce monton dinero que tienes? ");
        montonDineroTienes = lector.nextDouble();
        System.out.print("Precio divisa a cambiar? "); //ln es para saltar de linea
        divisa = lector.nextDouble();
        //fin entrada de datos
        //procesar Datos 
        cambioDivisa = montonDineroTienes * divisa;
        //fin procesar Datos
        //salida programa 
        System.out.println("En la nueva moneda tendras " + 
                cambioDivisa + " monedas para gastar... ");
        
    }
    
}
