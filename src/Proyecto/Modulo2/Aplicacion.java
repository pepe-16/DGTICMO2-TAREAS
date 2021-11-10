/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Modulo2;

import java.util.InputMismatchException;
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
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        String contraseña;
        String loginnom;

        String nomuser;
        String conuser;
        String instru;

        do {
            System.out.println("1. Iniciar cesion como administrador y crear un usuario...");
            System.out.println("2. Registrar algun instruemnto notarial");
            System.out.println("3. Salir");
            try {
                System.out.println("Escribe una de las opciones: ");
                opcion = sn.nextInt();
                sn.nextLine();
                switch (opcion) {
                    case 1:

                        System.out.println("Ingrese el nombre del admin: ");
                        loginnom = sn.nextLine();
                        System.out.println("Ingrese la contrase del admin: ");
                        contraseña = sn.nextLine();

                        getInstanceAdmin().login(contraseña, loginnom);

                        System.out.println("Ingrese el nombre del usuario: ");
                        nomuser = sn.nextLine();
                        System.out.println("Ingrese la contrasena del usuario: ");
                        conuser = sn.nextLine();

                        getInstanceAdmin().generateUser( conuser, nomuser);

                        break;
                    case 2:

                        Usuario us = new Usuario();
       
                        System.out.println("Ingrese el tipo de instrumento notarial que deseas crear...");
                        instru = sn.nextLine();
                        us.newIntrumentoNotarial(instru);
                        System.out.println(us.instrumento.toString());
                        us.instrumento.borrarRegistro();
                        us.instrumento.buscarRegistro();
                        us.instrumento.capturaRegistro();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        } while (!salir);
    }
}
