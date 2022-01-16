
package Matrices;

import java.util.Scanner;

public class Suma2Matrices {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz [][], matriz2[][], matrizS[][], filas, columnas, S;
        boolean cuadrada=false, sime=true;
        
        
        System.out.println("*SUMA DE 2 MATRICES CUADRADAS*");

        System.out.print("Digite el numero de filas de su matriz: ");
        filas = leer.nextInt();
        System.out.print("Digite el numero de columnas de su matriz: ");
        columnas = leer.nextInt();
        
        matriz = new int [filas][columnas];
        matriz2 = new int [filas][columnas];
        matrizS = new int [filas][columnas];
                
        //Primera matriz
        System.out.println("Digite los elementos de la primera matriz");
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print("Matriz1 ["+i+"]["+j+"]: ");  
                matriz[i][j] = leer.nextInt();
            }
        }
        
        //Segunda Matriz
        System.out.println("Digite los elementos de la segunda matriz");
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print("Matriz2 ["+i+"]["+j+"]: ");  
                matriz2[i][j] = leer.nextInt();
            }
        }
        //Suma de Matrices
        for(int i=0 ; i<filas ; i++){
            for(int j=0 ; j<columnas ; j++){
                matrizS[i][j] = matriz[i][j]+matriz2[i][j];
            }
        }
        
        System.out.println("La primera matriz obtenida es: ");
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("La segunda jmatriz digitada fue: ");
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print(matriz2[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("La suma de las dos matrices es: ");
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print(matrizS[i][j]+"  ");
            }
            System.out.println("");
        }
        
        
    }
}
