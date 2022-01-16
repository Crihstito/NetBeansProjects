
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author CRIS_
 */
public class Ejercicio16 {
    public static void main(String[] args) {
       int num,result;
       do{
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que desea conocer la tabla de multiplicar: "));
       }while(num<0 || num >10);
       
       for(int i=0 ; i<=10 ; i++){
           result = num * i;
           System.out.println(i+"*"+num+"="+result);
       }
        
        
    }

    
}
