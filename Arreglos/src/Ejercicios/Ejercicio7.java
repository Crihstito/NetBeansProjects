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
public class Ejercicio7 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,i;
        boolean indC = false, indD=false;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamano de las tablas: "));
        
        int tabla[] = new int[num];

        
        System.out.println("Armando el arreglo");
        for(i=0 ; i<num ; i++){
            System.out.print("Digite los elemento "+i+ " de la tabla : ");
            tabla[i] = entrada.nextInt();
        }
        for(i=0; i<num-1 ; i++){
            if(tabla[i]>tabla[(i+1)]){
                indD = true;
            }
            if(tabla[i]<tabla[(i+1)]){
                indC = true;
            }
        }
        if(indC==true && indD==true){
            System.out.println("Los numeros estan desordenados");
        }
        if(indC==true && indD==false){
            System.out.println("Los numeros estan en orden creciente");
        }
        if(indC==false && indD==true){
            System.out.println("Los numeros estan en orden decresiente");
        }
        if(indC==false && indD==false){
            System.out.println("Los numeros son iguales");
        }
        

    }
}
