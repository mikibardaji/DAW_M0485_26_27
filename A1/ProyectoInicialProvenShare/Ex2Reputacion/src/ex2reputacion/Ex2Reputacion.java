/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2reputacion;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2Reputacion {

    /**
     * A ProvenShare el sistema de valoració i 
     * reputació funciona mitjançant estrelles. 
     * Heu de programar un sistema que demani a l'usuari les tres 
     * primeres notes numèriques senceres rebudes en el seu perfil per part d'altres companys. 
     * El programa ha de calcular la nota mitjana final de l'estudiant i 
     * mostrar-la per pantalla, assegurant-se de conservar els valors decimals del resultat.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valoracion1, valoracion2, valoracion3;
        double valoracionUsuario;
        System.out.print("Dime tu primera valoracion? ");
        valoracion1 = sc.nextInt();
        System.out.print("Dime tu segunda valoracion? ");
        valoracion2 = sc.nextInt();
        System.out.print("Dime tu tercera valoracion? ");
        valoracion3 = sc.nextInt();
        
        //opc1
        //valoacionUsuario = (double) (valoracion1+valoracion2+valoracion3)/3;
        
        //opc2
        double total = valoracion1+valoracion2+valoracion3;
        valoracionUsuario = total/3;
        System.out.println("Tu valoracion es " + valoracionUsuario);
    }
    
}
