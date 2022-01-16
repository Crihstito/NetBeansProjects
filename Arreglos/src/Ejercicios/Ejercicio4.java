
package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[10];
        
        for(int i=0 ; i<num.length ; i++){
            System.out.print("Digite el numero en la posicion "+(i+1)+" del arreglo: ");
            num[i] = entrada.nextInt();
        }
        System.out.println("El arreglo mostrando uno y uno es igual a: ");
        for(int i=0 ; i<5 ; i++){
            System.out.print(num[i]+" ");
            System.out.print(num[(num.length-1)-i]+" ");
        }
        System.out.println("");
     
    }
    
}
