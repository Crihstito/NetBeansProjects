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
public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
        this.cilindrada = cilindrada;
    }
    
    public int getCilindrada(){
        return cilindrada;
    }
    
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCilindrada: "+cilindrada;  
    }
    
    
}
