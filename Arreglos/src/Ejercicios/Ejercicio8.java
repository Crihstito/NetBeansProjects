/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CRIS_
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int num,pos;
        
        System.out.println("Armando el arreglo: ");
        for(int i=0 ; i<8 ; i++){
            System.out.print("Digite el elemento "+(i)+" de la tabla: ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("El arreglo introducido es: ");
        for(int i=0 ; i<8 ; i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("\nDigite el numero que decea introducir: ");
        num = entrada.nextInt();
        do{
            System.out.println("Digite la posicion en el arreglo para introducir su numero: ");
            pos = entrada.nextInt();            
        }while(pos<0 || pos>10);
        for(int i=7 ; i>=pos ; i--){
            arreglo[i+1] = arreglo[i];
        }
        arreglo[pos] = num;
        System.out.println("El nuevo arreglo es: ");
        for( int i=0 ; i<10 ; i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
            
        
    }
    
}
