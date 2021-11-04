package Principios.Solid.EjercicioI.LiskovSubstitution;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hallo
 */
public class Niño extends Persona {

    public Niño(String nombre, String apellidos) {
        super(null, nombre, apellidos, null);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void pagar() {
        // TODO Auto-generated method stub
        throw new RuntimeException("un niño no puede pagar");
    }
}
