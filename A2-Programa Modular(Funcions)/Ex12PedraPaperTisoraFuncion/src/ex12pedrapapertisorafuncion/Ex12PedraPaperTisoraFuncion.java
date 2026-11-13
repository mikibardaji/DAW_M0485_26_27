/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12pedrapapertisorafuncion;

/**
 * Funciones Pedra-Paper-Tisora


    • eleccionUsuario, pedir un numero entre 0 y 2 y devolver  (solo devuelve si el valor es entre 0 y 2). NO HAY TRADUCCION DE 0 ,1 ,2 A PIEDRA PAPEL O TIJERA
    • eleccionMaquina,retorna un numero aleatori entre 0 i 2. (no valida perque el random el fa la maquina) NO HAY TRADUCCION DE 0 ,1 ,2 A PIEDRA PAPEL O TIJERA
    • ActualizarContador, aumenta el contador de Entrada, en 1 y lo retorna (de quien es el contador, lo harà el main) 
    • MostrarMarcador
        ? puntusUsuario
        ? puntosMaquina
            ? mostrar por pantalla el marcador actual
    • guanyador , determina quien ha ganado 
        ? jugadaUsuario (int) y jugadaMaquina (int)
        ? devuelve un entero (1- Ha ganado el jugador, 2 – La maquina, 0 – Empate)
        ? NO HAY TRADUCCION DE 0 ,1 ,2 A PIEDRA PAPEL O TIJERA
    • Imprimir eleccion, mostrar por pantalla la eleccion del jugador/maquina
        ? Entrada valor escogido
        ? Valor que me indique si es la maquina o el jugador (int, boolean)
            ? mostrar por consola la frase adecuada
    • SeguirJugando a partir de los datos de puntuacion dice si se sigue jugando o no , se sigue jugando mientras nadie haya llegado a 3 
        ? contadorUsuario
        ? contadorMaquina
        ? retorna boolean (true. Sigues, false, no sigues) 
 * @author mabardaji
 */
public class Ex12PedraPaperTisoraFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        mostrarMarcador(4, 7);
        
        mostrarMarcador(14, 17);

    }
    
    public static void mostrarMarcador(int puntosMaquina, int puntosJugador)
    {
        System.out.println("Puntos Maquina: " + puntosMaquina);
        System.out.println("Puntos Jugador: " + puntosJugador);
    }
}
