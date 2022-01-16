/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while(numero != 0){
            if(numero > 0){
                System.out.println("El numero "+numero+" es Positivo");
            }
            else{
                System.out.println("El numero "+numero+" es Negativo");
            }
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
    }
    
}
