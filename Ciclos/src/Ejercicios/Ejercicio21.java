
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author CRIS_
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        int num;
        boolean exist = false;
        
        for(int i=1 ; i<=5 ; i++){
            
            do{
               num = Integer.parseInt(JOptionPane.showInputDialog("Introdusca la calificacion del alumno num "+i));
            }while(num<0 || num>10);
            
            if(num < 5){
                exist = true;
            }

        }
        if(exist == true){
            JOptionPane.showMessageDialog(null, "Si hay algun alumno suspenso");
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay ningun alumno suspenso :D ");
            
        }
    }  
}
