
package Constantes;

/**
 *
 * @author CRIS_
 */
public class Persona {
    private final String nombre;
    private int edad;
    
    //Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre
            + " y su edad es: "+edad);
    }
            
    //Ya que nuestras varibles son de tipo privado tenemos que hacer uso de los 
    //getters and setters para poder acceder a ellos en otras clases
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    
}
