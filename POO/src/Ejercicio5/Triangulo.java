/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author CRIS_
 */
public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    
    public double getPerimetro(){
        double hipotenusa = Math.sqrt((Math.pow((base/2),2))+Math.pow(altura,2));
        double perimetro = base+(hipotenusa*2);
        return perimetro;
    }
    
    public double getArea(){
        double area = (base*altura)/2;
        return area;
    }
    
    
    
    
}
