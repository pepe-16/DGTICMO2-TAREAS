/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Modulo2;

import java.util.Scanner;

/**
 *
 * @author Pepe
 */
public class Aplicacion {

    private static Administrador admininstance;

    public static Administrador getInstanceAdmin() {
        if (admininstance == null) {
            admininstance = new Administrador();
        }
        return admininstance;
    }
    
    public static void main(String[] args) throws Exception {

        
        getInstanceAdmin().login("DerlAdmin123");
        
        getInstanceAdmin().logout();
        
        
        Usuario us = new Usuario();
        us.newIntrumentoNotarial("Protocolizacion");
        System.out.println(us.instrumento.toString());
        us.instrumento.borrarRegistro();
        us.instrumento.buscarRegistro();
        us.instrumento.capturaRegistro();

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Identificando entorno de ejecucion(browser/windows): ");
//        String operatingEnvironment = scanner.next();
//
//        Application application = new Application();
//
//        try
//        {
//            application.main(operatingEnvironment);
//        }
//        catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
    }
}
