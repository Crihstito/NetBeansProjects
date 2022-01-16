
package Ejercicio6;


public class Numero {
    double a;
    double b;
    
    
    public Numero(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    public Numero Suma(Numero c){
        Numero suma = new Numero(a+c.getA(), b+c.getB());
        return suma;
    }
    
    public Numero Multiplicar(Numero c){
        Numero multi  =  new Numero((a*c.getA()-(b*c.getB())),((a*c.getB()+(b*c.getA()))));
        return multi;
    }
    
    public boolean comprobarIgualdad(Numero c){
        boolean comprobador = false;
        if(a == c.getA() && b == c.getB()){
            comprobador = true;
        }
        return comprobador;      
    }
    
    public Numero EnteroMulti(int entero){
        Numero enteroM = new Numero(entero*a,entero*b);
        return enteroM;
    }
    
    
    
    
    
}
