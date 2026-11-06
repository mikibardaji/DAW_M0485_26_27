/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3saldodisponible;

import java.util.Scanner;

/**
 *
 * Un alumne vol contractar un servei de classes particulars de programació. 
 * El programa ha de sol·licitar els crèdits actuals que té l'estudiant, 
 * el preu en crèdits per hora d'aquell servei i el nombre total d'hores que vol contractar. 
 * S'ha de calcular el cost total de la reserva i comprovar, 
 * mitjançant operadors de comparació, si l'estudiant disposa de prou saldo. 
 * El resultat final ha de mostrar un valor booleà (true o false).

 */
public class Ex3SaldoDisponible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double credito, preciohora,  totalPrecioServicio;
        int horas;
        boolean cierto;
        // Mostrar "Dime tu credito total : "
        System.out.print("Dime tu credito : ");
        // Esperar credito
        credito = teclado.nextDouble();
        // Mostrar "Cuanto vale la hora : "
        System.out.print("Cuanto vale la hora : ");
        // Esperar preciohora
        preciohora = teclado.nextDouble();
        // Mostrar "Cuantas horas quieres contratar el servicio : "
        System.out.print("Cuantas horas quieres contratar el servicio : ");
        // Esperar horas
        horas = teclado.nextInt();
        // Calcular totalPrecioServicio = preciohora * horas
        totalPrecioServicio = preciohora * horas;
        // ttoal + credito = flase
        cierto = totalPrecioServicio <= credito;
        System.out.println("Puedes contratar el servicio? " + cierto);
        // < , >,  ==, <=, >=, != (diferente)
    }
    
}
