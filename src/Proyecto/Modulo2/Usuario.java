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
public class Usuario extends CreateInstrumentosNotariales implements Registro {

    private boolean sessionactivo = false;
    private String contrasena = "sk_16@16#";
    private String username = "Usuario";

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean login(String contrasena, String username) {
        if (this.isSessionactivo() == false && this.contrasena == contrasena && this.username == username) {
            System.out.println("Usuario activo.....");
            this.setSessionactivo(true);
        }else{
            System.out.println("Contraseña erronea..");
        }
        return this.isSessionactivo();
    }

    @Override
    public boolean logout() {
        if (this.isSessionactivo() == true) {
            this.setSessionactivo(false);
            System.out.println("Usuario inactivo.....");
        }
        return this.isSessionactivo();
    }

    public boolean isSessionactivo() {
        return sessionactivo;
    }

    public void setSessionactivo(boolean sessionactivo) {
        this.sessionactivo = sessionactivo;
    }

    public void newIntrumentoNotarial( String tipo) throws Exception {
       this.initialize(tipo);
    }
}
