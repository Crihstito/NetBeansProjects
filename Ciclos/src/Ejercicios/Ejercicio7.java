
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author CRIS_
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int num, suma, numto;
        float media=0;
        
        suma = 0;
        numto = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while(num >= 0){
            suma += num;
            numto ++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
        if(numto == 0){
            System.out.println("No se han introducido numeros");
        }
        else{
            media = (float)suma/numto;
        }
        JOptionPane.showMessageDialog(null, "La suma de los numero es\n"+suma
        +"\nEl total de numeros introducidos fueron\n "+numto
        +"\nLa media arimertica es \n"+media);
    }
}
