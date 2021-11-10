/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Modulo2;

/**
 *
 * @author Pepe
 */
public class Administrador implements Registro {

    private boolean sessionactivo;
    private String contraseña = "DerlAdmin123";
    private String username = "Admin";

    public Usuario generateUser(String contraseña, String username) {

        Usuario userinstance = new Usuario();
        userinstance.setContraseña(contraseña);
        userinstance.setUsername(username);
        System.out.println("Se creo un usuario...");
        return userinstance;
    }

    @Override
    public boolean login(String contraseña, String username) {
        if (this.isSessionactivo() == false && this.contraseña == contraseña && this.username == username) {
            this.setSessionactivo(true);
            System.out.println("Administrador activo.....");
        } else {
            System.out.println("Contraseña erronea..");
        }
        return this.isSessionactivo();
    }

    @Override
    public boolean logout() {
        if (this.isSessionactivo() == true) {
            this.setSessionactivo(false);
            System.out.println("Administrador inactivo.....");
        }
        return this.isSessionactivo();
    }

    public boolean isSessionactivo() {
        return sessionactivo;
    }

    public void setSessionactivo(boolean sessionactivo) {
        this.sessionactivo = sessionactivo;
    }
}
