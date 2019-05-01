import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner myObj=new Scanner(System.in);
        System.out.println("introduzca simbolo de operación: '*, +, -, /'");
    
        String operationSimbolIn=myObj.nextLine();
        char operationSimbol = operationSimbolIn.charAt(0);
        if (operationSimbol != '/' && operationSimbol != '*' && operationSimbol != '+' && operationSimbol != '-') {
            System.out.println("Simbolo incorrecto");
        } else {
            int x;
            System.out.println("elije el primer número");
            Scanner myScanner2 = new Scanner(System.in);
            x=myScanner2.nextInt();
            int y=0;
            System.out.println("elije el segundo número");
            Scanner myScanner3 = new Scanner(System.in);
            y=myScanner3.nextInt();
            int z=0;
            switch(operationSimbol){
                case '*':
                    z=y*x;
                break;
                case '/':
                    z=y/x;
                break;
                case '+':
                    z=y+x;
                break;
                case '-':
                    z=y-x;
                break;
                default:
                    z=4;
            }
            System.out.println(z);
        }
    }
}
