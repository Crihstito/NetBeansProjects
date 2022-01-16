
package Ordenamiento;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class MetodoBurbuja {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux=0, i;
        int arreglo[] = new int[5];
         
        System.out.println("Armando el arreglo: ");
        for(i=0 ; i<arreglo.length ; i++){
            System.out.print("Digite el elemento "+i+" del arreglo: ");
            arreglo[i] = leer.nextInt();
        }
        System.out.println("El arreglo introducido es: ");
        for(i=0 ; i<arreglo.length ; i++){
            System.out.print(arreglo[i]+" ");
        }        
        for(int j=0 ; j<arreglo.length-1  ; j++){
            for(i=0 ; i<arreglo.length-1 ; i++){ //5 4 2 8 6
                if(arreglo[i] > arreglo[i+1]){
                    aux = arreglo[i]; //aux = 5
                    arreglo[i] = arreglo[i+1]; //4 4 2 8 6 
                    arreglo[i+1] = aux; //4 5 2 8 6 
                }
            }
        }
        System.out.println("\nEl arreglo orednado es: ");
        for(i=0 ; i<arreglo.length ; i++){
            System.out.print(arreglo[i]+" ");
        }   
        System.out.println("");
        
        
        
    }
    
}
