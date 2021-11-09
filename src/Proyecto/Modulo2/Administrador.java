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
    private Usuario usuariorefistro;
    private boolean sessionactivo;

    @Override
    public boolean login() {
        if (this.isSessionactivo() == false) {
            this.setSessionactivo(true);
        }
        return this.isSessionactivo();
    }
    @Override
    public boolean logout() {
        if (this.isSessionactivo() == true) {
            this.setSessionactivo(false);
        }
        return this.isSessionactivo();
    }
    public 
    public boolean isSessionactivo() {
        return sessionactivo;
    }

    public void setSessionactivo(boolean sessionactivo) {
        this.sessionactivo = sessionactivo;
    }
    
    
}
