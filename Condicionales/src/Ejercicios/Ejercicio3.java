
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        char caracter;
        
        caracter = JOptionPane.showInputDialog("Coloque una letra").charAt(0);
        
        if(Character.isLowerCase(caracter)){
            JOptionPane.showMessageDialog(null, "Es una letre minuscula");
        }
        else{
            JOptionPane.showMessageDialog(null,"Es mayuscula");
                    
        }
        
    }
   
}
