/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        System.out.println("Digite los elementos del arreglo: ");
        for(int i=0 ; i<numeros.length ; i++){
            System.out.print((i+1)+". Digite un caracter: ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("\nLos caracteres del arreglo son: ");
        for(int i:numeros){
            System.out.print(i+" ");
            if(i == numeros.length-1){
                System.out.println(numeros[i]+".");
            }
            else{
                System.out.print(numeros[i]+",");
            }
        }
        System.out.println("\n");
        
        
        
    }
}
