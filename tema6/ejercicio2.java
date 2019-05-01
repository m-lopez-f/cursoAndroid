import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        /*
            2.- Escribe un programa que utilice un método para cambiar el valor de una variable entera
                que hemos pasado como parámetro. Concretamente, debe sumar 5 al valor que le hayamos
                pasado. Ese valor debe permanecer cambiado en la variable una vez ejecutada la función así
                que muestra por consola el valor de la variable después de llamar a la función.
        */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int x=myScanner.nextInt();
        System.out.println("El numero introducido es " + x);
        x = sumValue(x);
        System.out.println("El numero tras funcion tiene valor " + x);
        
    }
    public static int sumValue(int n) {
        return n + 5;
    }
}
