
package Matrices;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class Transpuesta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz [][], matrizT[][], filas, columnas, S;
        boolean cuadrada=false, sime=true;
        
        
        System.out.println("*Transpuesta de una matriz*");

        System.out.print("Digite el numero de filas de su matriz: ");
        filas = leer.nextInt();
        System.out.print("Digite el numero de columnas de su matriz: ");
        columnas = leer.nextInt();
        
        matriz = new int [filas][columnas];
        matrizT = new int [columnas][filas];
        
        System.out.println("Digite los elementos de la matriz");
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print("Matriz1 ["+i+"]["+j+"]: ");  
                matriz[i][j] = leer.nextInt();
            }
        }

        for(int i=0 ; i<columnas ; i++){
            for(int j=0 ; j<filas ; j++){
                matrizT[i][j] = matriz[j][i];
            }
        }
        
        System.out.println("La matriz ontenida es: ");
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        
        System.out.println("La transpuesta de la matriz es: ");
        for(int i=0 ; i<columnas ; i++){//Filas
            for(int j=0 ; j<filas ; j++){//Columnas
                System.out.print(matrizT[i][j]+"  ");
            }
            System.out.println("");
        }
        
        
        
    }
    
}
