/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principios.Solid.EjercicioF.LiskovSubstitution;
/**
 *
 * @author hallo
 */
public class Persona {

    private String nombre;
    private String apellidos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos) {
        super();

        this.nombre = nombre;
        this.apellidos = apellidos;

    }
}
