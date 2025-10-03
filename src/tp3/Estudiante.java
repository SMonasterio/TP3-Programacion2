package tp3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sofim
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;
   
    public Estudiante(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Curso: " + getCurso());
        System.out.println("Calificación: " + getCalificacion());
        System.out.println("----------------------------");
    }

    public void subirCalificacion(int nota) {
        setCalificacion(this.calificacion + nota);
    }

    public void bajarCalificacion(int nota) {
        setCalificacion(this.calificacion - nota);
    }
    
}
