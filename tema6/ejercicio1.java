import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        /*
            4.- Crea una String con el siguiente texto: Esto es una cadena. Muestra en pantalla la cadena
                completa, y luego sustituye todas las a por una e. Finalmente, muestra la frase corregida por
                consola.
        */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Introduzca un numero para comprobar si es par o impar");
        int x=myScanner.nextInt();
        String returned = parInpar(x);
        System.out.println("El numero introducido es : " + returned);
    }
    public static String parInpar(int n) {
        return ((n % 2) == 0) ? "par" : "impar";
    }
}
