/*
1.- Escribe una clase Alumno con los siguientes atributos:
    Nombre: nombre del alumno. String
    Apellidos: apellidos del alumno. String
    FechaNac: fecha de nacimiento del alumno. String con el formato dd/mm/aaaa
    NotaMedia: nota media de todas las asignaturas del alumno. Double
    NumAsignaturas: número de asignaturas matriculadas por el alumno. Entero
    Y los siguientes métodos:
    Imprimir () – Imprime por pantalla todos los atributos del alumno
    Suspender() – En caso de que la NotaMedia igual o superior a 5, modificarla y situarla en 4.9
    Además has de crear dos constructores: uno por defecto y otro con parámetros. Por último
    crea un procedimiento principal donde declares algunos objetos de esta clase y se muestre la
    utilización de sus métodos.
2.- Modifica el programa anterior encapsulando los atributos para que no sean accesibles
    desde fuera de la clase salvo si se usan los métodos correspondientes set y get.
*/
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Alumno alumno = new Alumno();
        Alumno alumnoConDatos = new Alumno("Felix", "Andreu", "05/07/1980", 5, 3);
        alumno.Imprimir();
        System.out.println("");
        alumnoConDatos.Imprimir();
        alumnoConDatos.Suspender();
        System.out.println("");
        alumnoConDatos.Imprimir();
    }
}

class Alumno {
    private String  nombre;
    private String  apellidos;
    private String  fechaNac;
    private double  notaMedia;
    private int     numAsignaturas;
    
    public Alumno() {
        nombre = "Miguel";
        apellidos = "Areu";
        fechaNac = "08/08/1987";
        notaMedia = 4.8;
        numAsignaturas = 4;
    }
    /* Otro constructor */
    public Alumno(String newNombre, String newApellidos, String newFechaNac, double newNotaMedia, int newNumAsignaturas) {
        nombre = newNombre;
        apellidos = newApellidos;
        fechaNac = newFechaNac;
        notaMedia = newNotaMedia;
        numAsignaturas = newNumAsignaturas;
    }
    /* Metodo que imprime los datos del alumno */
    public void Imprimir() {
        System.out.println("Ficha del Alumno");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Fecha nacimiento: " + fechaNac);
        System.out.println("Nota media: " + notaMedia);
        System.out.println("Numero de asignaturas: " + numAsignaturas);
    }
    public void Suspender() {
        if (notaMedia >= 5) {
            notaMedia = 4.9;
        }
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