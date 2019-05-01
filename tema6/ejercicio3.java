import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        /*
            3.- Escribe un programa que utilice un método que muestre por pantalla la tabla de multiplicar
                de un número dado por el usuario.
        */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int x=myScanner.nextInt();
        System.out.println("La tabla de multiplicar del numero " + x);
        tablaMultiplicar(x);
    }
    public static void tablaMultiplicar(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println( n + "x" + i + "=" + (n*i));
        }
    }
}
