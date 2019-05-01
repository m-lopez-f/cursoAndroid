import java.util.Scanner;
public class scannerNumero {
    public static void main(String[] args) {
        int x,y,i,j;
        y=10;
        j=2;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        x = myScanner.nextInt();
        Scanner myScanner2 = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        i = myScanner2.nextInt();
        if ((x+y) == (i+j)) {
            System.out.print("la suma de x, y, i y j es: " + (x + i + j + y));
        } else if ((x == y) && (i == j)) {
            System.out.print("la suma de i y j es: " + (i + j));
        } else if ((x == y) && (i != j)) {
            System.out.print("la resta de i y j es: " + (i - j));
        } else {
            System.out.print("la multiplicacion de x e y es: " + (x * y));
        }
        /*
        - Si la suma de x e y es igual a la suma de i y j, se mostrará por pantalla la suma de x, y, i y j.
        - Si x e y son iguales e i y j son iguales, se mostrará por pantalla la suma de i y j.
        - Si x e y son iguales e i y j son diferentes, se mostrará la resta de i y j.
        - Para cualquier otro caso, se mostrará por pantalla la multiplicación de x e y.
        
        */
    }
}