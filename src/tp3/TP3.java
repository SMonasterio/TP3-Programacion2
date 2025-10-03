/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author sofim
 */
public class TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Registro de Estudiantes
        //a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.

        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "Matematicas", 7);

        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(1);
        System.out.println("Subimos calificacion:");
        estudiante1.mostrarInfo();

        estudiante1.bajarCalificacion(2);
        System.out.println("Bajamos calificacion:");
        estudiante1.mostrarInfo();
        
        //2. Registro de Mascotas
        //a. Crear una clase Mascota con los atributos: nombre, especie, edad.

        Mascota mascota1 = new Mascota("Luna", "Perro", 2);

        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        System.out.println("Despues de un anio:");
        mascota1.mostrarInfo();
        
        //3. Encapsulamiento con la Clase Libro
        //a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.

        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        
        // set año invalido
        libro1.setAñoPublicacion(3025);
        //sett año valido
        libro1.setAñoPublicacion(1995);

        System.out.println("Informacion del libro:");
        libro1.mostrarInfo();
        
        //4. Gestión de Gallinas en Granja Digital
        //a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos

        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);

        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        System.out.println("Estado final de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
    
}
