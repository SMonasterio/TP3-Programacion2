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
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "Matematicas", 7);

        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(1);
        System.out.println("Subimos calificacion:");
        estudiante1.mostrarInfo();

        estudiante1.bajarCalificacion(2);
        System.out.println("Bajamos calificacion:");
        estudiante1.mostrarInfo();
    }
    
}
