public class MyClass {
    public static void main(String args[]) {
        int x=0;
        int y=7;
        while(x < 4){
            y += 3;
            x++;
        }
        /*
        1.- Escribe un bucle que sume 3 a una variable y cuyo valor inicial es igual a 7 y que sume 1 a
            una variable x cuyo valor inicial es igual a 0 y que lo haga mientras x no sea mayor o igual que 4
            usando un bucle while.
        */
        System.out.println("Valor de y = " + y);
        System.out.println("Valor de x = " + x);
    }
}
