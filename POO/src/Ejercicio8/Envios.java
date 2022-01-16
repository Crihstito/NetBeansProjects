/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class Envios {
    public static int buscarSucursal(Sucursal t[], int numSucursal, int contS){
        int indice = 0;
        boolean existe = false;
        for(int i=0 ; i<contS ; i++ ){
            if(t[i].getnumSucursal() == numSucursal){
                existe = true;
                indice = i;
            }
        }
        if(existe == false){
            indice = -1;
        }
        return indice;
    }
    public static int buscarPaquete(Paquete t[], int numP, int contP){
        int indice = 0;
        boolean existe = false;
        for(int i=0 ; i<contP ; i++ ){
            if(t[i].getNumReferencia() == numP){
                existe = true;
                indice = i;
            }
        }
        if(existe == false){
            indice = -1;
        }
        return indice;
    }
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numS, numP, prioridad, opcion;
        int contS=0, contP=0, indS, indP;
        String direccion, ciudad, dni;
        float peso, precioP;
        Sucursal sucursales[] = new Sucursal[20];
        Paquete paquetes[] = new Paquete[10];
        
        do{
            System.out.println("\n\t ►MENU◄"
                    + "\n1 Añadir sucursal"
                    + "\n2 Enviar Paquete"
                    + "\n3 Consultar sucursal"
                    + "\n4 Consultar paquete"
                    + "\n5 Mostrar todas las sucursales"
                    + "\n6 Mostar todos los paquetes "
                    + "\n7 Salir ");
            
            System.out.print("Digite la opcion que desee: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: System.out.println("\nDigite el numero de la nueva sucursal:");
                        numS = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Digite la ciudad donde se ubica");
                        ciudad = entrada.nextLine();
                        System.out.println("Digite la direccion");
                        direccion = entrada.nextLine();
                        sucursales[contS] = new Sucursal(numS, ciudad, direccion);
                        indS = buscarSucursal(sucursales, numS, contS);
                        if(indS == -1){
                            System.out.println("Sucursal añadida con exito ☺");
                            contS ++; 
                        }
                        else{
                            System.out.println("El numero de la sucursal ya esta registrado intente de nuevo .i.");
                        }break;
                        
                case 2: System.out.println("\nDigite el numero de sucursal que expedira el paquete");
                        numS = entrada.nextInt();
                        indS = buscarSucursal(sucursales, numS, contS);
                        if(indS == -1){
                            System.out.println("El numero de la sucursal no esta registrado");
                        }
                        else{
                            System.out.print("Digite el numero del paquete: ");
                            numP = entrada.nextInt();
                            System.out.print("Digite la prioridad del paquete"
                                    + "\n0 Sin prioridad"
                                    + "\n1 Prioridad alta"
                                    + "\n2 Express ");
                            prioridad = entrada.nextInt();
                            System.out.print("Digite el peso del paquete: ");
                            peso = entrada.nextFloat();
                            entrada.nextLine();
                            System.out.print("Dgite el DNI del empleado que envia el paquete: ");
                            dni = entrada.nextLine();
 
                            paquetes[contP] = new Paquete(numP, prioridad, peso, dni);
                            
                            precioP = sucursales[indS].calcularPrecio(paquetes[contP]);
                            System.out.println("El precio del paquete es de: $"+precioP);
                            
                            contP ++;
                        }break;
                        
                case 3: System.out.println("\nDigite el numero de la sucursal que desea consultar: ");
                        numS = entrada.nextInt();
                        indS = buscarSucursal(sucursales, numS, contS);
                        if(indS == -1){
                            System.out.println("Sucursal no existente");
                        }
                        else{
                            System.out.println("Los datos de la sucursal son:\n"+sucursales[indS].mostrarDatosSucursal());
                        }break;
                case 4: System.out.println("\nDigite el numero de referencia del paquete que desea consultar: ");
                        numP = entrada.nextInt();
                        indP = buscarPaquete(paquetes, numP, contP);
                        if(indP == -1){
                            System.out.println("Paquete no existente");
                        }
                        else{
                            System.out.println("Los datos del paquete son:\n"+paquetes[indP].mostrarDatosPaquete());
                        }break;
                        
                case 5: System.out.println("");
                        for(int i=0 ; i<contS ; i++){
                            System.out.println("Los datos de la sucursal N "+(i+1)+": \n"+sucursales[i].mostrarDatosSucursal());
                            System.out.println("");
                        }break;
                
                case 6: for(int i=0 ; i<contP ; i++){
                           System.out.println("Los datos del paquete N "+(i+1)+": "+paquetes[i].mostrarDatosPaquete());
                        }break;
                
                case 7: System.out.println(" Vuelva pronto perra maldita");break;
                default: if(opcion>7 || opcion<1){
                         System.out.println("No mamaes esa opcion no esta chaquetin");
                         }break;
            }
        
        }while(opcion != 7);
        
        
        
    }
    
}
