
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args) {
        int num1,num2,sum,res,divi,mult;
        char operador;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero de la operacion"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero de la operacion"));
        operador = JOptionPane.showInputDialog("Coloque una letra").charAt(0);
               
        while(operador!='X'|| operador!='x'){
            switch(operador){
                case's':
                case'S': sum = num1+num2;
                         JOptionPane.showMessageDialog(null, "La suma es"+sum);
                         break;
                case'r':
                case'R': res = num1-num2;
                         JOptionPane.showMessageDialog(null, "La resta es"+res);
                         break;
                case'd':
                case'D': divi = num1/num2;
                         JOptionPane.showMessageDialog(null, "La division es"+divi);
                         break;
                case'P':
                case'p':
                case'M':
                case'm': mult = num1*num2;
                         JOptionPane.showMessageDialog(null, "La multiplicacion es"+mult);
                         break;
            }   
        operador = JOptionPane.showInputDialog("Coloque una letra").charAt(0);
        } 
    }
}
