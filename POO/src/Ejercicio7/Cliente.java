
package Ejercicio7;

/**
 *
 * @author CRIS_
 */
public class Cliente {
    String nombre;
    String apellido;
    String dni;
    Cuenta cuentas[];
    
    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getDni(){
        return dni;
    }
    
    public float ConsultarS(int n){
        return cuentas[n].getSaldo();
    }
    
    public void ingresarD(int n, float cantidad){
        cuentas[n].IngresarD(cantidad);
    }
    
    public void retirarD(int n, float cantidad){
        cuentas[n].RetiroD(cantidad);
    }
    
    
    
    
    
    
    
    
    
}
