/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class TrianguloMain {
    public static double areaMayor(Triangulo Triangulos[]){
        double areaM;
        
        areaM = Triangulos[0].getArea();
        for(int i=0 ; i<Triangulos.length ; i++){
            if(Triangulos[i].getArea()>areaM){
                areaM = Triangulos[i].getArea();
            }
        }
        return areaM;
    
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numTriangulos;
        double base, altura, areaM;
        
        System.out.print("Introduzca el numero de triangulos que desea en el arreglo: ");
        numTriangulos = entrada.nextInt();
        
        Triangulo Triangulos[] = new Triangulo[numTriangulos];
        
        System.out.println("Armando los Triangulos en el arreglo");
        for(int i=0 ; i<numTriangulos ; i++){
            System.out.println("Armando el Triangulo "+(i+1)+" del arreglo");
            System.out.print("Introdusca la base: ");
            base = entrada.nextDouble();
            System.out.print("Introdusca la altura");
            altura = entrada.nextDouble();
            
            Triangulos[i] = new Triangulo(base, altura);
            
        }
        
        System.out.println("Los Triangulos introducidos tienen los elementos siguientes");
        for(int i=0 ; i<numTriangulos ; i++){
            System.out.println("El Triangulo "+(i+1)
            + "\nTiene un area de: "+Triangulos[i].getArea()
            + "\nY un perimetro de: "+Triangulos[i].getPerimetro());
        }
        
        areaM = areaMayor(Triangulos);
        
        System.out.println("La superficie mayor es: "+areaM);
        
        
        
        
        
        
        
        
        
        
    }
    
}
