
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author CRIS_
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        int num, cont=0, suma=0;
        
        for(int i=1 ; i<=10 ; i++ ){
            num = Integer.parseInt(JOptionPane.showInputDialog("Introdusca un sueldo"));
            System.out.println("El salrio "+i+" fue de "+num);
            suma += num;
            
            if(num>=1000){
                cont++;
            }  
        }
        System.out.println("La suma de todos los salarios es: "+suma
        +"\nLos sueldos mayores a 1000 son: "+cont);
               
    }
}
