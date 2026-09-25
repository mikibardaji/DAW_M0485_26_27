/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dineroentradacine;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class DineroEntradaCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int precioEntrada, diners, dineroRestante, totalEntradas;
        int preuEntradesTotal;
        double divisa;
        Scanner teclado = new Scanner(System.in);
        
        divisa = teclado.nextDouble();
        //            Inicio
        // Declaracion variables primitivas y del scanner
        //ENTRADA DATOS
        //     Mostrar “Quants diners tens?”
        System.out.println("Cuanto dinero tienes?");
        diners = teclado.nextInt();
        //     Esperar diners_cartera
        //     Mostrar “Quantes entrades has comprat?”
        System.out.println("Cuantas entradas has comprado");
        totalEntradas = teclado.nextInt();
        //     Esperar num_entrades
        //     Mostrar “Quant val una entrada?”
        System.out.println("Cuanto vale una entrada");
        //     Esperar preu_entrada
        precioEntrada = teclado.nextInt();
        // FIN ENTRADA DATOS
        //PROCESAR DATOS (CALCULO)
        //     Calcular preu_entrades_total = preu_entrada x num_entrades
        preuEntradesTotal = totalEntradas * precioEntrada;
        System.out.println("Las entradas te han valido " + preuEntradesTotal);
        //     Calcular diners_restants = diners_cartera - preu_entrades_total
        dineroRestante = diners - preuEntradesTotal;
        //     Mostrar “Et queden “ + diners_restants 
        System.out.println("Te queda " + dineroRestante + " euros para palomitas") ;
        //     FI
        
    }
    
}
