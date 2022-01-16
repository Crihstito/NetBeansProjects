
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num[] = new int[5];
        int i,aux;
        
        System.out.println("'Armando el arreglo'");
        for(i=0 ; i<5 ; i++){
            System.out.print("Digite el elemento "+i+" del arreglo: ");
            num[i] = leer.nextInt();
        }
        System.out.println("El arreglo introducido es: ");
        for(i=0 ; i<5 ; i++){
            System.out.print(num[i]+" ");
        }
        
        aux = num[4];       
        for(i=3 ; i>=0 ; i--){
            num[i+1] = num[i];
        }
        num[0] = aux;
        
        System.out.println("\nEl arreglo moviendo una pocicion es: ");
        for(i=0 ; i<5 ; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        
        
        
    }
    
}
