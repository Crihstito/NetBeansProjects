

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.security.SecureRandom;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.lang.Runnable;


public class Interrupcciones {

    static SecureRandom random = new SecureRandom();
    static int datos = 0;
    static int opcion;
    public static int primeraInterrupcion = 0;
    public static int segundaInterrupcion = 0;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\t\t"+random.nextInt(150));
            datos++;
            if (datos == 10) {
                System.out.println("________________________________");
                System.out.println("SE HAN CREADO DATOS, QUE DESEA HACER?"
                        + "\n__________________________________\n   1)Continuar generando"
                        + "\n   2)Llevar acabo sugerencia del sistema\n   3)Limpiar la memoria\n   4)Finalizar el programa");
                opcion = teclado.nextInt();
                datos = 0;
                primeraInterrupcion++;
                
                if (opcion == 2 && primeraInterrupcion>=2) {
                    System.out.println("____________________________________________________________________________________________");
                    System.out.println("EL SISTEMA PUDO CONTINUAR Y GENERÃ“ MAS DATOS, PERO SE SUGUIERE LIMPIAR SÃ� ES QUE CREARA MAS DATOS"
                            + "\n___________________________________________________________________________________________________");
                    continue;
                }
                if (opcion == 2) {
                    System.out.println("____________________________________________________________________________________________");
                    System.out.println("EL SISTEMA PUDO CONTINUAR Y GENERÃ“ MAS DATOS, PERO SE SUGUIERE LIMPIAR SÃ� ES QUE CREARA MAS DATOS"
                            + "\n___________________________________________________________________________________________________");
                    primeraInterrupcion++;
                }
                
                if (opcion == 3) {
                    System.out.println("______________________________");
                    System.out.println("\tMEMORIA LIMPIADA SATISFACTORIAMENET"
                            + "\n______________________________");
                    primeraInterrupcion = 0;
                }
                if (primeraInterrupcion >= 2) {
                    System.out.println("______________________________");
                    System.out.println("LA MEMORIA COMIENZA A LLENARSE"
                            + "\n_______________________________"
                            + "\nDesea continuar o borrarla?\n   1)Continuar sin limpiar memoria"
                            + "\n   2)Limpiar la memoria\n   3)Finalizar programa"
                            + "\n   4)Finalizar programa");
                    opcion = teclado.nextInt();
                    if (primeraInterrupcion == 2) {
                        primeraInterrupcion = 0;
                    } 
                    if(opcion==1){
                        segundaInterrupcion++;
                        if (opcion == 1 && segundaInterrupcion >= 2) {
                            System.out.println("_______________________________________________");
                            System.out.println("EL SISTEMA SE DETUVO DEBIDO A MEMORIA SATURADA"
                                    + "\n_________________________________________________");
                            System.exit(0);
                        }
                    }
                    if(opcion==3){
                        System.out.println("_______________________________________________");
                            System.out.println("PROCESO TERMINADO SATISFACTORIAMENTE"
                                    + "\n_________________________________________________");
                            System.exit(0);
                    }

                }

            }

        } while (opcion != 4);
    } 
}

