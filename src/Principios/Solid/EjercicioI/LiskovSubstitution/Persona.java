/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principios.Solid.EjercicioI.LiskovSubstitution;

/**
 *
 * @author hallo
 */
public class Persona {
 
    private String dni;
    private String nombre;
    private String apellidos;
    private String tarjeta;
     
     
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
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
    public String getTarjeta() {
        return tarjeta;
    }
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
    public Persona(String dni, String nombre, String apellidos, String tarjeta) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tarjeta = tarjeta;
    }
     
    public void pagar() {
         
        System.out.println("Mi dni es " + getDni()+ " pago con la tarjeta"+tarjeta);
    }
}
