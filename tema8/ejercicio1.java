/*
1.- Modifica el ejercicio del tema anterior para que Alumno herede de la superclase Persona.
    En Persona debe haber nombre, apellidos y fecha de nacimiento mientras que los atributos
    NotaMedia y NumAsignaturas permanecen en Alumno. También tienes que crear un
    constructor por defecto y uno pasándole parámetros tanto para Persona como para Alumno
    usando la palabra super. Por último, sobrecarga las función Imprimir() para que en el caso de
    Persona y en el caso de Alumno muestren todos los datos de cada clase. Prueba los métodos
    en main.
*/
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Alumno alumno = new Alumno();
        Alumno alumnoConDatos = new Alumno("Pedro", "Andres", "01/01/1980", 7, 4);
        alumno.Imprimir();
        System.out.println("");
        alumnoConDatos.Imprimir();
    }
}

class Alumno extends Persona {
    private double  notaMedia;
    private int     numAsignaturas;
    
    public Alumno() {
        super();
        notaMedia = 4.8;
        numAsignaturas = 4;
    }
    /* Otro constructor */
    public Alumno(String newNombre, String newApellidos, String newFechaNac, double newNotaMedia, int newNumAsignaturas) {
        super(newNombre, newApellidos, newFechaNac);
        notaMedia = newNotaMedia;
        numAsignaturas = newNumAsignaturas;
    }
    /* Metodo que imprime los datos del alumno */
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Ficha del Alumno");
        System.out.println("Nota media: " + notaMedia);
        System.out.println("Numero de asignaturas: " + numAsignaturas);
    }
    public void Suspender() {
        if (notaMedia >= 5) {
            notaMedia = 4.9;
        }
    }
    public double getNotaMedia() {
        return notaMedia;
    }
    public void setNotaMedia(double newNotaMedia) {
        notaMedia=newNotaMedia;
    }
    public int getNumAsignaturas() {
        return numAsignaturas;
    }
    public void setNumAsignaturas(int newNumAsignaturas) {
        numAsignaturas=newNumAsignaturas;
    }
}

class Persona {
    private String  nombre;
    private String  apellidos;
    private String  fechaNac;
    
    public Persona() {
        nombre = "Miguel";
        apellidos = "Areu";
        fechaNac = "08/08/1987";
    }
    /* Otro constructor */
    public Persona(String newNombre, String newApellidos, String newFechaNac) {
        nombre = newNombre;
        apellidos = newApellidos;
        fechaNac = newFechaNac;
    }
    /* Metodo que imprime los datos del alumno */
    public void Imprimir() {
        System.out.println("Ficha de la persona");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Fecha nacimiento: " + fechaNac);
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String newNombre) {
        nombre=newNombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String newApellidos) {
        apellidos=newApellidos;
    }
    public String getFechaNac(){
        return fechaNac;
    }
    public void setFechaNac(String newFechaNac) {
        fechaNac=newFechaNac;
    }
}