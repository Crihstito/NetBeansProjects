/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class NumeroMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Numero num1, num2, suma, mult;
        double num1R, num1I,num2R, num2I;
        int opcion, numE;
        
        System.out.println("♠♠Operaciones con numeros complejos♠♠");
        do{
            System.out.println("Que desea hacer? "
                    + "\n1. Sumar los dos numeros complejos"
                    + "\n2. Multiplicar los dos numeros complejos "
                    + "\n3 Comparar si los dos numero son iguales"
                    + "\n4 Multiplicar alguno de los numeros por un entero"
                    + "\n5 Salir "); 
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: System.out.print("Digite la parte real del primer numero: ");
                        num1R = entrada.nextDouble();
                        System.out.print("Digite la imaginaria real del primer numero: ");
                        num1I = entrada.nextDouble();
                        System.out.print("Digite la parte real del segundo numero: ");
                        num2R = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria del segundo numero: ");
                        num2I = entrada.nextDouble();

                        num1 = new Numero(num1R , num1I);
                        num2 = new Numero(num2R , num2I);
                        suma = num1.Suma(num2);
                       
                        System.out.println("\nLa suma de los dos numero es: "+suma.getA()+" + "+suma.getB()+"i");break;
                        
                case 2: System.out.print("Digite la parte real del primer numero: ");
                        num1R = entrada.nextDouble();
                        System.out.print("Digite la imaginaria real del primer numero: ");
                        num1I = entrada.nextDouble();
                        System.out.print("Digite la parte real del segundo numero: ");
                        num2R = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria del segundo numero: ");
                        num2I = entrada.nextDouble();

                        num1 = new Numero(num1R , num1I);
                        num2 = new Numero(num2R , num2I);
                        mult = num1.Multiplicar(num2);
                       
                        System.out.println("\nLa multiplicacio de los dos numero es: "+mult.getA()+" + "+mult.getB()+"i");break;
          
                case 3: System.out.print("Digite la parte real del primer numero: ");
                        num1R = entrada.nextDouble();
                        System.out.print("Digite la imaginaria real del primer numero: ");
                        num1I = entrada.nextDouble();
                        System.out.print("Digite la parte real del segundo numero: ");
                        num2R = entrada.nextDouble();
                        System.out.print("Digite la parte imaginaria del segundo numero: ");
                        num2I = entrada.nextDouble();

                        num1 = new Numero(num1R , num1I);
                        num2 = new Numero(num2R , num2I);
                        
                        if(num1.comprobarIgualdad(num2)){
                            System.out.println("Los numeros si son iguales");
                        }
                        else{
                            System.out.println("Los numeros no son iguales");
                        }break;
                       
                case 4: System.out.print("Digite la parte real del primer numero: ");
                        num1R = entrada.nextDouble();
                        System.out.print("Digite la imaginaria real del primer numero: ");
                        num1I = entrada.nextDouble();
                        
                        num1 = new Numero(num1R , num1I);
                        
                        System.out.print("Por cuanto te gustaria multiplicarlo el numero complejo ");
                        numE = entrada.nextInt();
                        mult = num1.EnteroMulti(numE);
                        
                        System.out.println("La multiplicacion del numero complejo por el entero es: "+mult.getA()+" + "+mult.getB()+"i");
                        
                case 5: System.out.println("Gracias por participar .i.");
                default: if(opcion > 5){
                            System.out.println("Opcion no valida");
                        }
            }
            
        }while(opcion != 5);
        
        
        
        
        
        
    }
}
