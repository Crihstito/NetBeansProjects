
package Ejercicios;

import java.util.Scanner;
import javax.swing.SpringLayout;


public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int pos, tam, i, aux, rep=0;

        System.out.print("Digite el tamaño del arreglo: ");
        tam = leer.nextInt();
        
        int arreglo[] = new int[tam];
        
        for(i=0 ; i<tam ; i++){
            System.out.print("Digite el elemento "+i+" del arreglo: ");
            arreglo[i] = leer.nextInt();
        }
        System.out.println("El arreglo introducido es: ");
        for(i=0 ; i<tam ; i++){
            System.out.print(arreglo[i]+" ");
        }
        
        System.out.print("Digite el numero de posiciones que desea desplazar el arreglo: ");
        pos = leer.nextInt();
        
        while(rep<=pos){
            aux = arreglo[tam-1];       
            for(i=tam-2 ; i>=0 ; i--){
                arreglo[i+1] = arreglo[i];
            }
            arreglo[0] = aux;
            rep++;
        }
        
        System.out.println("\nEl arreglo desplazado es: ");
        for(i=0 ; i<tam ; i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
        
        
        
        
        
    }
    
    
}
