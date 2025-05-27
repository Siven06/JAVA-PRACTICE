
package Ciclos;
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce un numero para generar su tabla de multiplicar");
        int num = consola.nextInt();
        
        System.out.printf("Tabla de multiplicar del %d:%n", num);
        for(int i = 1;i<=10;i++){
            System.out.printf("%d x %2d= %d%n", num, i,num*i);
            
            consola.close();
            
        }
    }
    
}
