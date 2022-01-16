/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estatico;

/**
 *
 * @author CRIS_
 */
public class Estatico {
    private static String frase = "Primera frase";
    /*
    Al agregar la palabra stactic lo que hacemos es que todos los objetos compartes ese atributo estatico
    por lo que los objetos se quedan con la ultima modificacion echa esto es para todos los objetos
    */
    
    public static int sumar(int num1, int num2){
        int suma = num1+num2;
        return suma;
    }
    
    public static void main(String[] args) {
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase = "Segunda frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        System.out.println("La suma es: "+Estatico.sumar(3, 45));
        
       
       
        
        
        
        
    }
    
    
}
