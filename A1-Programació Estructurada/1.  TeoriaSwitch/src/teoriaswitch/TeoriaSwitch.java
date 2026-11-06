/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaswitch;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes, numDies;
        String mesTexto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("En quin mes estas?");
        mes = teclado.nextInt();
        
        switch(mes)
        {
            case 1:
                mesTexto = "Enero";
                numDies = 31;
                break;
            case 2:
                mesTexto ="Febrero";
                numDies = 28;
                break;                
            case 3:
                mesTexto ="Marzo";
                break;                
            case 4:
                mesTexto ="Abril";
                break;                
            case 5:
                mesTexto ="Mayo";
                break;                
            case 6:
                mesTexto ="Junio";
                break;                
            case 7:
                mesTexto ="Julio";
                break;                
            case 8:
                mesTexto ="Agosto";
                break;                
            case 9:
                mesTexto ="Setiembre";
                break;                
            case 10:
                mesTexto ="Octubre";
                break; 
            default:
                mesTexto = "Mes inexistente";
                break;
        }
        System.out.println("Estas en el mes de " + mesTexto);
        
        switch(mes)
        {
            case 1:
            case 3:
            case 5:
            case 7:              
            case 8: 
            case 10:                
            case 12:
                numDies = 31;
                break;
            case 2:
                numDies = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:                
                numDies = 30;
                break;
            default:
                numDies=0;
                break;
        }
        
        System.out.println("Tu mes tiene " + numDies + " dias");
        
    }
    
}
