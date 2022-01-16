/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class TableroMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, opcion, incremento=0;
        
        
        System.out.println("Bienvenido al tablero virtual!!");
        System.out.print("Digite la posicion incial en X: ");
        x = entrada.nextInt();
        System.out.print("\nDigite la posicion incial en Y:");
        y= entrada.nextInt();
        
        Tablero T1 = new Tablero(x,y);
        
        do{  
            System.out.println("Para moverse en el tablero ocupe los siguiente comandos"
            + "\n1 Arriba."
            + "\n2 Abajo"
            + "\n3 Izquierda"
            + "\n4 Derecha"
            + "\n5 Salir");
            System.out.print("A donde se desea mover? ");
            opcion = entrada.nextInt();
            
            if(opcion != 5){
                System.out.println("Cuantas pociones se desea mover?");
                incremento = entrada.nextInt();
            }
            switch(opcion){
                case 1: T1.Marriba(incremento);break;
                case 2: T1.Mabajo(incremento);break;
                case 3: T1.Mizquierda(incremento); break;
                case 4: T1.Mderecha(incremento); break;
                case 5: break;
                default: System.out.println("Opcion no valida");
            }
            System.out.println("La poscion actual es:"+"("+T1.getX()+","+T1.getY()+")");
        }while(opcion!=5);
 
    }
    
    
}
