/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author CRIS_
 */
public class Tablero {
    int x;
    int y;
    
    public Tablero(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void Marriba(int incremento){
        y += incremento;
    }
    public void Mabajo(int incremento){
        y -= incremento;
    }
    public void Mizquierda(int incremento){
        x -= incremento;
    }
    public void Mderecha(int incremento){
        x += incremento;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    
    
    
}
