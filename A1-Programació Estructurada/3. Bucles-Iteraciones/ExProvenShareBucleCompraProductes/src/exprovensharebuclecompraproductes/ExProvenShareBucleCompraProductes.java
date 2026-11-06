/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exprovensharebuclecompraproductes;

import java.util.Scanner;

/**
 * El programa ha de funcionar de la següent manera:

Entrada de dades: Un bucle demana el producte que es vol comprar i el seu preu.
Continuïtat: Després d'introduir-lo, demana si es volen contractar més serveis (SÍ/NO).
Si es respon SÍ: S'afegeixen més productes.
Si es respon NO: Se surt del bucle.
Sortida: En sortir, el programa mostra:
El total de diners gastats (acumulat).
La quantitat total de productes comprats.
 * @author mabardaji
 */
public class ExProvenShareBucleCompraProductes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio, sumaTotal=0,ingreso, saldo=500; //saldo
        int productosComprados = 0, opcio;
        String nombre, seguir;
        do
        {
            System.out.println("Saldo disponible: " + saldo);
            System.out.println("1.- Ingressar diners");
            System.out.println("2.- Comprar producte");
            System.out.println("3.- Sortir");            
            System.out.print("Quina opcio vols: ");
            opcio = sc.nextInt();
            
            switch(opcio)
            {
                case 1:
                    System.out.println("Cuanto quieres ingresar");
                    ingreso = sc.nextDouble();
                    saldo += ingreso;
                    System.out.println("Augmentant el saldo ... ");
                    break;
                case 2:
                    sc.nextLine(); //llimpiar el enter (buffer) del nextint
                    System.out.print("Que producto quieres? ");
                    nombre = sc.nextLine();
                    System.out.print("Que precio tiene? ");
                    precio = sc.nextDouble();
                    if (precio<= saldo)
                    {
                        sumaTotal += precio;
                        productosComprados++;
                        saldo -= precio;
                        System.out.println("Producto comprado");
                    }
                    else
                    {
                        System.out.println("No tienes suficiente saldo");
                    }
                    
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Saliendo del programa... ");
                    break;
                default:
                    break;
            }
            
            //System.out.println("Vols algun producte més(SI/NO)");
            //seguir = sc.nextLine();
        //}while(!seguir.equalsIgnoreCase("NO"));
        }while(opcio!=3);
        
        System.out.println("Total gastado: " + sumaTotal);
        System.out.println("Productos comprados: " + productosComprados);
    }
    
}
