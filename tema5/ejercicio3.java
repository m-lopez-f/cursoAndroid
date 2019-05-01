import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        /*
            3.- Crea una String que sea tu nombre completo y guarda en 3 strings diferentes tu nombre, tu
                apellido y tu segundo apellido, y muéstralos en la consola.
        */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre completo: ");
        String allName;
        
        allName = myScanner.nextLine();
        String splitName[];
        splitName=allName.split(" ");
        int i;
        for(i=0;i<3;i++){
            System.out.println(splitName[i]);
        }
    }
}
