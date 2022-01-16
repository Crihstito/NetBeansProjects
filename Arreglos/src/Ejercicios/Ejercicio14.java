

package Ejercicios;

import java.util.Scanner;


public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tam,i, aux;
        boolean crec = false;
        
        System.out.print("Digite el tamaño de las tablas a combinar: ");
        tam = leer.nextInt();
        
        int tabla1[] = new int[tam];
        int tabla2[] = new int[tam];
        int tabla3[] = new int[tam*2];
        
        System.out.println("Armando el primer arreglo: ");
        do{
            for(i=0 ; i<tam ; i++){
                System.out.print("Digite el elemento "+i+" del arreglo: ");
                tabla1[i] = leer.nextInt();
            }
            for(i=0 ; i<tam-1 ; i++){
                if(tabla1[i]<tabla1[i+1]){
                    crec = true;
                }
                if(tabla1[i]>=tabla1[i+1]){
                    crec = false;
                    System.out.println("El arreglo no esta en orden creciente introduscalo de nuevo");
                    break;             
                }
            }
        }while(crec == false);
        
        crec = false;
        System.out.println("Armando el segundo arreglo...");        
        do{
            for(i=0 ; i<tam ; i++){
                System.out.print("Digite el elemento "+i+" del arreglo: ");
                tabla2[i] = leer.nextInt();
            }
            for(i=0 ; i<tam-1 ; i++){
                if(tabla2[i]<tabla2[i+1]){
                    crec = true;
                }
                if(tabla2[i]>=tabla2[i+1]){
                    crec = false;
                    System.out.println("El arreglo no esta en orden creciente introduscalo de nuevo");
                    break;             
                }
            }
        }while(crec == false);
        
        i = 0; //iterador del arreglo 1
        int j = 0;//Iterador del arreglo 2
        int k = 0;//iterador del arreglo 3
        while(i<tam && j<tam){
            if(tabla1[i]<tabla2[j]){
                tabla3[k] = tabla1[i];
                i++;
            }
            else{
                tabla3[k] = tabla2[j];
                j++;
            }
            k++;
        }
        if(i==tam){ //Todos los elementos de la tabla 1 han sido copiados por lo tanto
           while(j<tam){
               tabla3[k] = tabla2[j];
               j++;
               k++;
           }
        }
        if(j==tam){ //Todos los elementos de la tabla 1 han sido copiados por lo tanto
           while(i<tam){
               tabla3[k] = tabla1[i];
               i++;
               k++;
           }
        }
        
        System.out.println("La combinacion de los 2 arreglos es: ");
        for(i=0 ; i<tam*2 ; i++){
            System.out.print(tabla3[i]+" ");
        }
        System.out.println("");
        
    }
    
}
