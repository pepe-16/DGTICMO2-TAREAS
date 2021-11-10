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
public class Administrador implements Registro{
    private boolean sessionactivo;
    private String contraseña = "DerlAdmin123";
    private String username = "Admin";
    @Override
        public boolean login(String contraseña) {
        if (this.isSessionactivo() == false && this.contraseña == contraseña) {
            this.setSessionactivo(true);
            System.out.println("Administrador activo.....");
        }else{
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
