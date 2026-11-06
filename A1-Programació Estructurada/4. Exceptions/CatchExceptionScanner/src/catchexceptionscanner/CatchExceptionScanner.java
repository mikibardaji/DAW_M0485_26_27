/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catchexceptionscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CatchExceptionScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0, resultado=0;
        
        try{
            System.out.print("Introduce numero: ");
            numero = sc.nextInt();
            resultado = numero + 2;
            }
        catch(InputMismatchException ex)
            {
                System.out.println("No has puesto un valor entero");
            }
        
        
        System.out.println("El resultado es " + resultado);
        // Pedir un numero
        //sumarle 2 al numero
        //mostrar el resultado
        
        //ejecutarlo una vez poniendo cualquier numero (ejecución)
        //ejecutarlo una vez poniendo la letra a
        //pones el bloque try catch y dentro del catch 
        //avisar al usuario que no ha puesto un numero
    }
    
}
