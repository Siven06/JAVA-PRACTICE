
package Ciclos;
import java.util.Scanner;
public class BuscarArreglos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[]datos = {5,8,2,9,3,7,1};
        System.out.println("Introduce un numero a buscar en el arreglo: ");
        int clave = consola.nextInt();
        boolean encontrado = false;
        for(int i = 0; i<datos.length; i++){
            if(datos[i]==clave){
                System.out.printf("Numero %d encontrado en la posicion %d.%n", clave, i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.printf("Numero %d NO se encontro en el arreglo.%n",clave);
        }
        consola.close();
    }
    
}
