/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author CRIS_
 */
public class ForEach {
    public static void main(String[] args) {

        String[] nombres = {"Cristian","Karla"};
        
        for(int i=0 ; i<nombres.length ; i++){
            System.out.println(nombres[i]);
        }
        for(String i : nombres){
            System.out.println(i);
        }
        
    }
}
