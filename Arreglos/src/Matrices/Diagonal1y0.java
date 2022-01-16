/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class Diagonal1y0 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][], filas, columnas;
        
        System.out.print("Digite las el numero de filas de la matriz: ");
        filas = leer.nextInt();
        System.out.print("Digite el numero de columnas de la matriz: ");
        columnas = leer.nextInt();
        
        matriz = new int[filas][columnas];
        
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                if(i==j){
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
            }
        }
        
        System.out.println("La digonal principal quedaria igual a: ");
        for(int i=0 ; i<filas ; i++){//Filas
            for(int j=0 ; j<columnas ; j++){//Columnas
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        
        
        
    }
    
}
