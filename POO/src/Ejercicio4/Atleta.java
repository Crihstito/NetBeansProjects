/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author CRIS_
 */
public class Atleta {
    int numero;
    String nombre;
    float tiempo;
    
    public Atleta(int numero, String nombre, float tiempo){
        this.numero = numero;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    
    public float getTiempo(){
        return tiempo;
    }
    
    public String Resultados(){
        return "El atleta "+nombre+" con el numero "+numero+" hizo un tiempo de "+tiempo+" minutos";
    }
    
    
}
