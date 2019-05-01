import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        /*
            4.- Crea una String con el siguiente texto: Esto es una cadena. Muestra en pantalla la cadena
                completa, y luego sustituye todas las a por una e. Finalmente, muestra la frase corregida por
                consola.
        */
        String cadena = "Esto es una cadena";
        System.out.println("La variable cadena contiene: " + cadena);
        String cadenaReplace = cadena.replaceAll("a", "e");
        System.out.println("La variable cadena tras el cambio contiene: " + cadenaReplace);
    }
}
