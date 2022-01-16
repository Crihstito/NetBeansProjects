/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author CRIS_
 */
public class Clase2 {
    public static void main(String[] args) {
        Clase1 ob1 = new Clase1();
    
        ob1.setEdad(24);
        ob1.setNombre("Crihstito");
        System.out.println("La edad es "+ob1.getEdad());
        System.out.println("Yo soy "+ob1.getNombre()+" y tengo "+ob1.getEdad()+" años");
    }
    
    
}
