
package Ejercicios;

import javax.swing.JOptionPane;


public class Ejercicio20 {
    public static void main(String[] args) {
        int num;
        float sueldo, Smayor=0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de sueldos: "));
        
        for(int i = 1 ; i <= num ; i++){
            
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo "+i));
            System.out.println("El sueldo "+i+" es de: "+sueldo);
            if(sueldo > Smayor){
                Smayor = sueldo;
            }
                 
        }
       System.out.println("El sueldo mayor es: "+Smayor);
         
    }
    
}
