/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author CRIS_
 */
public class Paquete {
    int numReferencia;
    int prioridad;
    float peso;
    String dni;

    public Paquete(int numReferencia, int prioridad, float peso, String dni) {
        this.numReferencia = numReferencia;
        this.prioridad = prioridad;
        this.peso = peso;
        this.dni = dni;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public String getDni() {
        return dni;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public String mostrarDatosPaquete(){
        return "El paquete: "+numReferencia
                + "\nPeso: "+peso
                + "\nPrioridad: "+prioridad
                + "\nPesona que lo envia: "+dni;
    }
    
    
    
}
