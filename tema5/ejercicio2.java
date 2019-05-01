import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        /*
            2.- Usando el anterior array, inicializa todos sus elementos a 0 excepto el último usando un
                bucle for. Muestra el array por consola.
        */
        int habitaciones[];
        habitaciones=new int[7];
        int i;
        for(i=0;i<6;i++){
            habitaciones[i]=0;
            System.out.println("el valor del elemento con posición: " + i + " es: " + habitaciones[i]);
        }

        System.out.println("el valor del ultimo elemento es: " + habitaciones[6]);
    }
}
