
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class CuentasMain {
    public static int buscarNcuenta(Cuenta cuentas[], int n){
        boolean existe = false;
        int indice = 0;
        
        for(int i=0 ; i<cuentas.length && existe == false ; i++){
            if(cuentas[i].getCuenta() == n){
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
        int cantidadCuentas, numCuenta, opcionCuenta, opcion, indiceC;
        float saldo, cantidad;
        String nombre, apellido, dni;
        
        System.out.println("►Bienvenido al administrador de cuentas►");
        System.out.println("¿Cual es su nombre?");
        nombre = entrada.nextLine();
        System.out.println("Cual es su apellido?");
        apellido = entrada.nextLine();
        System.out.println("Digite su curp");
        dni = entrada.nextLine();
        System.out.print("Digite la cantidad de cuentas que tiene: ");
        cantidadCuentas = entrada.nextInt();
        
        Cuenta cuentas[] = new Cuenta[cantidadCuentas];

        for(int i=0 ; i<cantidadCuentas ; i++){
            System.out.println("Didite los datos de la cuneta "+(i+1)+":");
            System.out.println("Digite su numero de cuenta: ");
            numCuenta = entrada.nextInt();
            System.out.println("Digite su saldo actual en la cuenta ");
            saldo = entrada.nextFloat();
            
            cuentas[i] = new Cuenta(numCuenta, saldo);
        }
        
        for(int i=0 ; i<cantidadCuentas ; i++){
            System.out.println("La cuenta "+(i)+".");
            System.out.println("Es la que tiene el numero: "+cuentas[i].getCuenta());
            System.out.println("Tiene un saldo de: "+cuentas[i].getSaldo());
        }
        
        Cliente cliente = new Cliente(nombre, apellido, dni, cuentas);

        do{
            
            System.out.println("☺ Menu ☺"
                    + "\n1 Consultar saldo"
                    + "\n2 Ingresar dinero a la cuenta"
                    + "\n3 Retirar saldo"
                    + "\n4 Salir");
            opcion = entrada.nextInt();
            
            
            switch (opcion){
                case 1: System.out.println("◄Funcion de cuentas►");
                        System.out.println("Ingrese el numero de cuenta con la que decea trabajar ");
                        opcionCuenta = entrada.nextInt();
                        indiceC = buscarNcuenta(cuentas, opcionCuenta);
                        if(indiceC == -1){
                            System.out.println("El numero de cuenta no existe");

                        }
                        else{
                            System.out.println("El saldo en la cuenta es de: "+cliente.ConsultarS(indiceC));break;
                        }
                case 2: System.out.println("◄Funcion de cuentas►");
                        System.out.println("Ingrese el numero de cuenta con la que decea trabajar ");
                        opcionCuenta = entrada.nextInt();
                        indiceC = buscarNcuenta(cuentas, opcionCuenta);
                        if(indiceC == -1){
                            System.out.println("El numero de cuenta no existe");

                        }
                        else{
                            System.out.println("Digite la cantidad de dinero que desea ingresar a la cuenta "+opcionCuenta);
                            cantidad = entrada.nextFloat();
                            cliente.ingresarD(indiceC, cantidad);
                            System.out.println("El saldo actual de la cuenta ahora con el ingreso es de: "+cliente.ConsultarS(indiceC));
                        }break; 
                case 3: System.out.println("◄Funcion de cuentas►");
                        System.out.println("Ingrese el numero de cuenta con la que decea trabajar ");
                        opcionCuenta = entrada.nextInt();
                        indiceC = buscarNcuenta(cuentas, opcionCuenta);
                        if(indiceC == -1){
                            System.out.println("El numero de cuenta no existe");

                        }
                        else{
                            System.out.println("Digite la cantidad de dinero que desea retirar");
                            cantidad = entrada.nextFloat();
                            if(cliente.ConsultarS(indiceC)>cantidad){
                                cliente.retirarD(indiceC, cantidad);
                                System.out.println("Recoja su dinero en el cajero"
                                        + "\nSu saldo actual es: "+cliente.ConsultarS(indiceC));
                            }
                            else{
                                System.out.println("No tienes fondos suficientes");
                            }
                        }break; 
                    
                case 4: System.out.println("Vuelve pronto perra");break;
                default: if(opcion>4){
                         System.out.println("Opcion no valida");   
                         }break;
            }
        }while(opcion != 4);
        
        
       
        
        
        
        
    }
    
}
