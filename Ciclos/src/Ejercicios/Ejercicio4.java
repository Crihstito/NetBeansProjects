
package Ejercicios;

import javax.swing.JOptionPane;


public class Ejercicio4 {
    public static void main(String[] args) {
        float numero;
        int contador;
        
        contador = 0;
        numero = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero:"));
        while(numero > 0){
            System.out.println(numero);
            numero = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero:"));
            contador += 1;
        }
        System.out.println("El totol de numeros introducidos es "+contador);
    }
}
