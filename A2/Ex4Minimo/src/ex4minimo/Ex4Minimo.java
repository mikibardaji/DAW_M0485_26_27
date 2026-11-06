/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4minimo;

/**
 *
 * @author mabardaji
 */
public class Ex4Minimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numA, numB, min;
        
        numA = LibreriasComunes.pedirNumeroUsuario("Introduce primer numero: ");
        numB = LibreriasComunes.pedirNumeroUsuario("Introduce segundo numero: ");
        
        min = minimo(numA,numB); //si tiene return ho tinc que recoolli
        
        System.out.println("El valor minimo es " + min);
    }
    
    
    public static int minimo(int a, int b)
    {
        int minimo;
        if (a<b)
        {
            minimo = a;
        //    return a;
        }
        else
        {
            minimo = b;
        //    return b;
        }
        
        return minimo;
    }
    
    /**
     * Pide un dato al usuario numerico
     * No lo devuelve hasta que sea un numero correcto
     * @return numero introducido por el usuario
     */
  /*  public static int pedirNumeroUsuario(String frase)
    {
        Scanner sc = new Scanner(System.in);
        int num=0;
        boolean numIncorrecto=false;
        do{
            try
            {
                System.out.print(frase);
                num = sc.nextInt();
                numIncorrecto=true;
            }
            catch(InputMismatchException ex)
            {
                System.out.println("No has puesto un valor numerico");
                numIncorrecto=false;
                sc.nextLine(); //limpiar buffer
            }
        }while (numIncorrecto==false);
        
        return num;
    }*/
}
