/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8conversortemperaturas;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex8ConversorTemperaturas {

    /**
     * 8.	Programa que llegeixi un valor corresponent a una temperatura
     * en graus Fahrenheit i escriviu la temperatura en graus Celsius.
     */
    public static void main(String[] args) {
        //Declaración variables y Scanner
    double Fahren , Celsius, Kelvin;
    Scanner sc = new Scanner(System.in);
    final int FARENCELSIUSRESTAR = 32 ;
    final int FARENCELSIUSNUMERADOR = 5;
    final int FARENCELSIUSDIVISOR = 9;
    final int CELSIUSKELVIN = 273;
//Mostrar: “Escriba la temperatura en grados Fahrenheit”
    System.out.println("Escriba la temperatura en grados Fahrenheit");
//Esperar Fahren
    Fahren = sc.nextDouble ();
    
    Celsius = (double)(Fahren  - FARENCELSIUSRESTAR) * FARENCELSIUSNUMERADOR / FARENCELSIUSDIVISOR;
    System.out.println("La temperatura en Celsius es " + Celsius);
    Kelvin = Celsius + CELSIUSKELVIN;
    System.out.println("La temperatura en Kelvin es " + Kelvin);
    }
    
}
