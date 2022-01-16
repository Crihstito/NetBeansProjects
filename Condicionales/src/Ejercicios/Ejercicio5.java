
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        float Hsem,Hext,Ssem;
        
        Hsem = Float.parseFloat(JOptionPane.showInputDialog("Introdusca el numero de horas laboradas:"));
        if(Hsem<40){
            Ssem = Hsem*16;
        }
        else{
            Hext = Hsem-40;
            Ssem = 40*16 + Hext*20;
        }
        JOptionPane.showMessageDialog(null, "Las horas laboradas fueron "+Hsem+" por lo tanto su salario es "+Ssem);
    }
    
    
}
