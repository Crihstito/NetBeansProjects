/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author CRIS_
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int num, suma;
        suma = 0;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            suma += num;
        }while(num != 0);
        
        JOptionPane.showMessageDialog(null, suma);
    }
    
}
