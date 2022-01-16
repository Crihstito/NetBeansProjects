
package Ejercicio7;

/**
 *
 * @author CRIS_
 */
public class Cuenta {
    int cuenta;
    float saldo;

    public Cuenta(int cuenta, float saldo) {
        this.cuenta = cuenta;
        this.saldo = saldo;
    }
    
    public int getCuenta(){
        return cuenta;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void IngresarD(float cantidad){
        saldo += cantidad;
    }
    
    public void RetiroD(float cantidad){
        saldo -= cantidad;
    }
    
    
    
    
}
