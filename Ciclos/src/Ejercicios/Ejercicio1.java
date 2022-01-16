
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        float numero,cuadrado;
        
        numero = Float.parseFloat(JOptionPane.showInputDialog("Digite el numero que desea conocer el cuadrado del mismo"));
        while(numero>=0){
           cuadrado = numero*numero; 
           JOptionPane.showMessageDialog(null, "El cuadrado del numero es \n"+cuadrado);
           numero = Float.parseFloat(JOptionPane.showInputDialog("Digite el numero que desea conocer el cuadrado del mismo"));   
        }
        JOptionPane.showMessageDialog(null, "Las raices negativas son imaginarias");
    }
}
