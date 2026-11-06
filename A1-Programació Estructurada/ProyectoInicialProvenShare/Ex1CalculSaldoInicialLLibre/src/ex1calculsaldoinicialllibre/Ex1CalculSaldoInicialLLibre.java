/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1calculsaldoinicialllibre;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1CalculSaldoInicialLLibre {

    /**
     * Un nou estudiant, es registra a la plataforma. 
     * L'objectiu és calcular quants crèdits totals té disponibles a la seva cartera sumant 
     * els crèdits inicials de benvinguda (300) i els crèdits que ha guanyat per oferir el 
     * seu primer servei al campus. Finalment, cal calcular i mostrar quin seria el seu saldo antes de la compra, 
     * preguntar quant val el llibre que vol comprar, i mostrar quant li quedarien al moneder.
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       final int CREDITOS_REGISTRO =300;
       double creditoGanado, creditoTotal, libro, saldoDespuesCompra;
       
        System.out.print("Cuantos creditos iniciales? ");
        creditoGanado = teclado.nextDouble();
        creditoTotal = creditoGanado + CREDITOS_REGISTRO;
        System.out.println("Antes de comprar el libro tienes " + creditoTotal);
        
        System.out.print("Cuanto vale el libro comprado? ");
        libro = teclado.nextDouble();
        saldoDespuesCompra = creditoTotal - libro;
        
        System.out.println("Te quedan " + saldoDespuesCompra);
    }
    
}
