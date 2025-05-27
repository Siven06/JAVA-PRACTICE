
package Ciclos;
import java.util.Scanner;
import java.util.Arrays;
public class InvertirArreglo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("¿Cuantas palabras va a ingresar? ");
        int n = consola.nextInt();
        consola.nextLine();
        String[] palabras = new String[n];
        
        for(int i = 0; i <n; i++){
            System.out.printf("Palabra %d: ", i + 1);
            palabras[i] = consola.nextLine();
        }
        System.out.println("Arreglo original: " + Arrays.toString(palabras));
        //invertimos el arreglo
        for(int i = 0; i < n/2; i++){
        String temp = palabras[i];
            palabras[i] = palabras[n - 1 -i];
            palabras[n - 1 - i] = temp;
        }
        System.out.println("Arreglo invertido: " + Arrays.toString(palabras));
        consola.close();
    }
    
}
