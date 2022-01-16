
package Matrices;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz [][],matrizT[][], filas, columnas;
        boolean cuadrada=false, sime=true;
        
        System.out.print("Digite el numero de filas de su matriz: ");
        filas = leer.nextInt();
        System.out.print("Digite el numero de columnas de su matriz: ");
        columnas = leer.nextInt();
        
        matriz = new int [filas][columnas];
        matrizT = new int [columnas][filas];
        
        if(filas==columnas){
            cuadrada = true;
        }
        
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print("Matriz ["+i+"]["+j+"]: ");  
                matriz[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("Matriz ordenada: ");
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("La matiz cambiada es: ");

        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columna          
                System.out.print(matriz[j][i]+"  ");
            }
            System.out.println("");
        }
        
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columna
                if(matriz[j][i] != matriz[i][j]){
                    sime = false;
                    break;
                }
            }
        }
        if(cuadrada == true && sime==true){
            System.out.println("La matriz si es simetrica");
        }
        else{
            System.out.println("La matriz no es simetrica");
        }

        
    }
}
