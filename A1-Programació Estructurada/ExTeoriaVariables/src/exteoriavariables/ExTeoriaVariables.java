/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exteoriavariables;

/**
 *
 * @author mabardaji
 */
public class ExTeoriaVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, multi=2;
        //declaracio constants , QUE NO CANVIEN MAI
        //nomenclatura es fiquen el seu nom amb majuscules
        final int MAJOREDAD = 18;
        double numDecimal; //float
        char letra;
        boolean cierto; 
        num = 3;
        System.out.println("num -> " + num);
        num = 5;
        System.out.println("num -> " + num);
        num = num +4;
        //num += 4;
        System.out.println("num -> " + num);
        //num = num*multi;
        num *= multi;
        System.out.println("num -> " + num);
        numDecimal = 2;
        System.out.println("numDecimal -> " + numDecimal);
        letra = 'a';
        System.out.println("letra -> " + letra);
        letra = 89;
        System.out.println("letra -> " + letra);
        cierto = 5 < 7;
        System.out.println("cierto -> " + cierto);
        cierto = 5<7 && 3<2; //AND es cierto si los DOS SON CIERTOS
        System.out.println("cierto AND -> " + cierto);
        cierto = 5<7 || 3<2; //OR es cierto si alguno de los dos es cierto
        System.out.println("cierto OR -> " + cierto);
        System.out.println("MAJOREDAD " + MAJOREDAD);
//        MAJOREDAD =19;
//        System.out.println("MAJOREDAD " + MAJOREDAD);
        cierto = num >= MAJOREDAD;
        System.out.println("num es mayor de edad? " + cierto);
    }
    
}
