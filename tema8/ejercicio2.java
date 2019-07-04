/*
2.- Crea una clase Telefono que tenga los atributos privados Propietario (string) y Numero
(long) con sus constructores (por defecto y parámetro) y sus métodos get y set. Luego crea una
clase que herede de Telefono que sea Movil y añada los atributos Modelo (string) y Compannia
(string). Luego crea una clase que herede de Movil que sea Smartphone y añada el atributo
SistOp (string) y que puede ser Android, iOS, Blackberry, Windows Phone… y Version (double).
Crea los constructores, sets y gets de cada clase. Crea el método Imprimir() y utilízalo en un
main para ver los atributos de los tres objetos.
*/

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
