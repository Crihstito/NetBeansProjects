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
public class Sucursal {
    int numSucursal;
    String direccion;
    String ciudad;
    
    public Sucursal(int numSucursal, String ciudad, String direccion ){
        this.numSucursal = numSucursal;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public int getnumSucursal(){
        return numSucursal;
    }    
            
    public String mostrarDatosSucursal(){
        return "Numero de Sucursal: "+numSucursal
                + "\nCuidad: "+ciudad
                + "\nDireccion: "+direccion;
    }
    
    public float calcularPrecio(Paquete t){
        float precio;
        precio = t.getPeso();
        if(t.getPrioridad() == 1){
            precio += 10;   
        }
        if(t.getPrioridad() == 2){
            precio += 20;
        }
        return precio;
    }
    
}
