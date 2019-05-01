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
    String  nombre;
    String  apellidos;
    String  fechaNac;
    double  notaMedia;
    int     numAsignaturas;

    Alumno() {
        nombre = "Miguel";
        apellidos = "Areu";
        fechaNac = "08/08/1987";
        notaMedia = 4.8;
        numAsignaturas = 4;
    }
    /* Otro constructor */
    Alumno(String newNombre, String newApellidos, String newFechaNac, double newNotaMedia, int newNumAsignaturas) {
        nombre = newNombre;
        apellidos = newApellidos;
        fechaNac = newFechaNac;
        notaMedia = newNotaMedia;
        numAsignaturas = newNumAsignaturas;
    }

    void Imprimir() {
        System.out.println("Ficha del Alumno");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Fecha nacimiento: " + fechaNac);
        System.out.println("Nota media: " + notaMedia);
        System.out.println("Numero de asignaturas: " + numAsignaturas);
    }
    void Suspender() {
        if (notaMedia >= 5) {
            notaMedia = 4.9;
        }
    }
}