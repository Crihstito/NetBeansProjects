
package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tam, i, num=0, pos=0;
        boolean verif = false , crec = false;
        
        System.out.print("Digite el tamaño del arreglo: ");
        tam = leer.nextInt();
        
        int arreglo[] = new int[tam];
        
        System.out.println("Armando el arreglo... ");
        do{
            for(i=0 ; i<tam ; i++){
                System.out.print("Digite el elemento "+i+" del arreglo: ");
                arreglo[i] = leer.nextInt();
            }
            for(i=0 ; i<tam-1 ; i++){
                if(arreglo[i]>arreglo[i+1]){
                    System.out.println("El arreglo no esta ordenado de forma creciente, introduscalo de nuevo");
                    crec = false;
                    break;
                }
                if(arreglo[i]<arreglo[i+1]){
                    crec = true;
                }
            }
        }while(crec == false);
        
        System.out.println("Digite el numero que decea buscar en el arreglo ");
        num = leer.nextInt();
        
        System.out.println("El arreglo introducido es: ");
        for(i=0 ; i<tam ; i++){
            System.out.print(arreglo[i]+" ");
            if(arreglo[i] == num){
                pos = i;
                verif = true;
            }
        }
        if(verif == true){
            System.out.println("\nEl numero introducido si esta en el arreglo en la posicion: "+pos);
        }
        else{
            System.out.println("\nEl numero no esta en el arreglo");
        }

    }
}
