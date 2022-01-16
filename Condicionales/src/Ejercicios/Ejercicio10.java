/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int dia,mes,anio;
        
       dia = Integer.parseInt(JOptionPane.showInputDialog("Digite su dia de nacimiento:"));
       mes = Integer.parseInt(JOptionPane.showInputDialog("Digite su mes de nacimiento:"));
       anio = Integer.parseInt(JOptionPane.showInputDialog("Digite su anio de nacimiento: "));
        if(anio<=2021){
            if((mes>=1)&&(mes <=12)){
                if(mes==2){
                    if(dia>=1 && dia<=28){
                        JOptionPane.showMessageDialog(null,"La fecha es correcta \n"+dia+"-"+mes+"-"+anio);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"La fecha es incorrecta el en dia");
                    }
                }
                if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
                        if(dia>=1&&dia<=31){
                            JOptionPane.showMessageDialog(null,"La fecha es correcta \n"+dia+"-"+mes+"-"+anio);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"La fecha es incorrecta el en dia");
                        }
                 }
                if(mes==4||mes==6||mes==9||mes==11){
                    if(dia>=1&&dia<=30){
                            JOptionPane.showMessageDialog(null,"La fecha es correcta \n"+dia+"-"+mes+"-"+anio);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"La fecha es incorrecta el en dia");
                    }
                 }

            }
            else{
           JOptionPane.showMessageDialog(null,"La fecha es incorrecta el en mes");
           }
       }
        else{
            JOptionPane.showMessageDialog(null,"La fecha es incorrecta el en anio");
        }
    }
}
