/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class CarroMain {
    public static int CarroBarato(Carro coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for(int i=1 ; i<coches.length ; i++){
            if(coches[i].getPrecio()<precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        
        return indice;
        
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int num_carros, barato;
        
        System.out.println("Cuantos carros desea introducir: ");
        num_carros = entrada.nextInt();
        
        //Esto es un arrglos para agragar coches como objetos
        Carro coches[] = new Carro[num_carros]; 
        
        for(int i=0 ; i<num_carros ; i++){
            entrada.nextLine();
            System.out.println("Digite las caracteristicas del carro "+(i+1)+":");
            System.out.print("Cual es su marca? ");
            marca = entrada.nextLine();
            System.out.print("Cual es el modelo del coche? ");
            modelo = entrada.nextLine();
            System.out.print("Cual es su precio del coche");
            precio = entrada.nextFloat();
            
            coches[i] = new Carro(marca, modelo, precio);
   
        }
       
        barato = CarroBarato(coches);
        
        System.out.println("El coche mas barato es: ");
        System.out.println(coches[barato].mostrarDatos());
        
        
        
        
        
        
        
        
        
        
    } 
}
