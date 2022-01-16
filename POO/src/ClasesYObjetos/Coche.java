
package ClasesYObjetos;

/**
 *
 * @author CRIS_
 */
public class Coche {
    String color, marca, modelo;
    int cilindrada, año;
    
    public static void main(String[] args) {
        Coche motocicleta = new Coche();
        
        motocicleta.color = "Negro";
        motocicleta.marca = "Pulsar";
        motocicleta.modelo = "RS";
        motocicleta.año = 2018;
        motocicleta.cilindrada = 200;
        
        System.out.println("La motocicleta es una: "+motocicleta.marca
                + "\nColor: "+motocicleta.color
                + "\nModelo: "+motocicleta.modelo
                + "\nDel año: "+motocicleta.año
                + "\nTamaño de motor: "+motocicleta.cilindrada);

    }
}
