/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio13 {
    public static void main(String[] args) {
        int num,Nceros=0, sumP =0, sumN=0, contP=0, contN=0;
        float mediaP, mediaN;
        for(int i = 1 ; i <= 10 ; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            if(num > 0){
                sumP += num;
                contP++;
            }
            else if( num < 0){
                sumN += num;
                contN++;
            }
            else{
                Nceros ++; 
            }

        }
        if(contP != 0){
            mediaP= (float) sumP/contP;
            System.out.println("La media de los positivos es "+mediaP);            
        }
        else{
            System.out.println("No se introducieron numeros positivos");
        }
        if(contN != 0){
            mediaN= (float) sumN/contN;
            System.out.println("La media de los negativos es "+mediaN);        
        }
        else{
            System.out.println("No se intoducieron numeros negativos4");
        }
        System.out.println("La cantidad de ceros es: "+Nceros);
    }
    
}
