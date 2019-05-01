import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        /*
            1.- Crea un array de habitaciones con 7 elementos enteros e inicialízalos a los valores que
                desees. Luego, cambia el valor del elemento 5 por otro valor. Luego comprueba si el valor del
                elemento 1 es igual al del 6. Muestra ambos arrays por consola al igual que el resultado de la
                comprobación.
        */
        int habitaciones[];
        habitaciones=new int[7];
        habitaciones[0]=3;
        habitaciones[1]=5;
        habitaciones[2]=77;
        habitaciones[3]=8;
        habitaciones[4]=7;
        habitaciones[5]=2;
        habitaciones[6]=1;
        
        
        // Cambiando el valor de la posición 5
        habitaciones[4]=56;
        System.out.println("el valor del elemento 5 es: " + habitaciones[4]);
        System.out.println("el valor del elemento 1 con valor: " + habitaciones[0] + " es igual al elemento 6 con valor: " + habitaciones[5] + " resultado: " + (habitaciones[0] == habitaciones[5]));
    }
}
