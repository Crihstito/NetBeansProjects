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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] num = new float[5];
        float mediaN, mediaP, sumN=0, sumP=0;
        int contN=0, contP=0, contC=0;
        
        System.out.println("Guardando los numeros del arreglo ");
        for(int i=0 ; i<num.length ; i++){
            System.out.print("Digite el numero "+(i+1)+" del arreglo: ");
            num[i] = entrada.nextInt();
        }
        
        for(int i=0 ; i<num.length ; i++){
            if(num[i] > 0){
                sumP += num[i];
                contP++;
            }
            else if(num[i] < 0){
                sumN += num[i];
                contN++;
            }
            else{
                contC++;
            }
        }
        if(contP == 0){
            System.out.println("No se introducieron numero positivos");
        }
        else{
            mediaP = sumP/contP;
            System.out.println("El promedio de los positivos es: "+mediaP);
        }
        if(contN == 0){
            System.out.println("No se introducieron numero negativos");
        }
        else{
            mediaN = sumN/contN;
            System.out.println("El promedio de los negativos es: "+mediaN);
        }
        if(contC == 0){
            System.out.println("No se introducieron ceros");
        }
        else{
            System.out.println("El total de los ceros es: "+contC);
        }
    }
    
}
