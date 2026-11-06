/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5circunferencia;

import java.util.Scanner;

/**
 * 5.	Programa que pren com a dada d'entrada un número que correspon a la longitud d'un radi
 * i ens escriu la longitud de la circumferència, l'àrea del cercle 
 * @author mabardaji
 */
public class Ex5Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.14;
        double radio, longitudCircun, areaCirculo;
        Scanner sc = new Scanner(System.in);
        //definir constante PI=3.14
        //Mostrar cual es el radio de circun?
        System.out.print("Cual es el radio de la circunferencia? ");
        //Esperar radio
        radio = sc.nextDouble();
        //Calcular longitudCircun = 2*PI*radio
        longitudCircun = 2 * PI * radio;
        //Calcilar areaCirculo = (PI*radio*radio)
        areaCirculo = PI*radio*radio;
        //Mostrar Longitud circunferencia es , longitudCircun
        System.out.println("La longitud es " + longitudCircun);
        //Mostrar areaCirculo
        System.out.println("La area es " + areaCirculo);
        
    }
    
}
