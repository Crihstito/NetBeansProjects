
package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int  i, num, aux, pos=0 , ult=0;
        boolean verif=false;

        int arreglo[] = new int[10];
        
        System.out.println("Armando el arreglo (recuerde que el numero debe ser mayor al anterior de lo contrario se lo pidira de nuevo)");
        do{
            for(i=0 ; i<5 ; i++){
                System.out.print("Digite el elemento "+i+" del arreglo: ");
                arreglo[i] = leer.nextInt();
            }

            for(i=0 ; i<4; i++){
                    if(arreglo[i+1]<=arreglo[i]){
                       verif = true;break;
                       
                    }
                    if(arreglo[i+1]>arreglo[i]){
                        verif=false;      
                    }
            }
            if(verif==true){
                System.out.println("El arreglo esta desordenado ingreselo de nuevo de forma creciente");
            }
        }while(verif == true);


        System.out.println("El arreglo introdicido es: ");
        for(i=0 ; i<5 ; i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.print("\n\nIntroduzca el numero que desea agregar al arreglo: ");
        num = leer.nextInt();
        for(i=0 ; i<5 ; i++){
            if(arreglo[i]<num && i<5){
                pos++;
            }
        }
        
        for(i=4; i>=pos ; i--){//0-2-4-6-8
            arreglo[i+1] = arreglo[i];
        }    
        arreglo[pos] = num;

        System.out.println("\nEl arreglo agregando el numero es: ");
        for(i=0 ; i<6 ; i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
        
     
    }
    
}
