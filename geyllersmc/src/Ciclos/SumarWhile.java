
package Ciclos;

import java.util.Scanner;
public class SumarWhile {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo");
        int N = consola.nextInt();
        int suma = 0;
        int i = 1;
        
        while(i <= N){
            suma +=i;
            i++;
        }
        System.out.printf("La suma de 1 a %d es: %d%n", N, suma);
        consola.close();
    }
}
