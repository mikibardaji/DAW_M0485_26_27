/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7rectangulo;

/**
 *
 * @author mabardaji
 */
public class Ex7Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ancho, alto, perimetro, area;
        
        ancho = LibreriasComunes.pedirNumeroUsuarioDoublePositivo("Pon el ancho del rectangulo: ");
        alto = LibreriasComunes.pedirNumeroUsuarioDoublePositivo("Pon el alto del rectangulo: ");
        
        perimetro = perimetroRectangulo(ancho, alto);
        area = areaRectangulo(ancho, alto);
        
        //sortida
        mostrarSalida(perimetro, area);
    }
    
    public static void mostrarSalida(double perimetro, double area)
    {
        System.out.println("Perimetro rectangulo: " + perimetro);
        System.out.println("Area rectangulo: " + area);
    }
    
    
    public static double perimetroRectangulo(double ancho, double alto) 
    { //si una funció fa calculs no te souts ni inputs
        //no te entrada de dades per part usuari
        double perimetro = 2 * ancho + 2 * alto;
        return perimetro;
    }
    
    
    public static double areaRectangulo(double ancho, double alto)
    {
        double area;
        area = ancho * alto;
        return area;
    }
}
