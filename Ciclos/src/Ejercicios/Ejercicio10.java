
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author CRIS_
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int i,num,suma = 0;
        
        for(i=1 ; i <= 10 ; i+=1 ){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            System.out.println("El numero "+i+" digitado fue "+num);
            suma += num; 
        }
        System.out.println("La suma de los numeros es: "+suma);
        
    }
    
}
