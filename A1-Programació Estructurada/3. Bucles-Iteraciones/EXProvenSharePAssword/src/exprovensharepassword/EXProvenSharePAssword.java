/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exprovensharepassword;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class EXProvenSharePAssword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       final String DOMINIO_CORREO = "@proven.cat";
       final String PASSWORD_OK = "1234";
       String correo;
       String contrasenya;
       int contadorIntentos=0;
       boolean correctoPassword=false, correctoMail=false;
       
       do
       {
           System.out.print("Introduce correo? ");
           correo = scan.next();
           if (correo.endsWith(DOMINIO_CORREO))
           {
               System.out.println("correo correcto");
               correctoMail = true;               
           }
           else
           {
               System.out.println("Correo incorrecto");
               //correctoMail = false;     
           }
       }while(correctoMail==false);
       //Si salgo el mail es correcto
       
       do
       {
           System.out.print("Introduce password? ");
           contrasenya = scan.next();
           if (contrasenya.equalsIgnoreCase(PASSWORD_OK))
           {
               System.out.println("Login ok");
               correctoPassword=true;
           }
           else
           {
               System.out.println("Login ko");
               contadorIntentos++;
               System.out.println("Llevas " + contadorIntentos + " intentos");
           }
       }while(correctoPassword==false && contadorIntentos<3);
       
       if(contadorIntentos>=3)
       {
           System.out.println("Usuario bloqueado llama al administrador");
       }
       
    }
    
}
