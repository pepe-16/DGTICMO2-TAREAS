/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principios.Solid.EjercicioI.DependencyInversion;

/**
 *
 * @author Pepe
 */
/**}
 * 
 * @ Hace las funciones de la lógica de negocio
 */
public class ServicePerson {

    public void savePerson(Person person) {
        /**
         * el problema radica cuando en lugar de guardar en la base de datos Mysql 
         * quieres guardar en Oracle o en lugar de guardarlo en base de datos quieres
         * tratarlo de otra manera.
         */
        MySql mysql = new MySql(); //Se genera un acoplamiento(dependecia de calses).
        mysql.savePerson(person);
    }

}
