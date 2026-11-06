/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex31al200;

/**
 *
 * @author mabardaji
 */
public class Ex31al200 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int i;
        for (i = 1; i <= 200; i++) 
            {
                System.out.println(i);
            }
        
        i=1;
        System.out.println("while");
        do
            {
                System.out.println(i);
                i += 1;
            }while(i<=200);
    }
    
}
