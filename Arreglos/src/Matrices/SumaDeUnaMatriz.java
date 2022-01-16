
package Matrices;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class SumaDeUnaMatriz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][], filas, columnas, sumC=0, sumF=0;
        
        System.out.print("Digite las el numero de filas de la matriz: ");
        filas = leer.nextInt();
        System.out.print("Digite el numero de columnas de la matriz: ");
        columnas = leer.nextInt();
        
        matriz = new int[filas][columnas];
        
        for(int i=0 ; i<filas ; i++){
            for(int j=0 ; j<columnas ; j++){
                System.out.print("Matriz1 ["+i+"]["+j+"]: ");  
                matriz[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("La matriz introducida es: ");
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        
        //sumamos las filas
        for(int i=0 ; i<filas ; i++){
            sumF=0;
            for(int j=0 ; j<columnas ; j++){
                sumF += matriz[i][j];
            }
            System.out.println("La suma de la fila "+i+" es: "+sumF);
        }
        for(int j=0 ; j<columnas ; j++){
            sumC=0;
            for(int i=0 ; i<filas ; i++){
                sumC += matriz[i][j];
            }
            System.out.println("La suma de la columna "+j+" es: "+sumC);
        }ñ
        
        
        


        
    }
}
