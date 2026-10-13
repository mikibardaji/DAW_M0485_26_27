/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaiterativesbucles;

/**
 *
 * @author mabardaji
 */
public class TeoriaIterativesBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tabla de multiplicar amb les 3 instruccions
        final int TABLA_DEL_5 = 5;
        int contador=1;
        

        
        System.out.println("Tabla de multiplicar con el do-while");
        
        do
        {
            System.out.println(TABLA_DEL_5 + "x" + contador + "=" + (TABLA_DEL_5*contador) );
            ++contador; //aqui antes que contador++
        }while(contador<=10);
        
        contador=1;
        System.out.println("Tabla de multiplicar con el while");
        //while
        while(contador<=10)
        {
            //ha d'haver una instruccio que modifiqui una o omes varibales d
            //de les que surten a la condició
            System.out.println(TABLA_DEL_5 + "x" + contador + "=" + (TABLA_DEL_5*contador) );
//            contador += 1;
//            contador++;
            ++contador; //aqui antes que contador++
        }   
        
        System.out.println("Tabla de multiplicar con el for");
        System.out.println("En aquest exercici seria la mes idonea");
        System.out.println("Perqeu vull repetir el bucle un numero determinat de cops");
        //3 camps (inicialització;condició bucle;aumentarcontador
        //for (int i = 0; i < 10; i++) {
        for (contador=1; contador <= 10; contador++) 
            {
                System.out.println(TABLA_DEL_5 + "x" + contador + "=" + (TABLA_DEL_5*contador) );
            }
            
        }
        
}
