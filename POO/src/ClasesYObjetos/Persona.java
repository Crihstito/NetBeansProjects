/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author CRIS_
 */
public class Persona {
    String nombre;
    int edad;
    String id;

    public Persona(String nombre, int edad, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }
    
    public void correr(){
        System.out.println("Soy "+nombre+" tengo "+edad+" y estoy corriendo una maraton");
    }
     public int correr(int km){
         System.out.println("He corrido "+km+" kilometros");
         return 4;
    }
    
    
    
}