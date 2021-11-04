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
public class Adulto extends Persona {
 
     
    public Adulto(String nombre, String apellidos, String dni, String tarjeta) {
        super(nombre, apellidos);
        this.dni = dni;
        this.tarjeta = tarjeta;
    }
 
    private String dni;
    private String tarjeta;
 
     
    public String getDni() {
        return dni;
    }
 
    public void setDni(String dni) {
        this.dni = dni;
    }
 
    public String getTarjeta() {
        return tarjeta;
    }
 
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
 
    public void pagar() {
 
        System.out.println("mi dni es " + getDni() + "pago con la tarjeta" + tarjeta);
    }
}