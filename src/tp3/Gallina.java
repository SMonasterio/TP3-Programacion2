/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author sofim
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha cumplido un año más. Edad: " + edad);
    }

    public void mostrarEstado() {
        System.out.println("ID Gallina: " + getIdGallina());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Huevos puestos: " + getHuevosPuestos());
    }

}
