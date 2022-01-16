
//Conversion descendente de tipos (Downcasting)

package Polimorfismo1;


public class Principal {
    public static void main(String[] args) {
        
        Vehiculo vehiculo = new VehiculoDeportivo(500, "BMW", "2007", "4F3SG");
        
        VehiculoDeportivo nuevoVehiculo = (VehiculoDeportivo) vehiculo;
        
        System.out.println(nuevoVehiculo);
    }
    
}
