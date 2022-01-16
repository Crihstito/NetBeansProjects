
package Ejercicio3;

/**
 *
 * @author CRIS_
 */
public class Carro{
    String marca;
    String modelo;
    float precio;
    
    public Carro(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio;
    }
   
    
    
    
    
    
    
}
