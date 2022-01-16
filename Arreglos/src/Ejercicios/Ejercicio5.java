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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] tabla1,tabla2,tabla3;
        int num,i,j;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamano de las tablas: "));
        
        tabla1 = new int[num];
        tabla2 = new int[num];
        tabla3 = new int[num*2];
        
        System.out.println("Armando la tabla 1");
        for(i=0 ; i<num ; i++){
            System.out.print("Digite los elementos de la tabla 1: ");
            tabla1[i] = entrada.nextInt();
        }
        System.out.println("Armando la tabla 2");
        for(i=0 ; i<num ; i++){
            System.out.print("Digite los elementos de la tabla 2: ");
            tabla2[i] = entrada.nextInt();
        }
        i=0;
        j=0;
        while(i<num){
            for(int k=0 ; k<3 ; k++){
                tabla3[j] = tabla1[i+k]; 
                j++;
            }
            for(int l=0 ; l<3 ; l++){
                tabla3[j] = tabla2[i+l];
                j++;
            }
            i+=3;   
        }

        System.out.println("La combinacion de las tablas es: ");
        for(i=0 ; i<num*2 ; i++){
            System.out.print(tabla3[i]+" ");
        }
        System.out.println("");
            
    }
    
}
