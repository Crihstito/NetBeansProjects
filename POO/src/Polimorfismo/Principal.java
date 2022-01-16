/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author CRIS_
 */
public class Principal {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("Pulsar", "NS", "4F3G5");
        misVehiculos[1] = new VehiculoTurismo(2, "Vagoneta", "V8", "FGD4H5");
        misVehiculos[2] = new VehiculoDeportivo(200, "Bejaj", "RS", "F4HG5");
        misVehiculos[3] = new VehiculoFurgoneta(2000, "BMW", "V3", "H3JK5");
        
        
        for(Vehiculo i: misVehiculos){
            System.out.println(i.mostrarDatos());
            System.out.println("");
        }
        
        
        
    }
    
}
