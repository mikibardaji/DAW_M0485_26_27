/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrapapertisoramodular;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PedraPaperTisoraModular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("eleccion Maquina " + eleccionMaquina());
        //System.out.println("actualizador contador 0 " + actualizarContador(0));
        //mostrarMarcador(5, 7);
        //System.out.println("Ganador (1,1)" + guanyador(1, 0));
        imprimirEleccion(2, false);
    }
    
    public static boolean seguirJugando(int contJugador, int contMaquina)
    {
        boolean seguir=true;
        if (contJugador>=3 || contMaquina >=3)
        {
            seguir = false;
        }
//        else
//        {
//            seguir = true;
//        }
        return seguir;
    }
    
    public static void imprimirEleccion(int valorEscogido, boolean esJugador)
    {
        String quien;
        final int PIEDRA = 0;
        final int PAPEL = 1;
        final int TIJERA = 2;
        quien = esJugador ? "El jugador ha escogido " : "La maquina ha escogido ";
        /*if (esJugador==true)
        {
        quien = "El jugador ";
        }
        else
        {
        quien = "La maquina ";
        }*/
        switch (valorEscogido) {
            case PIEDRA:
                //quien = quien + " PIEDRA";
                System.out.println(quien + " Piedra");
                break;
            case PAPEL:
                System.out.println(quien + " Papel");
                break;
        //System.out.println(quien);
            case TIJERA:
                System.out.println(quien + " Tijera");
                break;
            default:
                break;
        }
    }
    
    public static int guanyador(int jugadaUsuario, int jugadaMaquina)
    { /*1 ganador jugador , 2 maquina y 0 empate)*/
        int resultado;
        final int PIEDRA = 0;
        final int PAPEL = 1;
        final int TIJERA = 2;
        if (jugadaUsuario==PIEDRA && jugadaMaquina==PAPEL)
        {
            resultado = 2;
        }
        else if (jugadaUsuario==PAPEL && jugadaMaquina==TIJERA)
        {
            resultado = 2;
        }
        else if (jugadaUsuario==TIJERA && jugadaMaquina==PIEDRA)
        {
            resultado = 2;
        }
        else if (jugadaUsuario == jugadaMaquina)
        {
            resultado = 0;
        }
        else
        {
            resultado = 1;
        }
        return resultado;
            
    }
    public static int eleccionUsuario()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        do
        {
            System.out.println("Elige Piedra(0), Papel(1) o Tijera(2): ");
            num = sc.nextInt();
            if (num<0 || num>2)
            {
                System.out.println("Numero no valido -> " + num);
            }
        }while(num<0 || num>2);
        return  num;
    }
    
    public static int eleccionMaquina()
    {
        Random rd = new Random();
        int numMaquina = rd.nextInt(0, 3);
        return numMaquina;
    }

    public static int actualizarContador(int contador)
    {
        contador++;
        return contador;
    }
    
    public static void mostrarMarcador(int puntosUsuario, int puntosMaquina)
    {
        System.out.println("*** MARCADOR ACTUAL ***");
        System.out.println("*   Usuario: " + puntosUsuario + "        *");
        System.out.println("*   Maquina: " + puntosMaquina + "        *");
        System.out.println("***********************");
    }
            
}

