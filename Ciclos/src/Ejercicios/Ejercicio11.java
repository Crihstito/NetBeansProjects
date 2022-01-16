
package Ejercicios;


public class Ejercicio11 {
    public static void main(String[] args) {
        int multi = 1, conta = 0;
        
        for(int i = 1; conta < 10; i++){
            if(i%2 != 0){
                System.out.println(i);
                multi *= i;
                conta ++;
            }
   
        }
        System.out.println("La multiplicacion de los 10 primeros numeros impares es: "+multi);
        
    }
    
}
