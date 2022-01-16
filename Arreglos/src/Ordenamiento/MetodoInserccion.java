
package Ordenamiento;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class MetodoInserccion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux=0, i, tam, pos;
        
        System.out.print("Digite el tamaño del arreglo: ");
        tam = leer.nextInt();
        int arreglo[] = new int[tam];
        
        System.out.println("Armando el arreglo: ");
        for(i=0 ; i<arreglo.length ; i++){
            System.out.print("Digite el elemento "+i+" del arreglo: ");
            arreglo[i] = leer.nextInt();
        }
        System.out.println("El arreglo introducido es: ");
        for(i=0 ; i<arreglo.length ; i++){
            System.out.print(arreglo[i]+" ");
        }        
        for(i=0 ; i<arreglo.length ; i++){ //4 5 8 9 7
            aux = arreglo[i];
            for(pos=i ; pos>0 && (arreglo[pos-1]>aux) ; pos--){
                arreglo[pos] = arreglo[pos-1];
            }
            arreglo[pos] = aux;
        }
        System.out.println("\nEl arreglo ordenado es: ");
        for(i=0 ; i<arreglo.length ; i++){
            System.out.print(arreglo[i]+" ");
        }   
        System.out.println("\nEl arreglo en orden desendente es: ");
        for(i=arreglo.length-1 ; i>=0 ; i--){
            System.out.print(arreglo[i]+" ");
        }   
        System.out.println("");
        
        
    }
    
}
