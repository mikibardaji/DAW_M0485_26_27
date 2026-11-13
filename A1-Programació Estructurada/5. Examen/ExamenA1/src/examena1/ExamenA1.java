/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examena1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExamenA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //temperatura();
        //maletas();
        repartoMonedas();
    }
    
    
    /*
    Anem a simular un joc d'endevinar el número de jugadors d'un equip per repartir-los un pot de 100 monedes d'or.
A l'inici del joc, el programa ha de generar un número aleatori de jugadors entre 0 i 20 (ambdós inclosos) i guardar-lo en una variable.
Tot seguit, anirà demanant a l'usuari quants jugadors creu que hi ha en aquell equip:
Si no l'encerta, el programa ha de mostrar un missatge indicant que no ha encertat i calcular quantes monedes (sense decimals) li tocarien a cada jugador segons el número que ha introduït l'usuari, per donar-li una pista, i tornar-li a demanar.
El programa s'acabarà quan l'usuari encerti el número exacte de participants que hi ha.
Has de capturar les excepcions que es puguin produir durant l'execució (n'hi ha almenys 2). Si salta una excepció, el programa no s'ha d'aturar: ha de mostrar un missatge d'error i tornar a demanar el nombre de participants. Quan simplement no s'encerti el número, no s'ha de llançar ni capturar cap excepció, només informar de l'error i continuar el joc.

    */
   
    public static void repartoMonedas()
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int jugMaquinas = rd.nextInt(0,21);
        int jugUsuario=-1;
        do
        {
            try
            {
                System.out.println("Cuantos jugadores crees que hay");
                jugUsuario = sc.nextInt();
                if (jugMaquinas == jugUsuario)
                {
                    System.out.println("Acertaste");
                }
                else if (jugMaquinas != jugUsuario)
                {
                    System.out.println("Has fallado");
                    //jugMaquinas = 0;
                    int monedas = 100 / jugMaquinas;
                    System.out.println("Repartiria " + monedas + " entre mis jugadores");
                }
            }
            catch(InputMismatchException ex)
            {
                System.out.println("No has puesto un numero");
            }
            catch(ArithmeticException ex)
            {
                sc.nextLine();
                System.out.println("Error no te puedo dividir por el numero de jugadores que he pensado");
            }
            
        }while(jugMaquinas != jugUsuario);
    }
    /*
    Els escàners dels aeroports pesen cada maleta abans d'embarcar-la per distribuir bé la càrrega de l'avió. Segons el pes en quilograms (kg) que introdueixi l'operari, la maleta es classifica en una d'aquestes categories:
Menys de 10 kg: Equipatge lleuger.
De 10 a 23 kg (ambdós inclosos): Equipatge estàndard.
Més de 23 kg: Sobrepès (requereix etiqueta especial).
Crea un programa que vagi demanant el pes de les maletes a l'usuari. En finalitzar, ha de mostrar quantes maletes de cada categoria s'han registrat.
El programa només acabarà quan es compleixi una d'aquestes dues condicions: que s'hagin registrat 5 maletes amb sobrepès o que s'hagi arribat a un total de 20 maletes introduides.

    */
    public static void maletas()
    {
        Scanner sc = new Scanner(System.in);
        int pesoMaleta, malLleuger = 0, malEstandar=0, malExces=0, contarMaletas=1;
        do
        {
            System.out.print("Pon el peso de la maleta:");
            pesoMaleta = sc.nextInt();
             if (pesoMaleta<10)
            {
                malLleuger++;
            }
            else if (pesoMaleta>= 10 && pesoMaleta <=23)
            {
                malEstandar++;
            }
            else
            {
                malExces++;
            }
            contarMaletas++;
        }while(malExces <5 && contarMaletas<=20);
        
        System.out.println("Final");
        System.out.println("Lleuger  : " + malLleuger);
        System.out.println("Estandard: " + malEstandar);
        System.out.println("Exces de pes: " + malExces);
    }
    
    
    /*
    Fes un programa que simuli el registre de temperatures màximes diàries d'una estació meteorol?gica durant un mes de 30 dies.
Per a cada dia, el programa generarà una temperatura aleat?ria entera entre -5 °C i 35 °C (ambdós inclosos) i mostrarà per pantalla un símbol segons la calor que faci:
Un asterisc * si fa fred (inferior a 10 °C).
Una N si la temperatura és normal (entre 10 °C i 25 °C, ambdós inclosos).
Una C si fa calor (superior a 25 °C).
A més, el programa haurà de comptar quants dies de cada tipus hi ha hagut i calcular la temperatura mitjana de tot el mes. Al finalitzar, haurà de mostrar el resum de dies, el recompte de cada categoria i la mitjana.

    */
    public static void temperatura()
    {
        Random rd = new Random();
        int fred=0,normal=0,calor=0, temperatura;
        double acumTemperatura = 0,dias;
        double mitjana;
        System.out.println("ddddd");
        for (dias = 0; dias < 30; dias++) {
            temperatura = rd.nextInt(-5, 36);
            acumTemperatura += temperatura;
            if (temperatura<10)
            {
                System.out.print("*");
                fred++;
            }
            else if (temperatura>= 10 && temperatura <=25)
            {
                System.out.print("N");
                normal++;
            }
            else
            {
                System.out.print("C");
                calor++;
            }
        }
        
        
        mitjana = (double) (acumTemperatura/dias);
        System.out.println(""); //saltar la linea
        System.out.println(acumTemperatura);
        System.out.println(dias);
        System.out.println("media: " + mitjana);
    }
}
