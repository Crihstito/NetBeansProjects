/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tam, i, num, pos=0;
        
        System.out.print("Digite el tamaño del arreglo: ");
        tam = leer.nextInt();
        
        int arreglo[] = new int[tam];
        
        System.out.println("Armando el arreglo: ");
        for(i=0 ; i<tam ; i++){
            System.out.print("Digite el elemento "+i+" del arreglo: ");
            arreglo[i] = leer.nextInt();
        }
        for(i=0 ; i<tam ; i++){
            System.out.print(arreglo[i]+" ");
        }
        
        System.out.print("\nDigite el elemento del arreglo que decea eliminar: ");
        num = leer.nextInt();
        
        for(i=0 ; i<=tam ; i++){
            if(arreglo[i] == num){
                pos=i;
                break;
            }
        }
        System.out.println("El numero a eliminar esta en la posicion: "+pos);
        for(i=pos; i<tam-1; i++){//0-1-2-3-4
            arreglo[i] = arreglo[i+1];
        }
        
        for(i=0 ; i<tam-1 ; i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
        
    }
    
}
