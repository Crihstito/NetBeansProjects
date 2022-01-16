/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo1;

public class VehiculoTurismo extends Vehiculo {
    private int nPuertas;

    public VehiculoTurismo(int nPuertas, String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
        this.nPuertas = nPuertas;
    }
    
    public int getNPuertas(){
        return nPuertas;
    }
    
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNumero de puertas: "+nPuertas;  
    }
    
    
}
