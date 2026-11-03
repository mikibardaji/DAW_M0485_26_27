/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catcharitmeticexception;

/**
 *
 * @author mabardaji
 */
public class CatchAritmeticException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=4;
        int b=0;
        int result=0;

        //ArithmeticException
        try //intenta ejecutar las lineas
        { 
            result = a/b; //throw Exception (ArithmeticException) 
            System.out.println("la división es " + result);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Has intentado dividir por 0 y no es posible");
        }
        
        System.out.println("Fin de programa");
        
        
    }
    
}
