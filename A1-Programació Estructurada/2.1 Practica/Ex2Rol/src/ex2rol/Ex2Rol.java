/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2rol;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2Rol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fuerza,agilidad,inteligencia,destresa;
        int puntos, velocidad;
        
        System.out.print("Pon nivel de fuerza");
        fuerza = sc.nextInt();
        System.out.print("Pon nivel de agilidad");
        agilidad = sc.nextInt();
        System.out.print("Pon nivel de inteligencia");
        inteligencia = sc.nextInt();
        System.out.print("Pon nivel de destresa");
        destresa = sc.nextInt();
        
        puntos = fuerza + agilidad + inteligencia + destresa;
        
        if (puntos != 20)
        {
            System.out.println("Personatge no vàlid. Has de repartir exactament 20 punts.");
        }
        else
            {
                velocidad = (fuerza + agilidad) * 3 + (inteligencia + destresa) * 4;
                if (velocidad < 62 || velocidad > 75)
                {
                    System.out.println("Paràmetres fora de rang");
                }
                else if (velocidad < 65)
                {
                    System.out.println("El personatge és massa lent per lluitar.");
                }
                else if (velocidad>= 65 && velocidad <=70)
                {
                    System.out.println("Velocitat òptima per a la batalla.");
                }
                else if(velocidad > 70)
                {
                    System.out.println("Velocitat molt accelerada, potser que és cansi aviat");
                }

            }
        
    }
    
}
