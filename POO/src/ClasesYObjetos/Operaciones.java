/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author CRIS_
 */
public class Operaciones {
    int suma, resta, mult, div;
    
    public void sumar(int num1 , int num2){
        suma = num1+num2;
    }
    public void restar(int num1 , int num2){
        resta = num1-num2;
    }
    public void multiplicaion(int num1 , int num2){
        mult = num1*num2;
    }
    public void division(int num1 , int num2){
        div = num1/num2;
    }
    public void resultados(int num1 , int num2){
        System.out.println("La suma de "+num1+" + "+num2+" = "+suma
                + "\nLa resta de "+num1+" - "+num2+" = "+resta
                + "\nLa multiplicacion de "+num1+" * "+num2+" = "+mult
                + "\nLa division de "+num1+" / "+num2+" = "+div);
    }
    
}
