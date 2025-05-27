
package Ciclos;
import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce un numero entero no negativo: ");
        int n = consola.nextInt();
        long factorial = 1;
        int contador = n;
        while(contador > 1){
            factorial *= contador;
            contador--;
            
        }
        System.out.printf("El factorial de %d ed %d%n", n, factorial);
        consola.close();
    }
}
