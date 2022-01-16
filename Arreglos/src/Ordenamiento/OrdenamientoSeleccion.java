/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux=0, i, tam, min;
        
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
        for(i=0 ; i<tam ; i++){ //4 5 8 9 7
            min = i; //4
            for(int j=i+1 ; j<tam ; j++){  //j = [5]
               if(arreglo[j]<arreglo[min]){ //<9  si
                   min = j; // 4
               }
            }
            aux = arreglo[i];//9
            arreglo[i] = arreglo[min];//4 5 8 7 9
            arreglo[min] = aux; // 4 5 8 7 9
        }
        
        System.out.println("\nEl arreglo ordenado es: ");
        for(i=0 ; i<tam ; i++){
            System.out.print(arreglo[i]+" ");
        }   
 
        System.out.println("");
        
    
    }
}
