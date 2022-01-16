
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author CRIS_
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        int edad,contEd=0, contEs=0, sumEd=0, sumEs=0;
        float estatura, mediaEs, mediaEd;
        for(int i = 1 ; i <= 5 ; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del alumno "+i));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Digite la estatura del alumno "+i));
            sumEd += edad;
            sumEs += estatura;
            if(edad > 18){
                contEd++;
            }
            if( estatura > 1.75){
                contEs++;
            }

        }
        mediaEd = (float)sumEd/5;
        System.out.println("La media de las edades es de "+mediaEd+" años");
        mediaEs = (float)sumEs/5;
        System.out.println("La media de las estaturas es de "+mediaEs+" metros");
        System.out.println("La cantidad de alumnos mayores de edad es: "+contEd);
        System.out.println("El numero de alumnos que miden mas de 1.75 es: "+contEs);
    }
    
}
