

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
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String matricula;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }
     
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo;  
    }
    
    
    
    
}
