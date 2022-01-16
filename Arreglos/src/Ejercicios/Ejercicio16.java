
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tam, i, sump=0, sums=0, sumt=0,num;
        float mediaP=0 , mediaS=0, mediaT=0,mediaN=0;
        
        System.out.print("Digite el tamaño del arreglo: ");
        tam = leer.nextInt();
        
        int primero[] = new int[tam];
        int segundo[] = new int[tam];
        int tercero[] = new int[tam];
        
        System.out.println("Digite las calificaciones de los alumnos de primer año: ");
        for(i=0 ; i<tam ; i++){
            System.out.print("Digite la calificacion del alumno "+(i+1)+": ");
            primero[i] = leer.nextInt();
            sump += primero[i];
        }
        System.out.println("Digite las calificaciones de los alumnos de tercer año: ");
        for(i=0 ; i<tam ; i++){
            System.out.print("Digite la calificacion del alumno "+(i+1)+": ");
            segundo[i] = leer.nextInt();
            sums += segundo[i];
        }
        System.out.println("Digite las calificaciones de los alumnos de tercer año: ");
        for(i=0 ; i<tam ; i++){
            System.out.print("Digite la calificacion del alumno "+(i+1)+": ");
            tercero[i] = leer.nextInt();
            sumt += tercero[i];
        }
        
        mediaP = sump/tam;
        mediaS = sums/tam;
        mediaT = sumt/tam;
        
        do{
        System.out.println("Digite la posicion que desea conocer la media");
        num = leer.nextInt();
        }while(num<0 || num>tam);
                            
        mediaN = (primero[num]+segundo[num]+tercero[num])/3;
        
        System.out.println("El promedio en los alumnos de primer grado es: "+mediaP
                + "\nEl promedio de los alumnos de segundo grado es: "+mediaS
                + "\nEl promedio de los alumnos de tercer grado es: "+mediaT
                + "\nEl promedio del alumno "+(num)+" en el ciclo es de: "+mediaN);
        
        
    }
    
}
