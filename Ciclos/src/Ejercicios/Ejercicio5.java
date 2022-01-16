
package Ejercicios;

import javax.swing.JOptionPane;


public class Ejercicio5 {
    public static void main(String[] args) {
        int numero, aleatorio, contador;
        
        aleatorio = (int)Math.floor(Math.random()*100);
        System.out.println(aleatorio);
        numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque el numero que piensa es el generado:"));
        contador = 0;
        while(numero != aleatorio){
            if(numero >aleatorio){
                System.out.println("El numero "+numero+" es menor");
            }
            else{
                System.out.println("El numero "+numero+" es mayor");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque otra opcion:"));
        contador +=1;
        }
        System.out.println("El numero es el correcto :D \nEl numero generado fue "+aleatorio+"\nHuevos puto chawis");
   
    }  
}
