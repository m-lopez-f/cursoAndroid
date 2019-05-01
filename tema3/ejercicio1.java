import java.util.Scanner;
public class scannerNumero {
    public static void main(String[] args) {
        int num;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = myScanner.nextInt();
        if (num == 10) {
            System.out.print("Su número es igual a 10");
        } else if (num > 10) {
            System.out.print("Su número es mayor a 10");
        } else if (num < 10) {
            System.out.print("Su número es menor a 10");
        }
        
    }
}