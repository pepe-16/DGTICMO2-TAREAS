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
public class Niño extends Persona {

    private Adulto tutor;

    public Niño(String nombre, String apellidos, Adulto tutor) {
        super(nombre, apellidos);
        this.tutor = tutor;
    }

    public Adulto getTutor() {
        return tutor;
    }

    public void setTutor(Adulto tutor) {
        this.tutor = tutor;
    }

}
