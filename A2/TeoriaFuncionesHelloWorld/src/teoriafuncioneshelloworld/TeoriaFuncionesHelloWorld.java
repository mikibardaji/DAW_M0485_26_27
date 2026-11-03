/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriafuncioneshelloworld;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaFuncionesHelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad,edadDoblada;
        System.out.println("Estoy en el main... ");
        System.out.print("(Main) Como te llamas? ");
        nombre = sc.nextLine();
        System.out.print("(Main) Que edad tienes? ");
        edad = sc.nextInt();      
        imprimeHolaMundo();
        //imprimeHolaMundo();
        
        saludarPersona(nombre);
        
        //saludarPersona("Roser Salietti");
        //saludarPersona(5); error no puede convertir 5 a String        
        saludarPersonaEdad(nombre, edad);
        //saludarPersonaEdad("Isabel Miralves", 35);
        
        edadDoblada = doblarEdad(edad);
        
        System.out.println("(Main) Tu edad de aqui al doble de años serà " + edadDoblada);
        
        System.out.println("Fin de main");  
    }
    
    //definim funcions
    public static void imprimeHolaMundo() //sin parametros entrada
    {
        System.out.println("Hello World"); 
        System.out.println("Esto es una función");
    }
    
    public static void saludarPersona(String nom) //con parametros de entrada
    {
        int edadComputadora = 21;   
        System.out.println("Hola " + nom + " que tal estas? ");
        System.out.println("Jo tinc " + edadComputadora + " anys ");
    }
    
    /**
     * saludarPersonaEdad : Funció que saluda a la persona
     * li diu la seva edad i li comenta que la maquina te 21
     * @param nom Nom de la persona a saludar
     * @param age Edad de la persona a saludar
     */
    
    public static void saludarPersonaEdad(String nom, int age) //con parametros y documentao
    {
        int edadComputadora = 21, doble;   
        System.out.println("Hola " + nom + " que tal estas? ");
        System.out.println("Tu tens " + age + " anys. ");
        doble = doblarEdad(age);
        System.out.println("El doble de tu edad es " + doble);
        System.out.println("Jo tinc " + edadComputadora + " anys ");
    }    
    
    /**
     * Función que dobla la edad del usuario
     * @param age del usuario
     * @return edad doblada
     */
    public static int doblarEdad(int age)
    {
        int dobleEdad = age*2;
        return dobleEdad;
    }
}
