
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author CRIS_
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        int codigo_articulo, litros_vendidos, precio_litro, facturacion=0,
        litros_totales = 0, ventas_mayores = 0, venta_factura=0, litros_articulo1=0;
        
        for(int i = 1 ; i <=5 ; i++){
            codigo_articulo = Integer.parseInt(JOptionPane.showInputDialog("Introdusca el codigo del articulo: "+i));
            litros_vendidos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos litros se vendieron del articulo ? "+i));
            precio_litro = Integer.parseInt(JOptionPane.showInputDialog("Cual es el precio por cada litrode ariticulo "+i+" ? : "));
            venta_factura = (precio_litro*litros_vendidos);
            facturacion += venta_factura;
            litros_totales += litros_vendidos;
            if(codigo_articulo == 1){
                litros_articulo1 += litros_vendidos;
            }
            if(venta_factura > 600){
                ventas_mayores ++;
            }           
        } 
        System.out.println("Resumen de ventas\n"
        + "Facturacion total" + facturacion
        + "\nLitros vendidios dek articulo 1: " + litros_articulo1
        + "\nCantidad de facturas mayores a 600:" + ventas_mayores);
        
    }
    
}
