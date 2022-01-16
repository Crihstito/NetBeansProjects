/* 
LA Busqueda Binaria es un metodo que nos permite buscar un elemento de un arreglo 
*El arreglo debe estar ordenado en forma ascendente 
*/ 

package Busquedas;

import java.util.Scanner;

public class Binaria {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int arreglo[] = {2,4,7,9,10};
        int num, inf=0, sup=5, mitad,i;
        boolean band = false;
        
        
        mitad = (inf+sup)/2;
        System.out.print("Digite el numero que quiera buscar en el arreglo: ");
        num = leer.nextInt();
        for(i=0 ; inf<=sup && i<5  ; i++){
            if(arreglo[mitad] == num){
                band = true;
                break;
            }
            if(arreglo[mitad] > num){
                sup = mitad;
                mitad = (inf+sup)/2;

            }
            if(arreglo[mitad] < num){
                inf = mitad;
                mitad = (inf+sup)/2;
            }

        }
        if(band == true){
            System.out.println("El numero si se encuentra en el arreglo en la posicion: "+mitad);
        }
        if(band == false){
            System.out.println("No hemos encontrado el numero en el arreglo");
        }

        
            
        
        
        
        
        
        
    }
    
}
