package Ciclos;

import java.util.Scanner;

public class SumaNaturales {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce el numero entero positivo N: ");
        int N = consola.nextInt();
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        // La corrección está aquí: %n en lugar de $n
        System.out.printf("La suma de los primeros %d numeros naturales es: %d%n", N, suma);
        consola.close();
    }
}

