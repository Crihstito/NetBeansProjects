
package Ejercicios;

import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tam, i, pos=0,j=0, k=0;
        
        System.out.print("Digite el tamaño del arreglo: ");
        tam = leer.nextInt();
        
        int arreglo[] = new int[tam];
        int pares[] = new int[tam];
        int impares[] = new int[tam];
        
        System.out.println("Armando el arreglo: ");
        for(i=0 ; i<tam ; i++){
            System.out.print("Digite el elemento "+i+" del arreglo: ");
            arreglo[i] = leer.nextInt();
        }
        System.out.println("El arreglo introducido es: ");
        for(i=0 ; i<tam ; i++){
            System.out.print(arreglo[i]+" ");
        }

        for(i=0 ; i<tam ; i++){
            if(arreglo[i]%2 == 0){
                pares[j] = arreglo[i];
                j++;
            }
            else{
                impares[k] = arreglo[i];
                k++;
            }
        }
        
        System.out.println("\nEl arreglo tiene los siguientes numeros pares: ");
        for(i=0 ; i<j ; i++){
            System.out.print(pares[i]+" ");
        }
        System.out.println("");        
        
        System.out.println("\nEl arreglo tiene los siguientes numeros impares: ");
        for(i=0 ; i<k ; i++){
            System.out.print(impares[i]+" ");
        }
        System.out.println("");        
        
        
    }
    
}
