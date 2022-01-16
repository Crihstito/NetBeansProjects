
package Matrices;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class DefinicionMatriz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz [][], filas, columnas;
        
        System.out.print("Digite el numero de filas de su matriz: ");
        filas = leer.nextInt();
        System.out.print("Digite el numero de columnas de su matriz: ");
        columnas = leer.nextInt();
        
        matriz = new int [filas][columnas];
        
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print("Matriz ["+i+"]["+j+"]: ");  
                matriz[i][j] = leer.nextInt();
            }
        }
        
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        
        
    }
}
