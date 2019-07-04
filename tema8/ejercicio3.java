/*
3.- En la clase anterior, implementa un método EditarUsuario en la clase Telefono que pida al usuario por consola los nuevos datos y los coloque en sus atributos correspondientes.
Dependiendo de la clase, el método pedirá al usuario más o menos datos.
Crea un método EditarUsuario en Smartphone que sobrecargue el anteriormente creado y solo edite SistOp. Pruéba los métodos en la función main. 

*/
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Telefono telefono = new Telefono();
        Telefono telefonoConDatos = new Telefono("Pedro Andres", 587894562);
        telefono.Imprimir();
        System.out.println("");
        telefonoConDatos.Imprimir();
        
        System.out.println("");
        System.out.println("");
        
        Movil movil = new Movil();
        Movil movilConDatos = new Movil("Alvaro Montes", 789446656,"P3", "Huawey");
        movil.Imprimir();
        System.out.println("");
        movilConDatos.Imprimir();
        
        System.out.println("");
        System.out.println("");
        
        Smartphone smartphone = new Smartphone();
        Smartphone smartphoneConDatos = new Smartphone("Pedro Mario", 88464648, "M5", "Xiaomi", "Android", 6.0);
        smartphone.Imprimir();
        System.out.println("");
        smartphoneConDatos.Imprimir();
        
        System.out.println("");
        System.out.println("");
        
        telefono.EditarUsuario();
        System.out.println("");
        System.out.println("");
        telefono.Imprimir();
        
        
        System.out.println("");
        System.out.println("");
        
        smartphone.EditarUsuario();
        System.out.println("");
        System.out.println("");
        smartphone.Imprimir();
    }
}

class Smartphone extends Movil {
    private String sistOp;
    private double version;
    
    public Smartphone() {
        super();
        sistOp = "Android";
        version = 9.04;
    }
    /* Otro constructor */
    public Smartphone(String newNombre, long newNumero, String newModelo, String newCompannia, String newSistOp, double newVersion) {
        super(newNombre, newNumero, newModelo, newCompannia);
        sistOp = newSistOp;
        version = newVersion;
    }
    /* Metodo que imprime los datos del alumno */
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Ficha del Smartphone");
        System.out.println("Sistema Operativo: " + sistOp);
        System.out.println("Version: " + version);
    }
    
    public void EditarUsuario() {
        Scanner myScannerNom = new Scanner(System.in);
        System.out.println("Introduce nuevo Sistema Operativo: ");
        sistOp = myScannerNom.nextLine();
    }
    
    public String getSistOp() {
        return sistOp;
    }
    public void setNotaMedia(String newSistOp) {
        sistOp=newSistOp;
    }
    public double getVersion() {
        return version;
    }
    public void setVersion(double newVersion) {
        version=newVersion;
    }
    
}

class Movil extends Telefono {
    private String  modelo;
    private String  compannia;
    
    public Movil() {
        super();
        modelo = "m3";
        compannia = "Samsung";
    }
    /* Otro constructor */
    public Movil(String newNombre, long newNumero, String newModelo, String newCompannia) {
        super(newNombre, newNumero);
        modelo = newModelo;
        compannia = newCompannia;
    }
    /* Metodo que imprime los datos del alumno */
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Ficha del Movil");
        System.out.println("Modelo: " + modelo);
        System.out.println("Compañia: " + compannia);
    }

    public String getModelo() {
        return modelo;
    }
    public void setNotaMedia(String newModelo) {
        modelo=newModelo;
    }
    public String getCompannia() {
        return compannia;
    }
    public void setCompannia(String newCompannia) {
        compannia=newCompannia;
    }
}

class Telefono {
    private String  nombre;
    private long    numero;
    
    public Telefono() {
        nombre = "Pepito Grillo";
        numero = 655478555;
    }
    /* Otro constructor */
    public Telefono(String newNombre, long newNumero) {
        nombre = newNombre;
        numero = newNumero;
    }
    
    public void EditarUsuario() {
        Scanner myScannerNum = new Scanner(System.in);
        System.out.print("Introduzca tu número: ");
        numero = myScannerNum.nextInt();
        
        Scanner myScannerNom = new Scanner(System.in);
        System.out.println("Introduce tu nombre completo: ");
        nombre = myScannerNom.nextLine();
    }
    public void Imprimir() {
        System.out.println("Ficha del Telefono");
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero: " + numero);
    }
    public long getNumero() {
        return numero;
    }
    public void setNumero(long newNumero) {
        numero=newNumero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String newNombre) {
        nombre=newNombre;
    }
}
