
package Ciclos;
import java.util.Scanner;
public class CuentaRegresivaWhile {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un numero M para la cuenta regresiva");
        int M = consola.nextInt();
        while(M >0){
            System.out.println(M);
            M--;
        }
        System.out.println("Despegue");
        consola.close();
    }
    
}
