/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo1;

public class VehiculoFurgoneta extends Vehiculo{
    private int carga;

    public VehiculoFurgoneta(int carga, String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCarga: "+carga;  
    }
    
    
}
