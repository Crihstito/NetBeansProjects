
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Numero que decea cononer su multiplo:"));
        
        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+ " si es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero "+numero+ " no es multiplo de 10");
        }
      
    }
    
}
