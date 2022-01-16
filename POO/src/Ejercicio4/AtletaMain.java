
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author CRIS_
 */
public class AtletaMain {
    public static int menorTiempo(Atleta corredores[]){
        float menorT;
        int posicion=0;
        
        menorT =  corredores[0].getTiempo();
        for(int i=1 ; i<corredores.length ; i++){
            if(corredores[i].getTiempo() < menorT){
                menorT = corredores[i].getTiempo();
                posicion = i;
            }
        }
        return posicion;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, numCompetidores, menorT;
        String nombre;
        float tiempo;
        
        System.out.print("introdusca el numero de competidores: ");
        numCompetidores = entrada.nextInt();
        
        Atleta corredores[] = new Atleta[numCompetidores];
        
        for(int i=0 ; i<corredores.length ; i++){
            System.out.println("Digite la informacion del atleta "+(i+1));
            System.out.print("Introdusca el numero del corredor: ");
            numero = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Introduca el nombre del corredor: ");
            nombre = entrada.nextLine();
            System.out.print("Indrousca su tiempo en la carrera: ");
            tiempo = entrada.nextFloat();
            
            corredores[i] = new Atleta(numero, nombre, tiempo);
            
        }
        
        menorT = menorTiempo(corredores);
        
        System.out.println("El Ganador es!! ");
        System.out.println(corredores[menorT].Resultados());
        
    }
    
}
