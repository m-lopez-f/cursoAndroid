import java.util.Scanner;
public class scannerNumero {
    public static void main(String[] args) {
        int num, num2;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = myScanner.nextInt();
        Scanner myScanner2 = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num2 = myScanner2.nextInt();
        if (num == num2) {
            System.out.print("Los numeros introducidos son iguales");
        } else if (num > num2) {
            System.out.print("El numero: " + num + " es mayor a: " + num2);
        } else if (num < num2) {
            System.out.print("El numero: " + num2 + " es mayor a: " + num);
        }
        
    }
}