
package Ejercicios;

import javax.swing.JOptionPane;


public class Ejercicio13 {
    public static void main(String[] args) {
        int Sini, Sing, Sret,Sfin, menu;
        
        Sini = 1000;
        
        menu = Integer.parseInt(JOptionPane.showInputDialog("Presione alguna de las opciones siguientes para elk cajero puto \n"
                + "Boton del numero 1 para ingresar dinero\n"
                + "Boton el numero 2 para retirar dinero\n"
                + "Boton numero 3 para salir"));
        
        switch(menu){
            case 1: Sing = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero decea ingresar a su cuenta"));
                    Sfin = Sini+Sing;
                    JOptionPane.showMessageDialog(null, "Su saldo final es"+Sfin); break;
            case 2: Sret = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea retirar? Saldo disponible: \n"+Sini));
                    if(Sret>Sini){
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Recoga su dinero");
                    } break;
            case 3: JOptionPane.showMessageDialog(null, "Gracias por su preferencia"); break;
            default: JOptionPane.showMessageDialog(null, "Opcion no valida, vayase a la verga"); break;
        
        }
    }
}
