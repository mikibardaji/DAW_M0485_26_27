/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvalidarpassword;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExValidarPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String PASSWORD_OK = "admin123";
        int intentos=0;
        String password;
       
        do{
            System.out.print("Cual es tu password? ");
            password = sc.nextLine();
            //actualizo contador
            intentos++;
//            if (password.equals(PASSWORD_OK))
//            {
//                System.out.println("Password correcto");
//            }
//            else
            if (!password.equals(PASSWORD_OK))
            {
                System.out.println("Password incorrecto");
                System.out.println("Recuerda que al tercer intento bloquea");
            }
        }while(!password.equals(PASSWORD_OK) && intentos < 3);
        
        if (!password.equals(PASSWORD_OK))
        {
            System.out.println("Cuenta bloqueada");
        }
        else
        {
            System.out.println("Password correcto");
        }
        
    }
    
}
