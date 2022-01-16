
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        float compra , descuento;
        
        compra = Float.parseFloat(JOptionPane.showInputDialog("Cuanto fue la compra?"));
        
        if(compra>=300){
             descuento = compra * 0.20f;
             compra = compra - descuento;
             JOptionPane.showMessageDialog(null, "Ya con descuento son "+compra+" pinche codo");
        }
        else{
            JOptionPane.showMessageDialog(null,"La compra no es mayor a $300 no aplica el descuento");
        }
    }
}
