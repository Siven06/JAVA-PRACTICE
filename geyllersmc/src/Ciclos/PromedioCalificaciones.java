
package Ciclos;
import java.util.Scanner;
public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Cuantas calificaciones va a ingresar: ");
        int n = consola.nextInt();
        double suma = 0.0;
        for (int i = 1; i <=n; i++){
            System.out.printf("calificacion %d: ", 1);
            suma += consola.nextDouble();
        }
        double promedio = suma / n;
        System.out.printf("El promedio de las %d calificaciones es: %.2f%n", n, promedio);
        consola.close();
    }

    
}
