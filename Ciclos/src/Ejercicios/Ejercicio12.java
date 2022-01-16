
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author CRIS_
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        int num,i, factorial = 1;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que desea conocer su factorial:"));
        
        for(i = 1; i <= num ; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }   
}
