
package Ejercicios;

import javax.swing.JOptionPane;


public class Ejercicio19 {
    public static void main(String[] args) {
        int nota,contA=0, contC=0, contS=0;
        
        for(int i=1 ; i<=6 ; i++){
            do{
                nota = Integer.parseInt(JOptionPane.showInputDialog("Introdusca la nota del alumno:"));
            }while(nota<0 || nota>10);
            switch(nota){
                case 0:
                case 1:
                case 2:
                case 3: System.out.println("El alumno numero "+i+"tiene una nota "+nota+" por lo que es suspenso");
                        contS++; break;
                case 4: System.out.println("El alumno numero "+i+"tiene una nota "+nota+" por lo que es condicionado");
                        contC++; break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10: System.out.println("El alumno numero "+i+"tiene una nota "+nota+" por lo que es alumno");
                        contA++; break;
            }
        }
        System.out.println("La cantidad de alumnos aprobados son: " +contA
        + "\nLa cantidad de alumnos condicionados son: "+contC
        + "\nLa cantidad de alumnos suspensos son: "+contS);
    
    }
}
