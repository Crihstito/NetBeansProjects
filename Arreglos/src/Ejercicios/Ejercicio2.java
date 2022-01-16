
package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        System.out.println("Digite los elementos del arreglo: ");
        for(int i=0 ; i<numeros.length ; i++){
            System.out.print("Digite el numero de la posicion "+(i+1)+": ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("\nLos numeros del arreglo son: ");
        for(int i:numeros){
            System.out.print(i+" ");
        }
        
        System.out.println("\nLos numeros del arreglo en oreden inverso son: ");    
        for(int i=numeros.length-1 ; i>=0 ; i--){
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");   
    }
    
}
